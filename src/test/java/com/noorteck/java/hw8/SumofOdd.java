package com.noorteck.java.hw8;

public class SumofOdd {
	public static void main(String[] args) {
		int totalEven = 0;
		int totalOdd = 0;
		for (int i = 1; i <= 20; i++) {
			switch (i % 2) {
			case 0:
				totalEven += i;
				break;
			case 1:
				totalOdd += i;
			}
		}
		System.out.println("For Loop");
		System.out.println("Total of Even Numbers = " + totalEven);
		System.out.println("Total of Odd Numbers = " + totalOdd);
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("While Loop");

		int totalEve = 0;
		int totalOd = 0;
		int j = 1;
		while (j <= 20) {
			if (j % 2 == 0) {
				totalEve += j;
			} else {
				totalOd += j;
			}
			j++;
		}
		System.out.println("Total of Even Numbers = " + totalEve);
		System.out.println("Total of Odd Numbers = " + totalOd);
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("Do-While Loop");

		int k = 1;
		int totalEv = 0;
		int totalO = 0;
		do {
			if (k % 2 == 0) {
				totalEv += k;
			} else {
				totalO += k;
			}
			k++;
		} while (k <= 20);
		System.out.println("Total of Even Numbers = " + totalEv);
		System.out.println("Total of Odd Numbers = " + totalO);
	}

}
