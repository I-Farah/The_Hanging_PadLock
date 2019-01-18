
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
	 * 
	 * @return string representation of padlock object
	 */
	public String toString() {
		return String.format("This Padlock has the combination (%d, %d, %d), is currently at %d, and cannot be opened",
				this.lockCombinationNumber1, this.lockCombinationNumber2, this.lockCombinationNumber3,
				this.currentLockNumber);
	}

	/**
	 * Allows to spin the dial on the Padlock to the left incrementing the number on
	 * the dials face
	 * 
	 * @param ticks is the number of ticks to be moved on the dials face
	 */
	public void spinLeft(int ticks) {
		if (this.currentLockNumber == 0) {
			this.currentLockNumber = ticks;
			
			while (this.currentLockNumber > 49) {
				this.currentLockNumber = this.currentLockNumber - 50;
			}
		} else if (ticks <= 49) {
			this.currentLockNumber += ticks;
		} else {
			while (ticks > 49) {
				ticks = ticks - 50;
			}
			this.currentLockNumber += ticks;
		}

		if (this.getCurrentValue() == this.lockCombinationNumber2) {
			this.canLockOpen = true;
		} else {
			this.canLockOpen = false;
		}
		
	}

	/**
	 * Allows to spin the dial on the Padlock to the right incrementing the number
	 * on the dials face
	 * 
	 * @param ticks is the number of ticks to be moved on the dials face
	 */
	public void spinRight(int ticks) {
		if (this.currentLockNumber == 0) {
			this.currentLockNumber = 50 - ticks;
			
			while (this.currentLockNumber < 0) {
				this.currentLockNumber = 50 + this.currentLockNumber;
			}
		} else if (ticks <= 50) {
			this.currentLockNumber += (50 - ticks);
		} else {
			while (ticks > 50) {
				ticks = ticks - 50;
			}
			this.currentLockNumber += (50 - ticks);
		}
		
		if (this.getCurrentValue() == this.lockCombinationNumber1) {
			this.canLockOpen = true;
		} else {
			this.canLockOpen = false;
		}
	}

	/**
	 * Returns the current value on the Padlock
	 * 
	 * @return current lock value
	 */
	public int getCurrentValue() {
		return this.currentLockNumber;
	}

	/**
	 * Checks if the currentLockNumber equals the first lock combination number after the right spin
	 * 
	 * @param ticks number of ticks to the right
	 * @return true only if the first condition is met
	 */
	public boolean isFirstConditionMet(int ticks) {
		this.spinRight(ticks);
		return this.canLockOpen;
	}
	
	/**
	 * Checks if the currentLockNumber equals the second lock combination number after the left spin
	 * 
	 * @param ticks number of ticks to the left
	 * @return true only if the second condition is met
	 */
	public boolean isSecondConditionMet(int ticks) {
		if (this.canLockOpen) {
			this.spinLeft(ticks);
		}
		return this.canLockOpen;
	}

}
