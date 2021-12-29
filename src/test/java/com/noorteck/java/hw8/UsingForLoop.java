package com.noorteck.java.hw8;

public class UsingForLoop {
	public static void main(String[] args) {
		for (int i = 1; i <= 32; i++) {
			if (i % 2 == 0 && i >= 2 && i <= 5) {
				System.out.println("Even Number 2-5" + "   " + "Value: " + i);
			} else if (i % 2 == 0 && i >= 6 && i <= 20) {
				System.out.println("Even Number 6-20" + "   " + "Value: " + i);
			}
		}
		for (int j = 1; j <= 32; j++) {
			if (j % 2 != 0 && j >= 15 && j <= 20) {
				System.out.println("Odd Number 15-20" + "   " + "Value: " + j);
			}
		}
	}
}
