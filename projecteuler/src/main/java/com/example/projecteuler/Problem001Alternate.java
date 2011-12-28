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
public class Problem001Alternate {
	private int answer = 0;
	@Deprecated
	private static final int TARGET = 999;

	@Deprecated
	public Problem001Alternate() {
		answer = sumDivideBy(3, TARGET) + sumDivideBy(5, TARGET)
				- sumDivideBy(15, TARGET);
	}

	public Problem001Alternate(int target) {
		answer = sumDivideBy(3, target) + sumDivideBy(5, target)
				- sumDivideBy(15, target);
	}

	private int sumDivideBy(int n, int target) {
		int p = target / n;
		return n * (1 + p) * p / 2;
	}

	public int getAnswer() {
		return answer;
	}
}
