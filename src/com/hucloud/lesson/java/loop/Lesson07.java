package com.hucloud.lesson.java.loop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson07 {

	public static void main(String[] args) {
		
		// 난수를 생성.
		// 1 ~ 10 중의 숫자를 랜덤하게 선택.
		double randomNumber = Math.random() * 10 + 1; // 0.nnnnnnn
		
		// randomNumber ==> double ==> int
		final int ANSWER = (int) randomNumber;
		
		// 변수를 만드는 과정. 변수는 만드는 위치.
		// 변수의 타입 : Primitive Type, Reference Type
		// Primitive Type: 정수, 실수, 문자, 불리언
		// Reference Type: Primitive Type을 제외하는 모든 타입.
		// userAnswer, console
		
		// 반복문 내부에서는 변수를 정의하지 않는다.
		// 메모리.
		
		Scanner console = new Scanner(System.in);
		// 변수가 정의됨.
		int userAnswer = 0; // 변수가 정의되더라도, 값이 할당되지 않으면 존재하지 않는 변수로 취급.
		
		for (int i = 0; i < 3; i++) {
			System.out.println("컴퓨터가 생각하는 숫자를 맞히는 게임!");
			System.out.println("1 ~ 10 중에 가장 먼저 생각난 숫자를 입력하세요!");
			
			try {
				// 예외(에러)가 발생할 가능성이 있는 코드를 실행.(작성)
				// 사용자에게 값을 입력받는다.
				userAnswer = console.nextInt();
			}
			catch (InputMismatchException ime) {
				// try에서 발생한 예외를 처리하는 코드.
				// "숫자만 입력해주세요" 출력
				System.out.println("숫자만 입력해주세요!");
				// 반복 횟수를 1 감소.
				i--;
				
				console.nextLine(); // Scanner의 버그 현상.
				// nextInt ==> 숫자를 입력.
				// nextInt에서 문자를 입력한 경우 ==> 엔터 입력 정보가 nextInt로 전달.
				// nextLine에서 남아있는 엔터를 제거.
				
				// 반복문 내부에서 사용가능한 키워드.
				// 반복문 내부에서 continue가 실행되면
				// 아래의 코드는 모두 무시하고, 반복문 (for)으로 돌아가는 역할.
				continue; 
			}
			
			if (userAnswer == ANSWER) {
				System.out.println("와, 맞았어요!");
				// switch break <-- switch 블럭을 빠져나가는 키워드.
				break;
			}
			else {
				// i ==> 0, 1, 2
				if (i < 2) {
					System.out.println("아니에요! 기회는 " + (2 - i) + "번 남았습니다.");
				}
				else {
					System.out.println("안타깝네요! 정답은 " + ANSWER + "였습니다.");
				}
			}
		}
	}
	
}
