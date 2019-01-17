package edu.westga.cs6312.locks.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Padlock;

/**
 * This is a class to test the functionality of the Padlock isSecondConditionMet
 * method
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 * 
 */
class PadlockWhenSecondConditionIsMet {

	/**
	 * Test to be sure that the first condition is checked and then the second
	 * condition produces accurate results with 20
	 */
	@Test
	public void testIsSecondConditionMetWith20() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		boolean results = simpleLock.isSecondConditionMet(20);
		assertEquals(false, results);
	}

	/**
	 * Test to be sure that the first condition is checked and then the second
	 * condition produces accurate results with 30
	 */
	@Test
	public void testIsSecondConditionMetWith30() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		boolean results = simpleLock.isSecondConditionMet(30);
		assertEquals(false, results);
	}

	/**
	 * Test to be sure that the first condition is checked and then the second
	 * condition produces accurate results with 27
	 */
	@Test
	public void testIsSecondConditionMetWith27() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		boolean results = simpleLock.isSecondConditionMet(27);
		assertEquals(false, results);
	}
	
	/**
	 * Test to be sure that the first condition is checked and then the second
	 * condition produces accurate results with 5
	 */
	@Test
	public void testIsSecondConditionMetWith5() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		boolean results = simpleLock.isSecondConditionMet(5);
		assertEquals(false, results);
	}

}
