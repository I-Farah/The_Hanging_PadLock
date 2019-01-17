package edu.westga.cs6312.locks.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Padlock;

/**
 * This is a class to test the functionality of a Padlock class Spin left method
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 * 
 */
class PadlockWhenSpinLeft {

	/**
	 * Test to be sure that spinning the padlock 10 units to the left from 0 will leave it at 10
	 */
	@Test
	void testWhenMoving10LeftOf0Is10() {
		Padlock simpleLock = new Padlock(8, 20, 15);
		simpleLock.spinLeft(10);
		int results = simpleLock.getCurrentValue();
		assertEquals(10, results);
	}
	
	/**
	 * Test to be sure that spinning the padlock 31 units to the left from 0 will leave it at 31
	 */
	@Test
	void testWhenMoving31LeftOf0Is31() {
		Padlock simpleLock = new Padlock(3, 1, 40);
		simpleLock.spinLeft(31);
		int results = simpleLock.getCurrentValue();
		assertEquals(31, results);
	}
	
	/**
	 * Test to be sure that spinning the padlock 50 units to the left from 0 will leave it at 0
	 */
	@Test
	void testWhenMoving50LeftOf0Is0() {
		Padlock simpleLock = new Padlock(3, 1, 40);
		simpleLock.spinLeft(50);
		int results = simpleLock.getCurrentValue();
		assertEquals(0, results);
	}
	
	/**
	 * Test to be sure that spinning the padlock 49 units to the left from 0 will leave it at 49
	 */
	@Test
	void testWhenMoving49LeftOf0Is49() {
		Padlock simpleLock = new Padlock(3, 1, 40);
		simpleLock.spinLeft(49);
		int results = simpleLock.getCurrentValue();
		assertEquals(49, results);
	}
	
	/**
	 * Test to be sure that spinning the padlock 165 units to the left from 0 will leave it at 15
	 */
	@Test
	void testWhenMoving165LeftOf0Is15() {
		Padlock simpleLock = new Padlock(3, 1, 40);
		simpleLock.spinLeft(165);
		int results = simpleLock.getCurrentValue();
		assertEquals(15, results);
	}
}
