package com.noorteck.java.hw10;

public class QuestionOne {
	public static void main(String[] args) {
		calculate(2.0, 4.0, '+');
		calculate(8.0, 6.0, '-');
		calculate(2.0, 4.2, '*');
		calculate(6.6, 3.3, '/');
		calculate(7.3, 3.2, '%');
	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
		switch (mathOperationSign) {
		case '+':
			System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
			break;
		case '-':
			System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
			break;
		case '*':
			System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
			break;
		case '/':
			System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
			break;
		default:
			System.out.println("This is not a valid choice");
		}
	}
}
