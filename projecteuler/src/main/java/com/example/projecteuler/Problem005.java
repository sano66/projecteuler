package com.example.projecteuler;

/**
 * Problem 5
 * 
 * 30 November 2001
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20? *
 * 
 * @author sano
 * 
 */
public class Problem005 {
	private int answer = 1;
	@Deprecated
	private static final int TARGET = 20;
	private static final int[] multipleNumberArray = { 1, 2, 3, 2, 5, 1, 7, 2,
			3, 1, 11, 1, 13, 1, 1, 2, 17, 1, 19, 1 };

	@Deprecated
	public Problem005() {
		// answer = 1 * 2 * 3 * 2 * 5 * 1 * 7 * 2 * 3 * 1; // 2520
		// answer *= 11 * 1 * 13 * 1 * 1 * 2 * 17 * 1 * 19 * 1; // 232792560
		for (int i = 0; i < TARGET; i++) {
			answer *= multipleNumberArray[i];
		}
	}

	public Problem005(int target) {
		// answer = 1 * 2 * 3 * 2 * 5 * 1 * 7 * 2 * 3 * 1; // 2520
		// answer *= 11 * 1 * 13 * 1 * 1 * 2 * 17 * 1 * 19 * 1; // 232792560
		if (target > 20)
			throw new IllegalArgumentException(String.valueOf(target));
		for (int i = 0; i < target; i++) {
			answer *= multipleNumberArray[i];
		}
	}

	public int getAnswer() {
		return answer;
	}
}
