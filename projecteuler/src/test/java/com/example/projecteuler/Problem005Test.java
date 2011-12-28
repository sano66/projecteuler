package com.example.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem005Test {
	@Test
	public void testProblem005() {
		//
		assertEquals(232792560, (new Problem005()).getAnswer());
		//
		assertEquals(2520, (new Problem005(10)).getAnswer());
		//
		assertEquals(232792560, (new Problem005(20)).getAnswer());
		//
		try {
			assertEquals(232792560, (new Problem005(21)).getAnswer());
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("21", e.getMessage());
		}
	}
}
