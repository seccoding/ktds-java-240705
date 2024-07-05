package com.hucloud.lesson.java.oop.interface_exam;

public interface Player {

	// 추상 메소드
	// 클래스에서는 구현의 대상.
	public void play();
	public void stop();
	public void next();
	public void prev();
	public void replay();
	
	// 추상 메소드가 아닌 일반 메소드도 만들 수 있음.
	// Default Method
	// 클래스에서는 Override의 대상.
	public default void showDisplay() {
		System.out.println("현재 재생 목록입니다.");
	}
	
}
