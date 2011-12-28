package com.example.projecteuler;

/**
 * Problem 1
 * 
 * 05 October 2001
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author sano
 * 
 */
public class Problem001 {
	private int answer = 0;
	@Deprecated
	private static final int TARGET = 999;

	@Deprecated
	public Problem001() {
		for (int i = 1; i < TARGET + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				answer += i;
		}
	}

	public Problem001(int target) {
		for (int i = 1; i < target + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				answer += i;
		}
	}

	public int getAnswer() {
		return answer;
	}
}
