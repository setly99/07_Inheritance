package com.kh.Inheritance.OverrideEX;

public class Animal {
//필드
	String name; // alt + shift + s : getter setter
//메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//생성자
	public Animal() {
		
	}
	
	//생성자 : 필수
	public Animal(String name) {
		this.name = name;
	}
	
	//void : 반환하는 값 없이 출력만진행
	public void voice() {
		System.out.println("동물이 소리를 냅니다.");
	}
	
	
}
