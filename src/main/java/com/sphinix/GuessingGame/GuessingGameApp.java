package com.sphinix.GuessingGame;

import com.sphinix.GuessingGame.NumberGuessModel;

import java.util.Scanner;

/**
 * @author Vardhan
 * 
 */
public class GuessingGameApp {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String guess;
		NumberGuessModel numGuess = new NumberGuessModel();

		System.out
				.println("Please think of a number between 1 and 100 and type ready");

		if ("ready".equalsIgnoreCase(input.next())) {
			do {
				System.out.print("Is the number " + numGuess.getCurrentGuess()
						+ "(higher/lower/yes): ");
				guess = input.next();

				if ("higher".equalsIgnoreCase(guess)) {
					numGuess.setUpperBound(numGuess.getCurrentGuess());
					numGuess.higher();
				} else if ("lower".equalsIgnoreCase(guess)) {
					numGuess.setLowerBound(numGuess.getCurrentGuess());
					numGuess.lower();
				} else if ("yes".equalsIgnoreCase(guess)) {
					System.out.println("Correct!");
				}
			} while (!"yes".equalsIgnoreCase(guess));
		}
	}
}
