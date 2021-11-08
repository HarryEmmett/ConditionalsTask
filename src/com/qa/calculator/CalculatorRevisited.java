package com.qa.calculator;

public class CalculatorRevisited {

	public static void main(String[] args) {
		System.out.println(add(100, 50));
		System.out.println(subtract(20, 5));
		System.out.println(divide(7, 10));
		System.out.println(divide(10, 7));
		System.out.println(multiply(10, 50));
	}

	public static int add(int num1, int num2) {
		return num1 + num2;

	}

	public static int subtract(int num3, int num4) {
		return num3 - num4;

	}

	public static double divide(double num5, double num6) {
		if(num6>num5) {
			return num5/num6;
		} else {
			System.out.print("Division cannot be performed, second parameter smaller than the first ");
			return 0;
		}
	}

	public static int multiply(int num7, int num8) {
		return num7 * num8;

	}

}
