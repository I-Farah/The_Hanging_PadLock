package edu.westga.cs6312.locks.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Padlock;

/**
 * This is a class to test the functionality of the Padlock class Spin right method
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 * 
 */
class PadlockWhenSpinRight {

	/**
	 * Test to be sure that spinning the padlock 10 units to the right from 0 will leave it at 40
	 */
	@Test
	void testWhenMoving10RightOf0Is40() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		simpleLock.spinRight(10);
		int results = simpleLock.getCurrentValue();
		assertEquals(40, results);
	}
	
	/**
	 * Test to be sure that spinning the padlock 55 units to the right from 0 will leave it at 45
	 */
	@Test
	void testWhenMoving55RightOf0Is45() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		simpleLock.spinRight(55);
		int results = simpleLock.getCurrentValue();
		assertEquals(45, results);
	}
	
	/**
	 * Test to be sure that spinning the padlock 49 units to the right from 0 will leave it at 1
	 */
	@Test
	void testWhenMoving49RightOf0Is1() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		simpleLock.spinRight(49);
		int results = simpleLock.getCurrentValue();
		assertEquals(1, results);
	}
	
	/**
	 * Test to be sure that spinning the padlock 50 units to the right from 0 will leave it at 0
	 */
	@Test
	void testWhenMoving50RightOf0Is0() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		simpleLock.spinRight(50);
		int results = simpleLock.getCurrentValue();
		assertEquals(0, results);
	}
}
