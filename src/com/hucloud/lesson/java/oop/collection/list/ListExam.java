package com.hucloud.lesson.java.oop.collection.list;

import com.hucloud.lesson.java.oop.access.pet.PetInfo;

import java.util.List;
import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		
		List<PetInfo> petList = new ArrayList<>();
		
		PetInfo pet = new PetInfo(PetInfo.CAT, "나비");
		pet.setParents(new String[] {"까망이", "만두"});
		
		// List 인스턴스턴에 제네릭(PetInfo) 인스턴스를 추가.
		petList.add(pet); // 0
		petList.add(new PetInfo(PetInfo.DOG, "바둑이")); // 1
		petList.add(new PetInfo(PetInfo.CAT, "초코")); // 2
		
//		PetInfo firstPet = petList.get(0);
//		firstPet.printMyInfo();
		
		// 데이터를 참조.
		petList.get(0) // 고양이 / 나비
			   .printMyInfo();
		petList.get(0)
			   .printParents();
		
		petList.get(1).printMyInfo();
		petList.get(2).printMyInfo("반갑습니다.");
		
		// 존재하지 않는 인덱스에 접근할 경우 
		// "IndexOutOfBoundsException" 예외가 발생.
//		petList.get(3).printMyInfo();
		
		// petList에 할당된 요소들의 개수.
		int petSize = petList.size();
		System.out.println("등록된 애완 동물의 수는 " + petSize + "마리 입니다.");
		
		// List 반복.
		// 1. for 반복
		PetInfo tempPet = null;
		for (int i = 0; i < petSize; i++) {
			tempPet = petList.get(i);
			tempPet.printMyInfo("for 반복문에서 출력 중");
		}
		
		// 2. for-each
		for (PetInfo eachPet : petList) {
			eachPet.printMyInfo("for-each 반복문에서 출력 중");
		}
		
		// 3. lambda foreach
		petList.forEach((each) -> {
			each.printMyInfo("lambda forEach 반복문에서 출력 중");
		});
		
		// 아이템 삭제.
		PetInfo removedItem = petList.remove(2);
		removedItem.printMyInfo("삭제된 애완동물");
		
		petSize = petList.size();
		System.out.println("등록된 애완 동물의 수는 " + petSize + "마리 입니다.");
		
		// 존재하지 않은 인덱스를 삭제할 경우
		// "IndexOutOfBoundsException" 예외가 발생.
//		petList.remove(2);
		
		// 아이템을 모두 삭제.
		// 리스트에 아이템이 존재하는지 확인.
		if ( petList == null || petList.size() == 0 ) {
			System.out.println("등록된 애완동물 목록이 존재하지 않습니다.");
		}
		
		petList.clear();
		petSize = petList.size();
		System.out.println("등록된 애완 동물의 수는 " + petSize + "마리 입니다.");
		
		// 리스트에 아이템이 존재하는지 확인.
		if ( petList == null || petList.isEmpty() ) {
			System.out.println("등록된 애완동물 목록이 존재하지 않습니다.");
		}
		
		// 리스트에 아이템이 이미 존재하는지 확인.
		petList.add(new PetInfo(PetInfo.DOG, "바둑이"));
		
		
		boolean contains = petList.contains(new PetInfo(PetInfo.DOG, "바둑이2"));
		if ( ! contains ) {
			petList.add(new PetInfo(PetInfo.DOG, "바둑이2"));
		}
		
		petList.forEach((each) -> {
			each.printMyInfo("lambda forEach 반복문에서 출력 중");
		});
	}
	
}
