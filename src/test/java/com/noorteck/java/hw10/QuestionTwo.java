package com.noorteck.java.hw10;

public class QuestionTwo {
	public static void main(String[] args) {
		getGender('m');
		getGender('M');
		getGender('f');
		getGender('F');
	}

	public static void getGender(char gender) {
		switch (gender) {
		case 'm':
		case 'M':
			System.out.println("Male");
			break;
		case 'f':
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Not a valid selection");
		}
	}
}
