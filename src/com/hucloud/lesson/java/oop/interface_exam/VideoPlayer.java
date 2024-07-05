package com.hucloud.lesson.java.oop.interface_exam;

public class VideoPlayer implements Player {

	private String[] videoArray;
	private int playIndex;
	
	public VideoPlayer() {
		this.videoArray = new String[] {
				"Java Chapter 1",
				"Java Chapter 2",
				"Java Chapter 3"
		};
		
		this.playIndex = 0;
	}
	
	protected String[] getVideoArray() {
		String[] tempArray = new String[this.videoArray.length];
		System.arraycopy(this.videoArray, 0, tempArray, 0, this.videoArray.length);
		return tempArray;
	}
	
	@Override
	public void play() {
		String videoName = this.videoArray[playIndex];
		System.out.println(videoName + "을 재생합니다.");
	}

	@Override
	public void stop() {
		String videoName = this.videoArray[playIndex];
		System.out.println(videoName + "을 재생을 중지합니다.");
	}

	@Override
	public void next() {
		playIndex++;
		
		if (playIndex >= this.videoArray.length) {
			playIndex--;
			System.out.println("마지막 영상입니다.");
			System.out.println("더 이상 재생할 영상이 없습니다.");
		}
		else {
			String videoName = this.videoArray[playIndex];
			System.out.println(videoName + "을 재생합니다.");
		}
	}

	@Override
	public void prev() {
		playIndex--;
		
		if (playIndex < 0) {
			playIndex = 0;
		}
		
		String videoName = this.videoArray[playIndex];
		System.out.println(videoName + "을 재생합니다.");
	}

	@Override
	public void replay() {
		String videoName = this.videoArray[playIndex];
		System.out.println(videoName + "을 처음부터 재생합니다.");
	}
	
	@Override
	public void showDisplay() {
		String videoName = this.videoArray[playIndex];
		System.out.println("현재 재생 중인 영상은 " + videoName + " 입니다.");
		for (String video : videoArray) {
			System.out.println(video);
		}
	}

}
