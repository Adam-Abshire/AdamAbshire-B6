package com.noorteck.java.hw10;

public class QuestionThree {
	public static void main(String[] args) {
		oddEven(3);
		oddEven(4);
		oddEven(8);
	}

	public static void oddEven(int number) {
		switch (number % 2) {
		case 0:
			System.out.println("This is an even number");
			break;
		case 1:
			System.out.println("This is an odd number");
			break;
		}
	}
}
