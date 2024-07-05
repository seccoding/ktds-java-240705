package com.hucloud.lesson.java.oop.access;

/*
 * 자바 클래스에서는 같은 패키지에 있는 
 * 다른 자바 클래스만 사용할 수 있다.
 * 
 * 만약, 다른 패키지에 있는 자바 클래스를 사용하려면
 * import 문장을 이용해서 패키지의 전체 경로와
 * 사용하려는 클래스의 이름을 작성.
 */
import com.hucloud.lesson.java.oop.access.pet.PetInfo;
import java.util.Scanner;

public class Lesson12 {

	public static void main(String[] args) {
		
		String str = "name";
		
		Scanner console = new Scanner(System.in);
		
		PetInfo cat = new PetInfo(PetInfo.CAT, "나비");
		cat.printMyInfo();
//		cat.type = PetInfo.CAT;
//		cat.name = "나비";
//		
//		System.out.println(cat.type + " / " + cat.name);
		
	}
	
}
