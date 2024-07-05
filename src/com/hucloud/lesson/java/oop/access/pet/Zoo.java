package com.hucloud.lesson.java.oop.access.pet;

public class Zoo {

	public static void main(String[] args) {
		
		// 생성자 == 메소드
		// 메소드 == 클래스내부에 작성이 되어있어야 호출이 가능.
		// new PetInfo(); 생성자는 만든적이 X
		// 작성한 적이 없는 메소드를 호출할 수 있는가? ==> X
		// 자바 파일이 .class 파일로 변경될 때 (컴파일) 클래스에 작성된 생성자가 없다면
		// 자바 컴파일러가 기본 형태의 생성자를 작성해 줌.
		PetInfo dog = new PetInfo(PetInfo.DOG, "바둑이");
		
		PetInfo cat = new PetInfo();
		cat.setType(PetInfo.CAT);
		cat.setName("나비");
		cat.printMyInfo();
		cat.printMyInfo("애완동물 정보입니다.");
		
		// Reference Type: 메모리 참조.
		String[] parents = {"초코", "뭉치"};
		dog.setParents(parents);
		
		// 초코 / 뭉치
		dog.printParents();
		
		parents = dog.getParents();
		
		parents[0] = "미미";
		
		// 초코 / 뭉치
		dog.printParents();
		
		System.out.println(dog.getType() + " / " + dog.getName());
		dog.printMyInfo();
		
	}
	
}
