package com.hucloud.lesson.java.oop.generic;

public class FloatScoreCalculator {

	private float[] scoreArray;
	private int nowIndex;
	
	public FloatScoreCalculator() {
		this.scoreArray = new float[2];
	}
	
	public void addScore(float score) {
		//  2        == 2
		if (nowIndex == this.scoreArray.length) {
			float[] tempScoreArray = new float[this.scoreArray.length + 2];
			System.arraycopy(this.scoreArray, 0, tempScoreArray, 0, this.scoreArray.length);
			this.scoreArray = tempScoreArray; // 2 ==> 4 ==> 6 ==> 8
		}
		
		this.scoreArray[nowIndex] = score;
		nowIndex++;
	}
	
	public float getSum() {
		float sum = 0; // 지역 변수는 값의 초기화가 필수!
		for (float score : this.scoreArray) {
			sum += score;
		}
		return sum;
	}
	
	public float getAverage() {
		float sum = this.getSum();
		
		float average = sum / nowIndex;
		return average;
	}
	
}
