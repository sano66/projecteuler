package com.example.projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem010Test {
	@Test
	public void testProblem010() {
		//
		assertEquals(0, (new Problem010(1)).getAnswer());
		//
		assertEquals(2, (new Problem010(2)).getAnswer());
		//
		assertEquals(5, (new Problem010(3)).getAnswer());
		//
		assertEquals(5, (new Problem010(4)).getAnswer());
		//
		assertEquals(10, (new Problem010(5)).getAnswer());
		//
		assertEquals(17, (new Problem010(10)).getAnswer());
		//
		assertEquals(28, (new Problem010(11)).getAnswer());
		//
		assertEquals(28, (new Problem010(12)).getAnswer());
		//
		assertEquals(41, (new Problem010(13)).getAnswer());
		//
		assertEquals(41, (new Problem010(14)).getAnswer());
		//
		assertEquals(58, (new Problem010(17)).getAnswer());
		//
		assertEquals(1060, (new Problem010(100)).getAnswer());
		//
		assertEquals(142913828922L, (new Problem010(2000000)).getAnswer());
	}
}
