package com.kh.Inheritance.OverLoadingEX;

public class Run {
	//main은 오버로딩x 오버라이딩x
	public static void main(String[] args) {

		//사람1 : 홍길동
		Person p1 = new Person();
		p1.setName("홍길동");
		//사람2 : 박영희
		Person p2 = new Person("박영희");
		//사람3 : 김철수
		Person p3 = new Person("김철수",17);
		
		p1.displayInfo();
		p2.displayInfo();
		p3.displayInfo();
	}

}
