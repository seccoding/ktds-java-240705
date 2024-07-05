package com.hucloud.lesson.java.array;

public class ArrayExam {

	public static void main(String[] args) {
		
		// 배열 정의
		int[] myScores;

		// 배열 초기화.
		// 5개의 인덱스를 생성.
		myScores = new int[5];
		
		myScores[0] = 30;
		myScores[1] = 100;
		myScores[3] = 70;
		myScores[4] = 80;
		
		System.out.println(myScores[0]);
		System.out.println(myScores[1]);
		System.out.println(myScores[2]);
		System.out.println(myScores[3]);
		System.out.println(myScores[4]);
		
		// 일반 for
		for (int i = 0; i < myScores.length; i++) {
			System.out.println("반복문에서 출력: " + myScores[i]);
		}
		
		// 배열에서만 사용가능한 반복문.
		// for-each : 일반 for보다 속도가 더 빠름
		for (int score : myScores) {
			System.out.println("for-each: " + score);
		}
		
		System.out.println(myScores); // 배열은 객체이기 때문에, 값이 출력되지 않는다.

		// 배열의 주의점.
		// 참조하려는 인덱스의 범위가 벗어나서는 안된다!
		// myScores 배열의 길이 == 5 (new int[5];)
		int myScoresLength = myScores.length; // 배열의 길이.
		System.out.println(myScoresLength); // 5
		
		if (5 < myScoresLength) {
			myScores[5] = 100;
		}
		
		String[] myNames;
		myNames = new String[2];
		
		// 타입의 기본값.
		// Primitive Type
		// 정수: 0
		// 실수: 0.0
		// 문자: ''
		// 불리언: false
		
		// Reference Type
		// null : 아무것도 할당되어 있지 않은 상태.
		System.out.println(myNames);
		
		double[] myAverages = new double[3];
		System.out.println(myAverages);
		
		boolean[] myBoolean = new boolean[10];
		System.out.println(myBoolean);
		
		
		//                     0     1    2   3   4   5
		double[] averages = {100.0, 97.5, 80, 50, 70, 60};
		System.out.println(averages[0]);
		System.out.println(averages[1]);
		System.out.println(averages[2]);
		System.out.println(averages[3]);
		System.out.println(averages[4]);
		System.out.println(averages[5]);
		
		System.out.println("=====================");
		for (double average : averages) {
			System.out.println(average);
		}
	}
	
}
