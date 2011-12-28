package com.example.projecteuler;

/**
 * Problem 6
 * 
 * 14 December 2001
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
 * numbers is,
 * 
 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
 * squares of the first ten natural numbers and the square of the sum is 3025
 * 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author sano
 * 
 */
public class Problem006 {
	private int answer = 0;

	public Problem006(int target) {
		int sum_square = 0;
		for (int i = 1; i < target + 1; i++)
			sum_square += (i * i);
		int square_sum = (1 + target) * target / 2;
		answer = (square_sum * square_sum) - sum_square;
	}

	public int getAnswer() {
		return answer;
	}
}
