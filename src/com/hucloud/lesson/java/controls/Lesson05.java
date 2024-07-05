package com.hucloud.lesson.java.controls;

import java.util.Scanner;

public class Lesson05 {

	public static void main(String[] args) {
		
		// 맞추어야 할 답을 상수로 정의.
		final int ANSWER = 3;
		
		// 사용자가 입력한 값을 할당할 변수.
		int userAnswer;
		
		System.out.println("컴퓨터가 생각하는 숫자를 맞히는 게임!");
		System.out.println("1 ~ 10 중 가장 먼저 생각난 숫자를 입력하세요!");
		
		// 입력을 받기 위한 스캐너 생성.
		// Ctrl + Shift + O
		Scanner console = new Scanner(System.in);
		
		// 스캐너를 통해서 사용자로부터 입력을 받아 userAnswer에 할당.
		userAnswer = console.nextInt();
		
		// userAnswer의 값과 ANSWER의 값이 같은지 비교.
		if (userAnswer == ANSWER) {
			System.out.println("와! 정답이에요!");
		}
		else {
			System.out.println("안타깝지만 틀렸어요!");
		}
		
	}
	
}
