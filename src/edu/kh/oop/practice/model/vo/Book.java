package edu.kh.oop.practice.model.vo;

public class Book {
	// 필드
	private String title;
	private int price;
	private double discountRate;
	private String auther;
	
	//기본생성자 > book은 class명이랑 똑같이씀
	public Book() {
	} //alt shift s > constructer using field 사용 >> 매개변수 생성자
	public Book(String title, int price, double discountRate, String auther) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.auther = auther;
	}
	//메소드
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public double getdiscountRate() {
		return discountRate;
	}
	public void setdiscountRate(double discountRage) {
		this.discountRate = discountRage;
	}
	public String getauther() {
		return auther;
	}
	public void setauther(String auther) {
		this.auther = auther;
	}
	// 어노테이션 tostring()오버라이딩
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + auther; 
		//이게 오버라이딩 시스템에 원래있는것을 재정의하는것
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
