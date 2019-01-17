package edu.westga.cs6312.locks.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Padlock;

/**
 * This is a class to test the Padlock class
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 * 
 */
public class PadlockWhenCreatePadlock {

	/**
	 * Test to see if the 3-parameter correctly creates a Padlock with combination
	 * (1, 2, 3)
	 */
	@Test
	public void testPadLockWithCombination123() {
		Padlock plainLock = new Padlock(1, 2, 3);
		String result = plainLock.toString();
		assertEquals("This Padlock has the combination (1, 2, 3), is currently at 0, and cannot be opened", result);
	}
}
