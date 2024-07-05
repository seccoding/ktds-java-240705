package com.hucloud.lesson.java.oop.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExam {

	
	public static void main(String[] args) {
		
		String fileNameWithPath = "C:\\java_file_exam\\writeExam.txt";
		
		if ( ! fileNameWithPath.endsWith(".txt")) {
			System.out.println("텍스트 파일이 아닙니다.");
			return; // 반환타입이 void 일 때, return 이 실행되면, 현재 메소드만 종료.
		}
		
		File textFile = new File(fileNameWithPath);
		// 파일이 존재하는가?
		if ( ! textFile.exists() ) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		// 이 경로가 폴더인가?
		if ( textFile.isDirectory() ) {
			System.out.println("파일이 아닙니다.");
			return;
		}
		
		String number = "abcd";
		int num = Integer.parseInt(number);
		
//		// 파일 혹은 비어있는 폴더만 삭제.
//		// 폴더 삭제시, 폴더 내에 하나 이상의 항목이 있을 경우
//		// 삭제 불가능.
//		// 재귀호출을 통해서 파일 시스템을 탐색하며
//		// 모든 파일을 제거 한 이후
//		// 삭제하려는 폴더를 삭제.
//		textFile.delete();
		
		
		try {
			// 파일 읽어오기
			FileReader fileReader = new FileReader(fileNameWithPath);
			BufferedReader reader = new BufferedReader(fileReader);
			
			// 파일에서 내용을 읽어와 할당받기 위한 변수.
			String textLine = null;
			
			// 파일의 처음부터 시작해서 파일의 끝까지 읽어옴.
			// 파일 내용의 각 줄을 읽어서 textLine에 할당.
			// 파일을 읽어오다가 textLine이 null이 할당되는 순간 ===> 파일의 끝에 도달한 경우. (EOF : End Of File)
			while ( (textLine = reader.readLine()) != null ) {
				System.out.println(textLine);
			}
			
			reader.close();
			fileReader.close();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}










