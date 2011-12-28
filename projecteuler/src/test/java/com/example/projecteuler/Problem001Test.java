package com.example.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem001Test {
	@Test
	public void testProblem001() {
		//
		assertEquals(233168, (new Problem001()).getAnswer());
		//
		assertEquals(23, (new Problem001(10 - 1)).getAnswer());
		//
		assertEquals(233168, (new Problem001(1000 - 1)).getAnswer());
	}

	@Test
	public void testProblem001Alternate() {
		//
		assertEquals(233168, (new Problem001Alternate()).getAnswer());
		//
		assertEquals(23, (new Problem001Alternate(10 - 1)).getAnswer());
		//
		assertEquals(233168, (new Problem001Alternate(1000 - 1)).getAnswer());
	}
}
