
package edu.westga.cs6312.locks.model;

/**
 * This class represents a model free hanging padlock with three combinations
 * and its functionality
 * 
 * @author Ibrahim Tonifarah
 * @version 1/17/2019
 *
 */
public class Padlock {
	private int lockCombinationNumber1;
	private int lockCombinationNumber2;
	private int lockCombinationNumber3;
	private int currentLockNumber;
	private boolean canLockOpen;

	/**
	 * This class instantiates the instance variables by setting values for a lock
	 * that cannot currently open
	 * 
	 * @param lockCombinationNumber1 is the first lock combination number
	 * @param lockCombinationNumber2 is the second lock combination number
	 * @param lockCombinationNumber3 is the third lock combination number
	 */
	public Padlock(int lockCombinationNumber1, int lockCombinationNumber2, int lockCombinationNumber3) {
		this.lockCombinationNumber1 = lockCombinationNumber1;
		this.lockCombinationNumber2 = lockCombinationNumber2;
		this.lockCombinationNumber3 = lockCombinationNumber3;
		this.currentLockNumber = 0;
		this.canLockOpen = false;
	}

	/**
	 * Returns a String representation of the padlock object stating the 3 number
	 * combination, the number it is currently pointing to and if the lock can be
	 * opened
	 */
	public String toString() {
		return String.format("This Padlock has the combination (%d, %d, %d), is currently at %d, and cannot be opened",
				this.lockCombinationNumber1, this.lockCombinationNumber2, this.lockCombinationNumber3,
				this.currentLockNumber);
	}

}
