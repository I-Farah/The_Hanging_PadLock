package edu.westga.cs6312.locks.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Padlock;

/**
 * This is a class to test the functionality of the Padlock isThirdConditionMet
 * method
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 * 
 */
class PadlockWhenThirdConditionIsMet {

	/**
	 * Test to be sure that the third condition is met with 5 and returns true
	 */
	@Test
	public void testIsThirdConditionMetWith5() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(12);
		boolean results = simpleLock.isThirdConditionMet(5);
		assertEquals(true, results);
	}
}
