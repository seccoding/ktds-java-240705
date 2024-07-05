package com.hucloud.lesson.java.array;

import java.util.Scanner;

public class Lesson09 {

	public static void main(String[] args) {
		
		// 다차원 배열
		int[][] multiArray = new int[2][2];
		multiArray[0][0] = 10;
		multiArray[0][1] = 20;
		multiArray[1][0] = 30;
		multiArray[1][1] = 40;
		
		// 정수 배열에 점수를 할당하고
		int[] scoreArray = new int[3];
		
		Scanner console = new Scanner(System.in);
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(i + ": 점수를 입력해주세요.");
			scoreArray[i] = console.nextInt();
		}
		
		// 반복문을 통해 합계를 구하고
		int sum = 0;
		for (int score : scoreArray) {
//			sum = sum + score;
			sum += score;
		}
		
		// 평균을 구해 출력.
		double average = (double) sum / scoreArray.length;
		System.out.println("평균 점수는 " + average + "점 입니다.");
	}
	
}
