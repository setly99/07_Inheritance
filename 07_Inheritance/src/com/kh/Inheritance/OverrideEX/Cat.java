package com.kh.Inheritance.OverrideEX;

public class Cat extends Animal{
	
	//생성자 : 필수
	public Cat(String name) {
		super(name);
	}
	
	//동물의 소리를 가지고 와서 고양이 소리로 변경
	@Override
	public void voice() {
		System.out.println(name + "이 야옹 소리를 냅니다.");
	}

}
