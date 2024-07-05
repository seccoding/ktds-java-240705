package com.hucloud.lesson.java.oop.interface_exam;

import java.util.Random;

public class Netflix extends VideoPlayer implements OttPlayer {

	@Override
	public void randomPlay() {
		String[] videoArray = super.getVideoArray();
		Random random = new Random();
		int randomIndex = random.nextInt(videoArray.length);
		
		String videoName = videoArray[randomIndex];
		System.out.println(videoName + "을 재생합니다.");
	}

}
