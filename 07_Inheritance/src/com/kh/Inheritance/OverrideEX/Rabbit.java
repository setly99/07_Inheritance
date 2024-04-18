package com.kh.Inheritance.OverrideEX;

public class Rabbit extends Animal {
	
	public Rabbit(String name) {
		super(name);
	}
	
	@Override
	public void voice() {
		System.out.println(name + "이 낑낑 소리를 냅니다.");
	}

}
