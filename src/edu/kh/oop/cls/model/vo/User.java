package edu.kh.oop.cls.model.vo;

public class User {
	//필드
	//== 속성
	
	// 아이디, 비밀번호, 이름, 나이, 성별 >> 추상화
	
	private String userId; //인스턴스 변수임
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	//필드안에 있어야 인스턴스 변수임
	//생성자
	// 기본생성자
	public User() {
		//기능
		System.out.println("기본 생성자로 user객체 생성");
		// 필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "류정훈";
		userAge = 20;
		userGender = 'M';
		//기본생성자에서 기본값 생성
	}
	
// ** 자바 **
// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용하지 않음
		
// ***오버로딩(over loading)***
// 1) 메서드 (생성자 포함)의 이름이 동일
// 2) 매개변수의 개수, 타입, 순서 중 1개라도 달라야함
			
// public user(){} // 기본 생성자가 이미 작성되어있어 중복으로 인식
			
	
	public User(String userId) {} // 매개변수의 개수가 같은 생성자 없음
									// 오버로딩 성립
	
	public User(int userAge) {} //매개변수 개수는 같지만 타입이 다름
									//오버로딩 성립
	
	public User(String userId, int userAge) {}
	//매개변수의 개수가 위에 같은것이 있으나 매개변수의 타입이 다름
	// 오버로딩 성립
	public User(int userAge, String userId) {}
	//매개변수의 개수와 타입은 같으나, 순서가 다름 > 오버로딩 성립
	
	// public User(int userAge, String userName){}
	//매개변수의 개수,타입,순서가 모두 같아서 오버로딩 불가
	// 변수명은 신경쓰지 않는다
	
	public User(String userId, String userPw, String userName) {}
	
	
	
	
	
	//메서드
	//캡슐화로 인한 간접 접근 기능(getter/setter)
	public String getUserId() {
	//반환할 값의 자료형을 써야됨 int면 int써야됨
		return userId;
	}
	
	public void setUserId(String userId) {
		//매게변수 쓸때도 자료형 같아야됨 + 뒤에 변수는 안같아도됨
		this.userId = userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	//alt shift s > generated getter setter > generated
	public char getUserGender() {
		return userGender;
	}
	public void SetUserGender(char userGender) {
		this.userGender = userGender;
	}
	//매개변수 생성자
	// ** 사용되는 기술, 변수 : 매개변수 , overloading(오버로드), this
	
	//** 매개변수 : 생성자나 메서드 호출 시()안에 작성되어
				//전달되어지는 값을 저장하는 변수 
				// - 전달 받은 값을 저장하고있는 매개체(지니고있는) 역활의 변수
	
	public User(String userId, String userName) {
					// test33, rrr
		this.userId = userId; // test33
		this.userPw = userPw; // rrr
		
		// - 매개변수로 전달받은 값을 필드에 초기화 하는 용도(this 참조변수)
		
		// *** this 참조 변수 ***
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
		// - 모든 객체 내부에 숨겨져있다
		// 사용하는 이유
		// -> 필드명과 매개변수명이 같을경우
		//		이를 구분하기 위해서 주로 사용
	}
	// 필드를 전부 초기화 하는 목적의 매개변수 생성자

		
	public User( String userId, String userPw,String userName, int userAge, char userGender) {
		
		//this.userId = userId;
		//this.userPw = userPw;
		// 위에서 초기화했던 id pw는 묶어서 쓸 수 있음
		this(userId, userPw); //this(생성자) 
		// - 같은 클래스의 다른 생성자를 호출할 때 사용
		//  - 생성자내 반드시 첫번째 줄에 작성되야함
		// 사용이유
		// 코드길이 감소, 재사용성 증가, 가독성문제로 잘 사용하지 않음
		
		this.userAge = userAge;
		this.userGender = userGender;
		this.userName = userName;
		
		// ** 자바 **
		// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용하지 않음
		
		// ***오버로딩(over loading)***
		// 1) 메서드 (생성자 포함)의 이름이 동일
		// 2) 매개변수의 개수, 타입, 순서 중 1개라도 달라야함
		
		// public user(){} // 기본 생성자가 이미 작성되어있어 중복으로 인식
		
		
		
		
		
		
	}
		
	

}
