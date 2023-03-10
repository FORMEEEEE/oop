package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService {

	public void ex1() {
		Student std = new Student(); //  std는 참조변수
		// public class인 Student는 import 가능
		
		
	   //TestVo test = new TestVo
		// (default) class인 TestVo는 import불가(다른패키지여서)
		
		
		System.out.println(std.v1);
		//다른 패키지에서도 접근가능한 public만 에러가 없다
		
	}
	
	public void ex2() {
		//static 필드 확인 예제
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schoolName); //.찍어서 하는 직접 접근
		//public 이기 때문에 직접 접근 가능
		System.out.println("변경전 : " + std1.getname());
		std1.setname("류정훈");
		System.out.println(std1.getname()); //name이 student에서 private이기 때문에 std1.name이 아닌 st1.getname을 통해 간접접근
		
		System.out.println(std2.schoolName);
		//public 이기 때문에 직접 접근 가능
		
		System.out.println("변경전 : " + std1.schoolName);
		std1.schoolName = "kh고등학교";
		System.out.println(std1.schoolName);
		
		// schoolName에 노란줄이 뜨는 이유 = 제데로 작성안함 돌아는가긴함
		
		//*** static이 붙은 필드(변수)는
		// 클래스명.변수명 으로 사용함
		
		Student.schoolName = "kh";
		System.out.println("Student.schoolName : " + Student.schoolName);
		
		
		/*	static
		 * 
		 * 1) 공유 메모리 영역(또는 정적 메모리 영역)이라고 함
		 * 
		 * => 프로그램 시작 시 static이 붙은 코드들이
		 * 모두 static 영역에 생성되고
		 * 프로그램 종료될 때 까지 사라지지 않음(정적)
		 * 그리고 static 영역에 생성된 변수는 어디든지 공유가능(공유)
		 * 
		 * 
		 * 2) 사용법 : 클래스명.변수명
		 * 
		 * */
		
		
		
		
		
		
	}
	public void game() {
		
		//TestVo character = new TestVo();
		
			
		
	}
	
	
	
	
	
	public void ex3() {
		//생성자 확인 테스트
				//참조변수 s1
		Student s1 = new Student(); //student라는 객체 생성 > iv 인스턴스라는뜻
						//Student() 가 기본생성자
		
		// User 기본 생성자를 이용해서 객체 생성
		User u1 = new User();
		User u2 = new User();
			//u1은 지역변수
		// User 객체 필드 초기화 확인
		System.out.println(u1.getUserName() );
		System.out.println(u1.getUserGender() );
		System.out.println(u1.getUserAge() );
		System.out.println(u1.getUserPw() );
		System.out.println(u1.getUserId() );
		// 클래스에서 메서드 getter/setter미작성해서 간접접근 불가능 -> getName사용불가
		
		
		System.out.println("===================================");
		
		//문제점 : u1이 참조하고있는 User객체와
		// 		u2가 참조하고있는 User객체가 필드의 값이 모두 동일
		//		같은 기본생성자로 User객체 생성했기 때문
		
		// 해결 방법 1: setter를 이용한 새로운 값 대입
		
		u2.setUserId("111");
		u2.setUserPw("111222");
		u2.setUserName("홍길동");
		u2.setUserAge(15);
		u2.SetUserGender('F');
		
		System.out.println(u2.getUserName() );
		System.out.println(u2.getUserGender() );
		System.out.println(u2.getUserAge() );
		System.out.println(u2.getUserPw() );
		System.out.println(u2.getUserId() );
		
		System.out.println("==========================================");
		User u3 = new User("test33", "rrrrrrrrrrr");
		System.out.println(u3.getUserName() );
		System.out.println(u3.getUserGender() );
		System.out.println(u3.getUserAge() );
		System.out.println(u3.getUserPw() );
		System.out.println(u3.getUserId() );//여기서 시작하면 user.java로 이동
		User u4 = new User("test313", "rrrrrrr1rrr");
		
		
	}
}
