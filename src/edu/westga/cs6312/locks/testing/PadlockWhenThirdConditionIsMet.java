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
	
	/**
	 * Test to be sure that the third condition is met with 10 and returns true
	 */
	@Test
	public void testIsThirdConditionMetWith10() {
		Padlock simpleLock = new Padlock(8, 20, 10);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(12);
		boolean results = simpleLock.isThirdConditionMet(10);
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that the third condition is met with 21 and returns true
	 */
	@Test
	public void testIsThirdConditionMetWith21() {
		Padlock simpleLock = new Padlock(8, 20, 49);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(12);
		boolean results = simpleLock.isThirdConditionMet(21);
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that the third condition is not met with 20 and returns true
	 */
	@Test
	public void testIsThirdConditionMetWith20() {
		Padlock simpleLock = new Padlock(8, 20, 49);
		simpleLock.isFirstConditionMet(42);
		simpleLock.isSecondConditionMet(12);
		boolean results = simpleLock.isThirdConditionMet(20);
		assertEquals(false, results);
	}
}
