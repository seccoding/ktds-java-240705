package com.hucloud.lesson.java.oop.generic;

/**
 * 정수타입의 점수들을 관리하는 역할.
 * - 점수를 입력할 수 있는 기능.
 * 1. 점수들의 총 합계를 구하는 기능
 * 2. 점수들의 평균을 구하는 기능.
 */
public class ScoreCalculator {

	private int[] scoreArray;
	private int nowIndex;
	
	public ScoreCalculator() {
		this.scoreArray = new int[2];
	}
	
	public void addScore(int score) {
		//  2        == 2
		if (nowIndex == this.scoreArray.length) {
			int[] tempScoreArray = new int[this.scoreArray.length + 2];
			System.arraycopy(this.scoreArray, 0, tempScoreArray, 0, this.scoreArray.length);
			this.scoreArray = tempScoreArray; // 2 ==> 4 ==> 6 ==> 8
		}
		
		this.scoreArray[nowIndex] = score;
		nowIndex++;
	}
	
	public int getSum() {
		int sum = 0; // 지역 변수는 값의 초기화가 필수!
		for (int score : this.scoreArray) {
			sum += score;
		}
		return sum;
	}
	
	public double getAverage() {
		int sum = this.getSum();
		
		double average = sum / ((double) nowIndex);
		return average;
	}
	
}
