package com.hucloud.lesson.java.oop.interface_exam;

public class Shop {

	public static void main(String[] args) {
		
		// 인터페이스는 인스턴스로 생성이 불가능하다!
		// 구현되지 않은 추상메소드 들이 존재하기 때문.
		Player player = new MusicPlayer();
		player.play();
		player.stop();
		player.next();
		player.prev();
		player.replay();
		player.showDisplay();
		
		Player videoPlayer = new VideoPlayer();
		videoPlayer.play();
		videoPlayer.stop();
		
		videoPlayer.next();
		videoPlayer.next();
		videoPlayer.next();
		videoPlayer.next();
		videoPlayer.next();
		
		videoPlayer.prev();
		videoPlayer.prev();
		videoPlayer.prev();
		videoPlayer.prev();
		videoPlayer.prev();
		
		videoPlayer.replay();
		videoPlayer.showDisplay();
	
		System.out.println("=========================");
		OttPlayer netflix = new Netflix();
		netflix.randomPlay();
		netflix.randomPlay();
		netflix.randomPlay();
		netflix.randomPlay();
		
		netflix.next();
		
		// Class 가 class를 상속 ==> IS A : Sub class is a Super class;
		// Interface 가 interface를 상속 ==> IS A : Sub interface is a Super interface;
		
		Player netflix2 = new Netflix();
		
		System.out.println("====================");
		
		play(player);
		play(videoPlayer);
		play(netflix);
		play(netflix2);
	}
	
	public static void play(Player player) {
		if (player instanceof OttPlayer) {
			OttPlayer ott = (OttPlayer) player;
			ott.randomPlay();
		}
		else {
			player.play();
		}
	}
	
}
