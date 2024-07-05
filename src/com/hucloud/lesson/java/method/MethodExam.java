package com.hucloud.lesson.java.method;

public class MethodExam {

	// "안녕하세요"를 출력하는 메소드
	/**
	 * "안녕하세요"를 출력합니다.
	 */
	public static void sayHello() {
		System.out.println("안녕하세요.");
	}
	
	/**
	 * "안녕하세요"를 출력하는 메소드
	 * @param repeat "안녕하세요"를 몇번 출력할 것인지.
	 */
	public static void printHello(/*파라미터*/int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.println("printHello> 안녕하세요.");
		}
	}
	
	// 숫자 두 개를 파라미터로 받아서, 합을 구하고, 결과를 반환시킨다.
	public static int calculate(int numA, int numB) {
		int sum = numA + numB;
		return sum;
	}
	
	// 클래스 파일을 실행시키는 특별한 "메소드"
	// 메소드: 특정 클래스 파일에서 특정 기능을 수행하는 코드의 묶음
	public static void main(String[] args) {
//		sayHello();
//		sayHello();
//		sayHello();
//		sayHello();
		
//		printHello(10);
		
		int result = calculate(20, 30);
		System.out.println(result);
	}
	
}
