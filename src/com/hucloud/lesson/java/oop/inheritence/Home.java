package com.hucloud.lesson.java.oop.inheritence;

public class Home {

	public static void greetAll(Pet pet) {
		pet.greet();
		
		// java instanceof 연산자를 통해서 is a 관계를 검사.
		if (pet instanceof FriendlyPet) {
			FriendlyPet fp = (FriendlyPet) pet;
			fp.talk();
		}
	}
	
	public static void main(String[] args) {
		Pet pet = new Pet("강아지", "뽀삐");
//		pet.setType("강아지");
//		pet.setName("뽀삐");
		
		FriendlyPet pet2 = new FriendlyPet("고양이", "만두");
//		pet2.setType("고양이");
//		pet2.setName("만두");
		
		/*
		 * 상속의 관계
		 * 상속을 해준 클래스 ( 슈퍼 클래스: 부모 클래스 )
		 * 상속을 받은 클래스 ( 서브 클래스: 자식 클래스 )
		 * 
		 * Sub Class is a Super Class
		 * IS A 관계.
		 */
		Pet pet3 = new FriendlyPet("고양이", "까망이");
		// 실제 인스턴스는 FriendlyPet
		// 사용가능한 메소드는 Pet으로 제한.
//		pet3.setName("까망이");
//		pet3.setType("고양이");
		
		greetAll(pet);
		greetAll(pet2);
		greetAll(pet3);
	}
	
}








