package com.sebastian.ink.exercise;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LineParserTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void whenLineDoesNotContainsDotsThenExceptionIsThrown() {
		Exception e = null;

		try {

			LineParser.parseHoursX5("RRRRx");

		} catch (RuntimeException ex) {
			e = ex;
		}

		Assert.assertNotNull(e);
		Assert.assertEquals("Wrong format, only dots allow!", e.getMessage());
	}

}
