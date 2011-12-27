package com.example.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem001Test {
	@Test
	public void testProblem001() {
		//
		assertEquals(233168, (new Problem001()).getAnswer());
	}

	@Test
	public void testProblem001Alternate() {
		//
		assertEquals(233168, (new Problem001Alternate()).getAnswer());
	}
}
