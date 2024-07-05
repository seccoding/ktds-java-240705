package com.hucloud.lesson.java.variables;

import java.util.Scanner;

public class Lesson04 {

	public static void main(String[] args) {
		// F11
		long hugeNumber = 1_000_000_000;
		System.out.println(hugeNumber);
		hugeNumber = hugeNumber * 5; // 5_000_000_000
		
		System.out.println(hugeNumber); // 705032704
		/*
		 * 숫자 두 개를 입력받아서 결과를 출력하는 코드.
		 */
		
		// 1. 숫자들을 할당할 변수 두 개를 생성.
		//    변수를 만드는 방법.
		//    변수의_형태 변수의_이름;
		int firstNumber;
		int secondNumber;
		
		// 각 변수에 할당할 값을 입력 받음.
		// Ctrl + Shift + O
		Scanner console = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요.");
		firstNumber = console.nextInt(); // 키보드에서 숫자를 입력하면 값을 반환.
		
		System.out.println("두 번째 숫자를 입력하세요.");
		secondNumber = console.nextInt();
		
		// 2. 숫자 두 개를 더한 결과를 할당할 변수 생성.
		int additionResult = firstNumber + secondNumber;
		
		
		// 3. 출력.
		System.out.println(firstNumber + " + " + secondNumber + " = " + additionResult);
		
		
		// 형 변환 (묵시적)
		// 작은 바이트에서 큰 바이트로 자연스럽게 변환.
		int intNumber = 1_000_000; // 4byte
		long longNumber = intNumber; // 8byte
		System.out.println(intNumber);
		System.out.println(longNumber);
		
		// 형 변환 (명시적)
		// 명시적 형변환은 정수 오버플로우가 발생할 가능성이 매우매우 높다!
		// 주의할 필요가 있음!
		long longNumber2 = 5_000_000_000L; // 8byte
		int intNumber2 = (int) longNumber2; // 4byte
		System.out.println(longNumber2);
		System.out.println(intNumber2);
		
		
	}
	
}
