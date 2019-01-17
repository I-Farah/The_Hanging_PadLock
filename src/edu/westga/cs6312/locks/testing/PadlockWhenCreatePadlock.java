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

	/**
	 * Test to see if the 3-parameter correctly creates a Padlock with a different
	 * combination other than (1, 2, 3) so we will test (7, 9, 11)
	 */
	@Test
	public void testPadLockWithCombination7911() {
		Padlock plainLock = new Padlock(7, 9, 11);
		String result = plainLock.toString();
		assertEquals("This Padlock has the combination (7, 9, 11), is currently at 0, and cannot be opened", result);
	}

	/**
	 * Test to see if the 3-parameter correctly creates a Padlock with a combination
	 * larger and not in order. Testing 56, 33, 22297
	 * 
	 */
	@Test
	public void testPadLockWithCombination563322297() {
		Padlock plainLock = new Padlock(56, 33, 22297);
		String result = plainLock.toString();
		assertEquals("This Padlock has the combination (56, 33, 22297), is currently at 0, and cannot be opened", result);
	}
}
