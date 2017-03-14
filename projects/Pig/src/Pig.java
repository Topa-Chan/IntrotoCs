/*
 * Tyler Patterson
 * 2 March 2017
 */

import java.util.Random;
import java.util.Scanner;

public class Pig {

	private static Die d1 = new Die();
	private static Die d2 = new Die();
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	static int val1;
	static int val2;
	static boolean valid = false;
	static int compChoice;
	static int compTurn;
	static int playerTurn;

	private static int playerScore = 0;
	private static int compScore = 0;

	public static void main(String[] args) {
		Pig game = new Pig();
		System.out.println("Welcome To The Pig Dice Game!");
		System.out.println("Would You Like To Play The Game?");
		System.out.println();
		System.out.print("Please Entre y/n: ");
		String answer = scan.next();
		if (answer.equals("y") || answer.equals("Y")) {
			System.out.println();
			do {
				System.out.println("Would You Like To Roll or Pass?");
				System.out.print("Please Entre 1 For Roll, or 2 For Pass: ");
				int choice = scan.nextInt();
				if (choice == 1) {
					game.roll();
				} else if (choice == 2) {
					playerScore += playerTurn;
					System.out.println("Okay, Your Score Is: " + playerScore);
					System.out.println("It Is Now The Computer's Turn.");
					game.compRoll();
				} else {
					System.out.println("Please Entre A Correct Choice.");
				}
			} while (!valid);
		} else {
			System.out.println("Okay, Goodbye.");
		}
		if (playerScore >= 100 || (playerScore + playerTurn) >= 100) {
			System.out.println("Congrats! You Won!");
		} else if (compScore >= 100) {
			System.out.println("Sorry Player, You Lose.");
		} else {
			System.out.println("Nobody Wins.");
		}
	}

	public void roll() {
		System.out.println();
		val1 = d1.roll();
		val2 = d2.roll();
		System.out.println("Your Dice Values Are: " + val1 + " & " + val2);
		if (val1 == 1 || val2 == 1) {
			System.out.println("It Is Now The Computer's Turn.");
			compRoll();
		} else if (val1 == 1 && val2 == 1) {
			playerScore = 0;
			System.out.println("It Is Now The Computer's Turn.");
			compRoll();
		} else {
			playerTurn += (val1 + val2);
		}
		System.out.println("Your Score This Turn Is: " + playerTurn);
		System.out.println("Your Score Without This Turn Is: " + playerScore);
		System.out.println("Your Score With This Turn Would Be: " + (playerScore + playerTurn));
		if ((playerScore + playerTurn) >= 100 || playerScore >= 100) {
			valid = true;
		}
		System.out.println();
	}

	public void compRoll() {
		System.out.println();
		compChoice = rand.nextInt(2) + 1;
		playerTurn = 0;
		compTurn = 0;
		if (compScore >= 20) {
			System.out.println("It Is Now Your Turn Player.");
		} else {
			if (compChoice == 1) {
				val1 = d1.roll();
				val2 = d2.roll();
				compTurn = val1 + val2;
				if (val1 == 1 || val2 == 1) {
					System.out.println("It Is Now Your Turn.");
				} else if (val1 == 1 && val2 == 1) {
					compScore = 0;
				} else {
					compScore += (val1 + val2);
				}
			} else if (compChoice == 2) {
				System.out.println("Okay It Is Now Your Turn Player.");
			}
		}
		System.out.println("The Computer's Score Is: " + compScore);
		if (compScore >= 100) {
			valid = true;
		}
		System.out.println();
	}
}
