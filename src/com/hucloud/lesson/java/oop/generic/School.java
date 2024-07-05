package com.hucloud.lesson.java.oop.generic;

import java.util.List;
import java.util.ArrayList;

public class School {

	public static void main(String[] args) {
		
		// List (Interface) ==> ArrayList (Class)
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(100);
		int score = scoreList.get(0);
		System.out.println(score);
		
		
		GenericScoreCalculator<Integer> calc = new GenericScoreCalculator<>();
		calc.addScore(100);
		calc.addScore(90);
		calc.addScore(80);
		calc.addScore(70);
		calc.addScore(60);
		
		int sum = calc.getSum();
		System.out.println(sum);
		
		double average = calc.getAverage();
		System.out.println(average);
		
		GenericScoreCalculator<Double> calc2 = new GenericScoreCalculator<>();
		calc2.addScore(100.0);
		calc2.addScore(97.5);
		calc2.addScore(67.8);
		
		int sum2 = calc2.getSum();
		System.out.println(sum2);
		
		double average2 = calc2.getAverage();
		System.out.println(average2);
		
	}
	
}
