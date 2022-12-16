package edu.kh.oop.cls.model.vo;

 class TestVo {
	 
	 private int str;
	 private int dex;
	 private int lux;
	 private int hp;
	 
	 // 접근제한자 default : 같은 패키지 내에서만 import 가능
	 public TestVo() {
		
		 int str = 50;
		 int dex = 30;
		 int lux = 40;
		 int hp = 50000;
	 
	 }
	 
	 public int getstr() {
		return str;
	 }
	 public void setstr(int str) {
		 this.str = str;
	 }
	 public int getdex() {
		 return dex;
	 }
	 public void setdex(int dex) {
		 this.dex = dex;
	 }
	 public int getlux() {
		 return lux;
	 }
	 public void setlux(int lux) {
		 this.lux = lux;
	 }
	 public int gethp() {
		 return hp;
	 }
	 public void sethp(int hp) {
		 this.hp = hp;
	 }
	 
	 
	 
	 
	 
	 
}
