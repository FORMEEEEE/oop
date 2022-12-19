package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack(); // 필드 new생성자
	
	
	public SnackController() {} //생성자
		
	//메서드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		
		return "저장완료 정보를 확인하시겠습니까? (y/n)";
	}
	
	public String confirmData() { //string형은 return값이 있어야됨
		
		
		return s.information();
	}
		
	
}
