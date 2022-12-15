package edu.kh.oop.cls.model.vo;

public class User {
	//필드
	//== 속성
	
	// 아이디, 비밀번호, 이름, 나이, 성별 >> 추상화
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
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
		
	}
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
	// ** 사용되는 기술, 변수 : 매개변수 , overloading(오버로등), this
	
	//** 매개변수 : 생성자나 메서드 호출 시()안에 작성되어
				//전달되어지는 값을 저장하는 변수 
				// - 전달 받은 값을 저장하고있는 매개체(지니고있는) 역활의 변수
	
	public User( String userId, String userPw) {
					// test33, rrr
		this.userId = userId; // test33
		this.userPw = userPw; // rrr
	}
	

}
