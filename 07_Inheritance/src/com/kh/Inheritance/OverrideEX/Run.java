package com.kh.Inheritance.OverrideEX;
/*ㅂ+한자
 동물
   └강아지
   └고양이
   
 
 */
public class Run {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("멍멍이");
		dog1.voice();
		
		Cat cat1 = new Cat("고영희");
		cat1.voice();
		
		//소 음메 토끼 낑낑
		
		Cow cow1 = new Cow("소1");
		cow1.voice();
		
		Rabbit rabbit1 = new Rabbit("토끼1");
		rabbit1.voice();

	}

}
