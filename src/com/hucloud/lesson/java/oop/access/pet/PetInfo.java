package com.hucloud.lesson.java.oop.access.pet;

public class PetInfo {

	// 클래스 필드
	public static final String DOG = "개";
	public static final String CAT = "고양이";
	
	// 클래스 메소드
	// public static void printHello() {}
	
	// 멤버변수
	private String[] parents;
	private String type;
	private String name;
	
	// 생성자.
	// 반환 타입이 없음. 메소드의 이름이 클래스의 이름과 같아야 함.
//	public PetInfo() {
//		// 기본 생성자.
//		// 생성자의 역할.
//		//  - 멤버변수의 초기화를 담당.
//		
//		System.out.println("생성자가 호출되었습니다!");
//		System.out.println(this);
//		System.out.println("this는 클래스의 생성자가 생성한 인스턴스입니다.");
//	}
	
	// 생성자 오버로딩.
	// 여러개의 생성자를 만드는 방법.
	// 파라미터의 타입이나 파라미터의 개수가 다르면 오버로딩이 된다.
	// 오버로딩이 된다 ==> 다른 생성자로 취급한다.
	public PetInfo() {
		System.out.println("기본 생성자 입니다.");
	}
	
	public PetInfo(String type) {
		this.type = type;
	}
	
	public PetInfo(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	// Getter / Setter
	// Getter : 멤버변수의 값을 다른 클래스로 전달하는 것.
	public String[] getParents() {
		String[] tempParents = new String[this.parents.length];
		System.arraycopy(this.parents, 0, tempParents, 0, this.parents.length);
		return tempParents;
	}
	
	public void setParents(String[] parents) {
		this.parents = new String[parents.length];
		System.arraycopy(parents, 0, this.parents, 0, parents.length);
		//this.parents = parents;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	// Setter : 멤버변수에 값을 할당하는 것.
	public void setType(String type) {
		if ( type.equals(PetInfo.DOG) || type.equals(PetInfo.CAT) ) {
			// 할당되는 값을 필터링.
			// 메모리 연결을 끊는 역할.
			this.type = type;
		}
	}
	
	public void setName(String name) {
		// 할당되는 값을 필터링.
		// 메모리 연결을 끊는 역할.
		this.name = name;
	}
	
	// 인스턴스 메소드
	public void printMyInfo() {
		System.out.println(type + " / " + name);
	}
	
	/**
	 * 메소드 오버로딩.
	 * @param message
	 */
	public void printMyInfo(String message) {
		System.out.println(message + " = " + type + " / " + name);
	}
	
	public void printParents() {
		for (String parent : this.parents) {
			System.out.println("부모: " + parent);
		}
	}
	
}

















