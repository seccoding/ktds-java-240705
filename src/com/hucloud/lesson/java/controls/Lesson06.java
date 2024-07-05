package com.hucloud.lesson.java.controls;

import java.util.Scanner;

public class Lesson06 {

	public static void main(String[] args) {
		
		// 맞추어야 할 값을 상수에 할당 (임의의 값)
		// 0.nnnnnnnnnnn... 형태의 실수.
		double randomAnswer = Math.random();
		System.out.println(randomAnswer);
		
		final int ANSWER = (int) (randomAnswer * 10);
		System.out.println(ANSWER);
		
		System.out.println("컴퓨터가 생각하는 숫자를 맞히는 게임!");
		System.out.println("1 ~ 10 중 가장 먼저 생각난 숫자를 입력하세요!");
		
		// Ctrl + Shift + O
		Scanner console = new Scanner(System.in);
		
		// 사용자가 입력한 값을 할당할 변수.
		int userAnswer = console.nextInt();
		
		if (userAnswer == ANSWER) {
			System.out.println("와! 맞았어요!");
		}
		else if (userAnswer > ANSWER) {
			System.out.println("숫자가 너무 커요! 정답은 " + ANSWER + "였습니다!");
		}
		else {
			System.out.println("숫자가 너무 작아요! 정답은 " + ANSWER + "였습니다.");
		}
		
	}
	
}
