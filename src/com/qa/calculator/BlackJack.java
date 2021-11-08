package com.qa.calculator;

public class BlackJack {

	public static void main(String[] args) {
		blackjack(5, 22);
		blackjack(22, 1);
		blackjack(22, 22);
		blackjack(10, 10);
		blackjack(11, 11);
		blackjack(15, 10);
		blackjack(7, 20);
	}

	public static void blackjack(int a, int b) {
		if (a > 21 && b < 21) {
			System.out.println("Number A over 21, B is closer: " + b + ".");
		} else if (a < 21 && b > 21) {
			System.out.println("Number B is over 21, A is closer: " + a + ".");
		} else if (a < 21 && b < 21 && a != b) {
			// check a > b return a closer
			// check b > a return b closer
			if (a > b && a != b) {
				System.out.println("A is closer to 21: " + a + ", than B: " + b + ".");
			} else {
				System.out.println("B is closer to 21: " + b + ", than A: " + a + ".");
			}
		} else if (a == b && a < 21 && b < 21) {
			System.out.println("Numbers are: " + a + " both win.");
		} else if (a == b && a > 21 && b > 21) {
			System.out.println("Both numbers are over 21, no winner.");
		} else {
			System.out.println("Both numbers over 21.");
		}

	}
}