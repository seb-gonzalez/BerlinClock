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

	@Test
	public void whenNumberOfLinesIsDifferentThanSixThenExceptionIsThrown() {
		Exception e = null;

		try {

			//BerlinClock.getTime(".\nR...\nRRRR\n----\nYYRYYRYYRY.\nRRRR");
			BerlinClock.getTime(".\nR...\nRRRR\n----\nYYRYYRYYRY.");
		} catch (RuntimeException ex) {
			e = ex;
		}

		Assert.assertNotNull(e);
		Assert.assertEquals("Wrong format, only 6 lines allow!", e.getMessage());
	}
	
	@Test
	public void whenInsertExpectedValuesInCommanLineThenReturnTime() {
		Assert.assertEquals("09:54 and 50 seconds", BerlinClock.getTime(".\nR...\nRRRR\n----\nYYRYYRYYRY.\nRRRR") );		
	}
	
	

}
