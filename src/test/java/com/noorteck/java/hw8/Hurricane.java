package com.noorteck.java.hw8;

public class Hurricane {
	public static void main(String[] args) {
		int category = 0;
		int count = 0;
		for (int i = 20; i <= 200; i++) {
			if (i >= 74 && i <= 95) {
				category = 1;
				count += 1;
				System.out.println("Category: " + category + "   Wind Speed: " + i);
			}
			if (i >= 105 && i <= 110) {
				category = 2;
				count += 1;
				System.out.println("Category: " + category + "   Wind Speed: " + i);
			}
			if (i >= 120 && i <= 130) {
				category = 3;
				count += 1;
				System.out.println("Category: " + category + "   Wind Speed: " + i);
			}
			if (i >= 140 && i <= 155) {
				category = 4;
				count += 1;
				System.out.println("Category: " + category + "   Wind Speed: " + i);
			}
			if (i >= 165 && i <= 194) {
				category = 5;
				count += 1;
				System.out.println("Category: " + category + "   Wind Speed: " + i);
			}
		}
		System.out.println("Number of Responses: " + count);
	}
}
