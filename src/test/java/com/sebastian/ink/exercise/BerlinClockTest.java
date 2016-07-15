package com.sebastian.ink.exercise;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BerlinClockTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void whenEmptyCommandLineThenReturnEmptyString() {
		Assert.assertEquals("", BerlinClock.getTime(""));
	}

}
