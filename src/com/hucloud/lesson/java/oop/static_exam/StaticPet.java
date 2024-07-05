package com.hucloud.lesson.java.oop.static_exam;

public class StaticPet {

	/**
	 * 클래스 필드 (스태틱 필드) - 변수의 타입 앞에 "static" 키워드를 사용.
	 * StaticPet 클래스의 인스턴스를 몇 개 만들었는지 기록하는 용도.
	 */
	static int petCount;
	
	// 클래스 필드.
	// 클래스 메소드.
	static final String DOG = "개";
	static final String CAT = "고양이";
	
	/**
	 * 멤버변수
	 */
	int age;
	
	/**
	 * 멤버변수
	 */
	String type;
	
	/**
	 * 멤버변수
	 */
	String name;
	
	void showMyInfo() {
		System.out.println("애완동물의 종류는 " + type 
				+ "이고, 이름은 " + name + "입니다. 나이는 " 
				+ age + "살 입니다.");
	}
	
	void howl() {
		if ( type.equals(StaticPet.DOG) ) {
			System.out.println("멍멍!");
		}
		else if (type.equals(StaticPet.CAT) ) {
			System.out.println("야옹!");
		}
	}
	
	static void showInfo() {
		System.out.println("애완동물을 관리하는 클래스.");
	}
	
}










