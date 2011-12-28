package com.example.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem007Test {
	@Test
	public void testProblem007() {
		//
		assertEquals(104743, (new Problem007()).getAnswer());
		//
		assertEquals(13, (new Problem007(6)).getAnswer());
		//
		assertEquals(104743, (new Problem007(10001)).getAnswer());
	}
}
