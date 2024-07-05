package com.hucloud.lesson.java.oop.generic;

public class NewScoreCalculator {

	private double[] scoreArray;
	private int nowIndex;
	
	public NewScoreCalculator() {
		this.scoreArray = new double[2];
	}
	
	public void addScore(double score) {
		//  2        == 2
		if (nowIndex == this.scoreArray.length) {
			double[] tempScoreArray = new double[this.scoreArray.length + 2];
			System.arraycopy(this.scoreArray, 0, tempScoreArray, 0, this.scoreArray.length);
			this.scoreArray = tempScoreArray; // 2 ==> 4 ==> 6 ==> 8
		}
		
		this.scoreArray[nowIndex] = score;
		nowIndex++;
	}
	
	public double getSum() {
		double sum = 0; // 지역 변수는 값의 초기화가 필수!
		for (double score : this.scoreArray) {
			sum += score;
		}
		return sum;
	}
	
	public double getAverage() {
		double sum = this.getSum();
		
		double average = sum / nowIndex;
		return average;
	}
	
}
