package com.hucloud.lesson.java.loop;

public class WhileExam {

	public static void main(String[] args) {
		
		// for 반복.
		// 일정 범위를 반복
		// 시작 시점, 종료되는 시점 분명. ==> 범위 반복자.
		
		// while 반복.
		// 시작 시점은 알 수 있지만, 종료되는 시점이 불분명.
		// 조건 반복문.
		// while 활용 예시 ==> 무한반복
		// 1: 주문, 2: 조리, 3: 배달, 9: 종료.
		
		int index = 0;
		while (true) {
			System.out.println("반복중입니다. " + index);
			index++;
			
			if ( index == 5 ) {
				break;
			}
		}
		
	}
	
}
