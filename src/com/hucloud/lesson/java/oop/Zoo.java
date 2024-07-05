package com.hucloud.lesson.java.oop;

import com.hucloud.lesson.java.oop.static_exam.StaticPet;

/**
 * 애완동물의 동물원.
 * Pet 클래스를 이용해서 인스턴스를 생성 예제.
 */
public class Zoo {

	public static void main(String[] args) {
		
		// 변수의 정의.
		// 변수를 정의만 한 경우는, 변수가 생성되지 않는다!
		// 지역변수 (임시변수)
		// 중괄호의 영역에서만 유효한 변수.
		// 중괄호를 벗어날 경우 변수가 사라진다.
		// 지역변수는 값이 할당이 되어야만 변수가 생성이 된다!
		// String name;
		
		
		// 두 마리의 애완동물 생성.
		Pet dog = new Pet();
		Pet cat = new Pet();
		
		dog.age = 3;
		dog.type = "개";
		dog.name = "바둑이";
		
		cat.age = 1;
		cat.type = "고양이";
		cat.name = "나비";
		
		dog.showMyInfo();
		cat.showMyInfo();
		
		dog.howl();
		cat.howl();
		
	}
	
}










