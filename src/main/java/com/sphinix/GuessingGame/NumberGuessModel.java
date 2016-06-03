package com.sphinix.GuessingGame;

/**
 * @author Vardhan
 * 
 */
public class NumberGuessModel {

	private int userGuess = 50;
	private int lowerBound;
	private int upperBound;

	void lower() {
		userGuess = getLowerBound() / 2;
	}

	void higher() {
		userGuess = ((getUpperBound()) / 2) + userGuess;
	}

	public int getCurrentGuess() {
		return userGuess;
	}

	public int getUserGuess() {
		return userGuess;
	}

	public void setUserGuess(int userGuess) {
		this.userGuess = userGuess;
	}

	public int getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}

	public int getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

}
