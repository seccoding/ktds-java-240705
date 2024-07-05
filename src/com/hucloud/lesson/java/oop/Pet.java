package com.hucloud.lesson.java.oop;

/**
 * 애완 동물의 설계(클래스)
 * 클래스를 만든다 == 변수의 타입을 만든다.
 */
public class Pet {

	/**
	 * 멤버변수: 초기값은 0
	 * 애완동물의 나이
	 */
	int age;
	
	/**
	 * 멤버변수. 값을 할당하지 않아도 변수가 생성이 된다. 초기값으로 할당이된다.
	 * 애완동물의 종류 (개, 고양이 등등)
	 */
	String type;
	
	/**
	 * 멤버변수
	 * 애완동물의 이름 (바둑이, 나비 등등)
	 */
	String name;
	
	/**
	 * 메소드.
	 * Pet 인스턴스의 정보를 출력.
	 */
	void showMyInfo() {
		System.out.println("애완동물의 종류는 " + type 
				+ "이고, 이름은 " + name + "입니다. 나이는 " 
				+ age + "살 입니다.");
	}
	
	void howl() {
		
		// 같다 "=="
		// "==" 비교연산을 사용할 수 있는 조건.
		// Primitive Type
		// boolean, int, long, float, double, short, byte
		if ( type.equals("개") ) {
			System.out.println("멍멍!");
		}
		else if (type.equals("고양이") ) {
			System.out.println("야옹!");
		}
		
	}
	
}










