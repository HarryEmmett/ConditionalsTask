package com.qa.calculator;

public class TestResult {

	public static void main(String[] args) {
		System.out.print("Average score is: ");
		System.out.println(totalmark(100, 125, 87));
	}

	public static float totalmark(int result1, int result2, int result3) {
		int total = result1 + result2 + result3;
		return percentage(total);

	}

	public static float percentage(int total) {
		return total * 100 / 450;
	}

}
