package com.hucloud.lesson.java.controls;

public class SwitchExam {

	public static void main(String[] args) {
		
		int step = 2;
		
		System.out.println("밥짓기!");
		
		// 정수 또는 문자열 등
		switch (step) {
		case 0:
			System.out.println("쌀을 씻습니다.");
		case 1:
			System.out.println("물을 버립니다.");
		case 2:
			System.out.println("취사 버튼을 누릅니다.");
		case 3:
			System.out.println("밥짓기가 끝나면 밥을 저어줍니다.");
		default:
			System.out.println("맛있게 먹습니다.");
		}
		
		System.out.println("종료되었습니다.");
		
	}
	
}
