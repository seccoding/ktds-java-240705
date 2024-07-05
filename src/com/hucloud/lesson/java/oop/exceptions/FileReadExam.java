package com.hucloud.lesson.java.oop.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExam {

	private boolean isTextFile(String fileNameWithPath) {
		if ( ! fileNameWithPath.endsWith(".txt")) {
//			System.out.println("텍스트 파일이 아닙니다.");
			// 예외가 던져지면, 그 즉시 메소드가 종료.
			throw new NotTextFileException("텍스트 파일이 아닙니다.", fileNameWithPath);
		}
		
		return true;
	}
	
	private boolean isExists(File textFile) throws NotTextFileException, NotExistsException {
		// 파일이 존재하는가?
		if ( ! textFile.exists() ) {
//			System.out.println("파일이 존재하지 않습니다.");
			throw new NotExistsException("파일이 존재하지 않습니다.");
		}
		
		return true;
	}
	
	private boolean isFile(File textFile) {
		if ( textFile.isDirectory() ) {
//			System.out.println("파일이 아닙니다.");
			throw new RuntimeException("파일이 아닙니다.");
		}
		
		return true;
	}
	
	public void readFile(String fileNameWithPath) {
		
		if ( ! isTextFile(fileNameWithPath) ) {
			return;
		}
		
		File textFile = new File(fileNameWithPath);
		
		if ( ! isExists(textFile) ) {
			return;
		}
		
		if ( ! isFile(textFile) ) {
			return;
		}
		
		FileReader fileReader = null;
		BufferedReader reader = null;
		
		try {
			fileReader = new FileReader(fileNameWithPath);
			reader = new BufferedReader(fileReader);
			
			String textLine = null;
			
			while ( (textLine = reader.readLine()) != null ) {
				System.out.println(textLine);
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			// 예외가 발생을 하던, 발생하지 않던, 무조건 1회 실행되는 블럭
			// Pipe를 끊을 때.
			if (reader != null) {
				try {
					reader.close();
				}
				catch(IOException ioe) {}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				}
				catch(IOException ioe) {}
			}
		}
	}
	
	
	public static void main(String[] args) {
		String fileNameWithPath = "C:\\java_file_exam\\writeExam1111.txt";
		
		FileReadExam read = new FileReadExam();
		read.readFile(fileNameWithPath);
	}
	
}










