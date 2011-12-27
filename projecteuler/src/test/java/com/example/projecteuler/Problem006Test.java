package com.example.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem006Test {
	@Test
	public void testProblem006() {
		//
		assertEquals(25164150, (new Problem006()).getAnswer());
	}

	@Test
	public void testProblem006Alternate() {
		//
		assertEquals(25164150, (new Problem006Alternate()).getAnswer());
	}

}
