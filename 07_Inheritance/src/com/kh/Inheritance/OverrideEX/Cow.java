package com.kh.Inheritance.OverrideEX;

public class Cow extends Animal{
	
	public Cow(String name) {
		super(name);
		
	}
	
	@Override
	public void voice() {
		System.out.println(name + "이 음메 소리를 냅니다.");
	}

}
