package com.hucloud.lesson.java.oop.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExam {

	public static void main(String[] args) {
		
		// 파일을 작성하는 코드.
		// 파일이 작성될 경로 지정.
		String filePath = "C:\\java_file_exam\\writeExam.txt";
		System.out.println(filePath);
		
		// C:\java_file_exam 경로가 존재하는지 확인.
		// 존재하지 않다면 이 폴더를 생성.
		// java.io.File
		File path = new File(filePath);
		File directory = path.getParentFile();
		if ( ! directory.exists() ) {
			// C:\java_file_exam\test\2024\07\05
//			directory.mkdir(); // C:\java_file_exam 폴더만 생성.
			
			// C:\java_file_exam\test\2024\07\05
			directory.mkdirs(); // C:\java_file_exam\test\2024\07\05 전체 폴더를 생성
		}
		
		// 파일의 내용을 작성.
		// Writer
		//  - FileWriter
		//    -- BufferedWriter
		try {
			FileWriter fileWriter = new FileWriter(path);
			BufferedWriter out = new BufferedWriter(fileWriter);
			
			Scanner console = new Scanner(System.in);
			
			// 파일에 쓸 내용을 입력.
			System.out.println("파일에 작성될 문장을 입력해 주세요.");
			System.out.println("종료하려면 quit을 입력해주세요.");
			
			String text = console.nextLine();
			while ( !text.equals("quit") ) {
				// text의 내용을 파일에 작성한다.
				out.write(text);
				out.newLine(); // 파일의 내용에서 개행을 해준다.
				
				text = console.nextLine();
			}
			
			/*
			 * Java Application 과 File System을 연동할 때
			 * Java와 File System 사이에 데이터를 흘려보내기 위해서 Pipe 라는 것을 연결.
			 * Pipe를 통해 파일을 읽고 쓰게 됨.
			 * 
			 * 모든 처리가 끝났을 때 Pipe 닫아야만 메모리에서 Pipe가 해제.
			 * Pipe를 닫지 않으면, 메모리 누수 발생.
			 * 
			 * close() 메소드를 통해서 Pipe를 닫는 처리를 수행.
			 */
			
			// 파일 작성이 완료.
			// 파일을 쓰기 위한 Writer들을 닫는다.
			out.close();
			fileWriter.close();
			
			console.close();
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		// 파일을 생성.
		
	}
	
}
