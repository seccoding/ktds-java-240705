package com.hucloud.lesson.java.loop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson08 {

	public static void main(String[] args) {
		
		double randomNumber = Math.random() * 10 + 1;
		
		final int ANSWER = (int) randomNumber;
		
		Scanner console = new Scanner(System.in);
		int userAnswer = 0;
		
		while (true) {
			System.out.println("컴퓨터가 생각하는 숫자를 맞히는 게임!");
			System.out.println("1 ~ 10 중에 가장 먼저 생각난 숫자를 입력하세요!");
			
			try {
				userAnswer = console.nextInt();
			}
			catch (InputMismatchException ime) {
				System.out.println("숫자만 입력해주세요!");
				
				console.nextLine(); 
				continue; 
			}
			
			if (userAnswer == ANSWER) {
				System.out.println("와, 맞았어요!");
				break; // 반드시 작성!!
			}
			else if (userAnswer < ANSWER) {
				System.out.println("조금 더 큰 숫자를 입력해주세요.");
			}
			else {
				System.out.println("조금 저 작은 숫자를 입력해주세요.");
			}
		}
	}
	
}
