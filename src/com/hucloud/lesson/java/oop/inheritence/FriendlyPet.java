package com.hucloud.lesson.java.oop.inheritence;

/**
 * 자바에서 상속의 제한점.
 * 자바는 다중 상속이 불가능.
 */
public class FriendlyPet extends Pet {

	public FriendlyPet() {
		super("Animal", "Unknown"); // super(); <-- 슈퍼클래스 (Pet)의 기본 생성자를 호출.
									// super("", ""); <-- 슈퍼클래스(Pet)의 두개의 문자열 파라미터가 있는 생성자를 호출
	}
	
	public FriendlyPet(String type, String name) {
		super(type, name);
	}
	
	/**
	 * Java @ <-- Annotation
	 * @Override : 부모클래스의 메소드를 재정의 한다 라고 알려주는 힌트.
	 */
	@Override
	public void greet() {
		super.greet();
		System.out.println("감사합니다.");
	}
	
	// 상속에서의 생성자.
	
	public void talk() {
		System.out.println("간식주세요.");
	}
	
}
