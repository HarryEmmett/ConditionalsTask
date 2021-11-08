package com.qa.calculator;

public class FlowChartTask1BETTER {

	public static void main(String[] args) {
		System.out.println(function(1, 2, true));
		System.out.println(function(3, 3, false));
		System.out.println(function(1, 1, true));

	}

	public static int function(int num1, int num2, boolean bool)	{
		if (bool == true) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
}
