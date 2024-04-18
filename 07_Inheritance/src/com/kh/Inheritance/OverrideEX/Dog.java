package com.kh.Inheritance.OverrideEX;

public class Dog extends Animal{
	
	/*
	 
	 super(name)
	 Animal 클래스 Animal 생성자를 호출하는 역할
	 super() : 자바에서 자식 클래스의 생성자는 반드시 상위 클래스의 생성자를 호출
	 	호출할 때 super 호출하면 상위 클래스의 생성자 호출 가능
	 */
	public Dog() {
		
	}
	
	public Dog(String name) {
		super(name);
	}
	
	/*
	 @Override : 부모클래스에서 부모가 가진 메서드를 다시 작성하거나 수정해서
	 정의내릴 때 사용, 필수로 작성하는 것은 아니지만, 작성을 해줌으로 인해서
	 부모클래스에서 가지고와서 수행했다는 개발자적 표시를 해주는 것.
	 */
	@Override
	public void voice() {
		System.out.println(name + "이 멍멍 짖습니다.");
	}

}
