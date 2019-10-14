package com.example.projecteuler;

/**
 * Problem 2
 * 
 * 19 October 2001
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms. *
 * 
 * @author sano
 * 
 */
public class Problem002 {
	private int answer = 0;

	public Problem002(int target) {
		int n = 0;
		for (int i = 1; (n = fibonacci(i)) < target; i++)
			if (n % 2 == 0)
				answer += n;
	}

	private int fibonacci(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		return fibonacci(n - 2) + fibonacci(n - 1);
	}

	public int getAnswer() {
		return answer;
	}
}