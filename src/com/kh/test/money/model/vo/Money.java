package com.kh.test.money.model.vo;

public class Money {
	
	public final static String UNIT = "원"; //밑줄있으면 static써야됨 대문자로 전부되어있으면 final써야됨
	private int money;
	
	public Money() {};
	
	
	public Money(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static String getUnit() {
		return UNIT;
	}

	public void print() {
		
	}
	
	
	
}
