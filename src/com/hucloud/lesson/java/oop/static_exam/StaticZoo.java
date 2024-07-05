package com.hucloud.lesson.java.oop.static_exam;

public class StaticZoo {

	int animalCount = 0;
	
	void printHello() {
		System.out.println(animalCount);
		System.out.println("Hello, Java");
	}
	
	public static void main(String[] args) {
		
		StaticZoo zoo = new StaticZoo();
		zoo.printHello();
		
		/*
		 * 메모리 구조.
		 * Static 영역. <-- 스태틱(클래스) 메소드, 스태틱(클래스) 필드
		 * 		static 영역에서는 heap, stack 영역으로 접근이 불가능!
		 * 		static 에서 다른 인스턴스나 지역변수에 접근을 할 수가 없다!
		 * 
		 * Heap 영역.
		 * 
		 * Stack 영역.
		 */
		
		// 클래스 필드의 값을 출력.
		System.out.println("StaticPet 클래스로 만든 인스턴스의 개수는 " 
					+ StaticPet.petCount + "개 입니다.");
		
		StaticPet dog = new StaticPet();
		// StaticPet.petCount++;
		
		// 클래스 필드(스태틱 필드)는 반드시 클래스로만 접근을 해야 한다.
		// 인스턴스로도 접근을 할 수 있지만, 규칙에 위배되는 행위다.
		// dog.petCount++;
		// static 역할.
		// 클래스로만 접근?
		// - 전역 변수 / 전역 상수.
		// 인스턴스의 사용 범위.
		//    중괄호 { } 내부에서만 사용이 가능.
		//    중괄호 바깥 영역에서 사용이 제한된다.
		//    인스턴스를 전역으로 공개하는 것은 Java 불가능.
		// 애플리케이션 전역에서 사용할 수 있도록.
		//    애플리케이션 전역에서 사용 가능. --> 스태틱 값. 전역에서 공유.
		
		// Java 환경에서 static 전역 상수!
		// Java Application 내부에서 여러 Thread가 동시에 실행.
		// Thread마다 전역 변수 참조. --> 동시성 문제.
		
		System.out.println("StaticPet 클래스로 만든 인스턴스의 개수는 " 
				+ StaticPet.petCount + "개 입니다.");
		
		dog.type = StaticPet.DOG;
		dog.name = "바둑이";
		dog.age = 3;
		
		dog.showMyInfo();
		dog.howl();
		
		StaticPet cat = new StaticPet();
		cat.type = StaticPet.CAT;
		cat.name = "나비";
		cat.age = 1;
		
		cat.showMyInfo();
		cat.howl();
		
		StaticPet.showInfo();
		StaticPet.showInfo();
		StaticPet.showInfo();
		StaticPet.showInfo();
		
		String name = null;
		boolean nameIsEmpty = StringUtils.isEmpty(name);
		String value = StringUtils.nullToDefaultValue(name, "Unknown");
		boolean nameIsNumber = StringUtils.isNumber("1234");
		
		System.out.println(nameIsEmpty);
		System.out.println(value);
		System.out.println(nameIsNumber);
		
	}
	
}














