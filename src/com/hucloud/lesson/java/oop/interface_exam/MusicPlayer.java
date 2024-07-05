package com.hucloud.lesson.java.oop.interface_exam;

public class MusicPlayer implements Player {

	@Override
	public void play() {
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악 재생을 중지 합니다.");
	}

	@Override
	public void next() {
		System.out.println("다음 곡을 재생합니다.");
	}

	@Override
	public void prev() {
		System.out.println("이전 곡을 재생합니다.");
	}

	@Override
	public void replay() {
		System.out.println("현재 곡을 계속 반복 재생합니다.");
	}
	
}
