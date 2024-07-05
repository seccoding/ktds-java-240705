package com.hucloud.lesson.java.oop.generic;

/**
 * 원하는 타입으로 점수를 관리할 수 있는 기능.
 * - 점수도 원하는 타입으로 추가할 수 있음.
 * - 합계도 우리가 원하는 타입으로 추가할 수 있음.
 * - 평균도 우리가 원하는 타입으로 추가할 수 있음.
 */
public class GenericScoreCalculator<T> {

	// Object <-- 모든 클래스(Primitive Type포함)들의 최상위 부모클래스.
	private Object[] scoreArray;
	private int nowIndex;
	
	public GenericScoreCalculator() {
		this.scoreArray = new Object[2];
	}
	
	public void addScore(T score) {
		if (nowIndex == this.scoreArray.length) {
			Object[] tempScoreArray = new Object[this.scoreArray.length + 2];
			System.arraycopy(this.scoreArray, 0, tempScoreArray, 0, this.scoreArray.length);
			this.scoreArray = tempScoreArray; // 2 ==> 4 ==> 6 ==> 8
		}
		
		this.scoreArray[nowIndex] = score;
		nowIndex++;
	}
	
	public int getSum() {
		int sum = 0; // 지역 변수는 값의 초기화가 필수!
		
		for (int i = 0; i < nowIndex; i++) {
			// Integer.parseInt("123");
			sum += Integer.parseInt(this.scoreArray[i].toString());
		}
		
		return sum;
	}
	
	public double getAverage() {
		int sum = this.getSum();
		
		double average = sum / ((double) nowIndex);
		return average;
	}
}









