package ui;

import java.util.Random;

import util.ConsoleUtil;

public class GuessingGameApp {
	private static final int MIN = 1;
	private static final int MAX = 100;

	public static void main(String[] args) {
		ConsoleUtil.printHeader("Welcome to the Guessing Game App!");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number from "+MIN+" to "+MAX+".\nTry to guess it.");
			
			int theNumber = getRandomNumber();
			int numberGuesses = 0;
			System.out.println("DEBUG: theNumber is "+theNumber);
			
			int guess = 0;
			while (guess != theNumber) {
				guess = ConsoleUtil.promptInt("Enter number: ", MIN, MAX);
				numberGuesses++;
				
				int diff = guess - theNumber;
				if (diff > 10) {
					System.out.println("Way too high! Guess again.");
				}
				else if (diff > 0) {
					System.out.println("Too high! Guess again.");
				}
				else if (diff < -10) {
					System.out.println("Way too low! Guess again.");
				}
				else if (diff < 0) {
					System.out.println("Too low! Guess again.");
				}
				else {
					displayWinnerMessage(numberGuesses);
				}
			}
		
			System.out.println();
			choice = ConsoleUtil.promptString("Continue? (y/n) ", "y", "n");
			System.out.println();
		}
		System.out.println("Bye");
	}
	
	private static void displayWinnerMessage(int guessCount) {
		System.out.println("You got it in "+guessCount+" tries!");
		if (guessCount <=3)
			System.out.println("Great work, you are a mathematical wizard!");
		else if (guessCount <=7)
			System.out.println("Not too bad. You've got some potential.");
		else 
			System.out.println("What took you so long? Maybe you should take some lessons.");
	}
	
	private static int getRandomNumber() {
		//int theNumber = (int)(Math.random() * 100) + 1;
		Random rand = new Random();
		int theNumber = rand.nextInt(MAX) + 1;
		return theNumber;
	}

}
