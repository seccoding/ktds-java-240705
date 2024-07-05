package com.hucloud.lesson.java.loop;

public class ForExam {

	public static void main(String[] args) {
		
		// for 반복문 = 범위를 반복. 범위 반복자.
		// 반복하는 횟수가 정해져있다.
		
		// "안녕하세요" 를 다섯번 출력.
		for ( int i = 0; i < 5; i++ ) {
			System.out.println("안녕하세요");
		}
		
		// i의 값을 출력.
		for ( int i = 0; i < 10; i++ ) {
			System.out.println("루프 카운터 i의 값은 지금 " + i + " 입니다.");
		}
		
		System.out.println("반복이 종료되었습니다.");
	}
	
}
