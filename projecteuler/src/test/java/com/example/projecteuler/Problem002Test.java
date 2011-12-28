package com.example.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem002Test {
	@Test
	public void testProblem002() {
		//
		assertEquals(10, (new Problem002(9)).getAnswer());
		//
		assertEquals(44, (new Problem002(35)).getAnswer());
		//
		assertEquals(4613732, (new Problem002(4000000)).getAnswer());
	}
}
