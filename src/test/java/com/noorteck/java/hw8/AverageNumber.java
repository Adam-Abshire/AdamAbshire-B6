package com.noorteck.java.hw8;

public class AverageNumber {
	public static void main(String[] args) {
		int total = 0;
		int iterations = 0;
		for (int i = 20; i <= 30; i++) {
			total += i;
			iterations += 1;
		}
		System.out.println("****************************");
		System.out.println("For Loop");
		System.out.println("Average between 20 & 30: " + total / iterations);
		System.out.println("****************************");

		int tot = 0;
		int iter = 0;
		int j = 20;
		while (j <= 30) {
			tot += j;
			iter += 1;
			j++;
		}
		System.out.println("While Loop");
		System.out.println("Average between 20 & 30: " + tot / iter);
		System.out.println("****************************");

		int to = 0;
		int it = 0;
		int k = 20;
		do {
			to += k;
			it += 1;
			k++;
		} while (k <= 30);
		System.out.println("Do While Loop");
		System.out.println("Average between 20 & 30: " + to / it);
		System.out.println("****************************");
	}
}
