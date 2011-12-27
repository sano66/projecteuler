package com.example.projecteuler;

/**
 * Problem 7
 * 
 * 28 December 2001
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number? *
 * 
 * @author sano
 * 
 */
public class Problem007 {
	private int answer = 0;
	private static final int TARGET = 10001;
	private int[] primeNumberArray = new int[TARGET];

	public Problem007() {
		for (int i = 0; i < TARGET; i++) {
			primeNumberArray[i] = getNextPrimeNumber(i);
		}
		answer = primeNumberArray[TARGET - 1];
	}

	private int getNextPrimeNumber(int n) {
		if (n == 0)
			return 2;
		int nextPrimeNumber = primeNumberArray[n - 1];
		nextPrimeNumber++;
		int j = 0;
		while (j < n) {
			while (nextPrimeNumber % primeNumberArray[j] == 0) {
				++nextPrimeNumber;
				j = 0;
			}
			j++;
		}
		return nextPrimeNumber;
	}

	public int getAnswer() {
		return answer;
	}
}
