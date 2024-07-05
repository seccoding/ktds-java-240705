package com.hucloud.lesson.java.oop.inheritence;

public class Pet {

	private String type;
	private String name;

//	public Pet() {
//		System.out.println("인스턴스를 생성합니다.");
//	}
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void greet() {
		System.out.println("안녕하세요 " + name + "(" + type + ") 입니다.");
	}

}
