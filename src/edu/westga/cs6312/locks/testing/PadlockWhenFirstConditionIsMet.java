package edu.westga.cs6312.locks.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Padlock;

/**
 * This is a class to test the functionality of the Padlock isFirstConditionMet method
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 * 
 */
class PadlockWhenFirstConditionIsMet {

	/**
	 * Test to be sure that when the lock spins 42 ticks to the right the current value equals first combination number
	 */
	@Test
	public void testIsFirstConditionMetWith42() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		boolean results = simpleLock.isFirstConditionMet(42);
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that when the lock spins 49 ticks to the right the current value equals first combination number
	 */
	@Test
	public void testIsFirstConditionMetWith49() {
		Padlock simpleLock = new Padlock(1, 20, 15);
		boolean results = simpleLock.isFirstConditionMet(49);
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that when the lock spins 55 ticks to the right the current value equals first combination number
	 */
	@Test
	public void testIsFirstConditionMetWith55() {
		Padlock simpleLock = new Padlock(45, 20, 15);
		boolean results = simpleLock.isFirstConditionMet(55);
		assertEquals(true, results);
	}
	
	/**
	 * Test to be sure that when the lock spins 50 ticks to the right the current value will not equal first combination number
	 */
	@Test
	public void testIsFirstConditionMetWith50() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		boolean results = simpleLock.isFirstConditionMet(50);
		assertEquals(false, results);
	}

}
