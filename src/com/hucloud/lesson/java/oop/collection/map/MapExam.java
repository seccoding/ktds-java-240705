package com.hucloud.lesson.java.oop.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, String> dictionary = new HashMap<>();
		
		System.out.println("------------------------");
		System.out.println("간단 단어장");
		System.out.println("------------------------");
		
		Scanner console = new Scanner(System.in);
		int flag = 0;
		
		String english = null;
		String korean = null;
		
		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 단어 등록");
			System.out.println("2. 단어 조회");
			System.out.println("3. 단어 삭제");
			System.out.println("9. 종료");
			
			flag = console.nextInt();
			console.nextLine(); // Scanner 버그 수정.
			
			if (flag == 1) {
				System.out.println("등록하려는 영어 단어를 입력해주세요.");
				english = console.nextLine(); // 문자열 입력
				System.out.println("등록한 영어의 뜻을 한국어로 입력하세요.");
				korean = console.nextLine();
				
				// List 에서 데이터 추가 add
				// List에서 같은 데이터를 여러번 add하면 그만큼 add 가 된다.
				// Map에서 데이터 추가를 put으로 하면
				// 같은 key를 가지고 있는 것이 있다면, Value가 업데이트.
				dictionary.put(english, korean);
				System.out.println("등록이 완료되었습니다!");
			}
			else if (flag == 2) {
				System.out.println("찾으려는 영어 단어를 입력하세요.");
				english = console.nextLine();
				
				korean = dictionary.get(english);
				
				System.out.println(english + "의 뜻은 " + korean + " 입니다.");
			}
			else if (flag == 3) {
				System.out.println("삭제하려는 영어 단어를 입력하세요.");
				
				english = console.nextLine();
				korean = dictionary.remove(english);
				
				System.out.println("단어가 삭제되었습니다.");
				System.out.println("삭제된 단어는 " + english + " / " + korean + "입니다.");
			} 
			else if (flag == 9) {
				System.out.println("단어장을 종료합니다.");
				break;
			}
		}
		
	}
	
}
