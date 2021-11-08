package com.qa.calculator;

public class FlowCHartTask2 {

	public static void main(String[] args) {
		function(4000);
		function(1000);
		function(50);

	}

	public static void function(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
				System.out.println("END");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
					System.out.println("END");
				} else {
					System.out.println("E");
					System.out.println("END");
				}
			}

		} else if (a < 2000) {
			System.out.println(1);
				if (a > 100) {
					System.out.println(3);
					if (a > 600) {
						System.out.println(5);
						System.out.println("END");
					} else {
						System.out.println(4);
						if (a > 500) {
							System.out.println(6);
							System.out.println("END");
						} else {
							System.out.println(7);
							System.out.println("END");
						}
					}
				} else {
					System.out.println(2);
					System.out.println("END");
				}
				
				
	    }
	}
}
