package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { // 클래스
	//속성(필드) 
	// 필드는 기본적으로 캡슐화 원칙에 의해 private이라는 접근제한자를 꼭 작성
	// 필드에 변수를 하나 작성하면, 클래스 안에서 어디에서든 사용 가능
	private Scanner sc = new Scanner(System.in);
				   // system.in : 자바에서 기본적으로 저장해둔 입력장치(키보드)
	
	private Member memberInfo = null; //가입할 회원의 정보를 저장할 변수
	private Member loginMember = null; //로그인한 회원의 정보를 저장할 변수
	
	//기능(생성자,메서드)
	// ** 여러 기능을 하나의 메소드에 모두 작성하지 말 것
	// 되도록 하나의 기능만 수행되도록 작성
	// 메소드는 메소드당 딱 하나의 기능만 가지고있는게 좋다
	
	//why
	//기능별로 세분화 해놔야 필요한 기능만 호출하여 쓸 수 있다
	//public void today() 
//	{
		// 1. 밥먹는 행위
		// 2. 일하는 행위
	//}
	
	//public void eat() {}
	//	public void work() {}
	// 두가지를 나눠서 메소드를 만들고
	// eat(); work(); 하나씩 불러서 쓸 수 있게 된다
	
	public MemberService() {}
	// public MemberService(int a){} // 기본생성자 미작성시 에러
	
	//** 메서드 작성법 ** 
	
	//[접근제한자]      [예약어]      반환형           메소드명([매개변수]) {}
	// public		 static		 기본자료형
//	  protected		 final		참조형(배열,클래스)
	//(default)		abstract      void
	//	  private	  static final


	// ** 반환형 void **	
	// 반환(return)이란? 메서드 수행 후 호출부로 돌아가는것
	// - 반환 값 : 돌아가면서 가져갈 결과 값
	// - 반환 형 : 반환 값의 자료형
	// ->(텅빈,없는,무효의) : 돌려보낼 값(반환 값)이 없다
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		//일은 하는데 결과값은 없음
		int menuNum = 0; //지역 변수
		
		do{
			System.out.println("======회원 정보 관리 프로그램======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 >>>");
			menuNum = sc.nextInt(); //필드에 작성된 scanner sc사용
			sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(logIn() );break;
			case 3 : break;
			case 4 : break;
			case 0 : break;
			default : System.out.println("숫자좀 잘눌러");
			}
			
			
		}while(menuNum != 0); //menunum이 0이면 종료
	}
	
	// 회원 가입 기능 
	public String signUp() {
		// (반환형)
		System.out.println("*****회원 가입*****");
		
		System.out.print("아이디 : ");
		String memberId = sc.next(); // user11
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberRpw = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		
		
		
		// 비밀번호, 비밀번호 확인 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		
		if(memberPw.equals(memberRpw) ) {// string일때 equals로 비교 ==사용한함
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			return "회원가입 성공";
		}else {
			return "회원가입 실패";
		}
		
		
		
		
	}
	
	// 로그인 메서드(기능)
	public String logIn() {
		System.out.println("******로그인******");
		
		//회원가입을 했는지부터 확인
		// == memberInfo가 객체를 참조하고 있는지 확인
		if(memberInfo == null) {
			return "회원가입부터 해라";
		}
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId()) &&
			memberPw.equals(memberInfo.getMemberPw()) ){
			
			
			loginMember = memberInfo;
			
			
			
			return loginMember.getMemberName() + "님 환영합니다";
			
		} else {
			return "아이디 또는 비밀번호가 일치하지 않음";
		}
	}
	// 회원 정보 조회 기능
	// 회원 정보 수정(update) 기능
	
	















}
