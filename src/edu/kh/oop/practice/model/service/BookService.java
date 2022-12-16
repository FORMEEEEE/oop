package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		Book info1 = new Book();
		Book info2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		System.out.println(info1.toString());
		System.out.println(info2.toString());
		System.out.println("=====================");
		
		System.out.println("수정된 결과 확인");
		
		info1.settitle("c언어");
		info1.setdiscountRate(0.1);
		info1.setauther("홍길동");
		info1.setprice(30000);
		System.out.println(info1.toString());
		
		System.out.println("=====================");
		
		//할인된 가격 = 가격-(가격*할인율)
		
		System.out.printf("도서명 = %s\n",info1.gettitle());
		System.out.printf("할인된 가격 = %d\n",(int)(info1.getprice() - (info1.getprice() * info1.getdiscountRate())));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
