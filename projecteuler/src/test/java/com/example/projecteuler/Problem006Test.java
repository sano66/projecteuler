package com.example.projecteuler;

import static org.junit.Assert.*;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.Test;

public class Problem006Test {
	private static Log log = LogFactory.getLog(Problem006Test.class);

	@Test
	public void testProblem006() {
		//
		_assertEquals(25164150, (new Problem006()).getAnswer());
	}

	@Test
	public void testProblem006Alternate() {
		//
		_assertEquals(25164150, (new Problem006Alternate()).getAnswer());
	}

	private void _assertEquals(int expect, int actual) {
		_assertEquals(null, expect, actual);
	}

	private void _assertEquals(String msg, int expect, int actual) {
		DateTime begin = new DateTime();
		assertEquals(expect, actual);
		DateTime end = new DateTime();
		Duration dur = new Duration(begin, end);
		String logMsg = StringUtils.isEmpty(msg) ? "" : msg;
		log.debug(logMsg + " Elapsed: " + dur.getMillis() + " ms");
	}
}
