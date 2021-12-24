package com.noorteck.java.hw8;

public class SumofOdd {
	public static void main(String[] args) {
		int totalEven = 0;
		int totalOdd = 0;
		for(int j = 1; j <= 20; j++) {
			if(j%2 == 0) {
				totalEven+=j;
			} else {
				totalOdd+=j;
			}
		}
		System.out.println("For Loop");
		System.out.println("Total of Even Numbers = " + totalEven);
		System.out.println("Total of Odd Numbers = " + totalOdd);
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("While Loop");
		
		totalEven = 0;
		totalOdd = 0;
		int i = 1;
		while(i<=20) {
			if(i%2 == 0) {
				totalEven+=i;
			} else {
				totalOdd+=i;
			}
			i++;
		}
		System.out.println("Total of Even Numbers = " + totalEven);
		System.out.println("Total of Odd Numbers = " + totalOdd);
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("Do-While Loop");
		
		int k = 1;
		totalEven = 0;
		totalOdd = 0;
		do {
			if(k%2==0) {
				totalEven+=k;
			}else {
				totalOdd+=k;
			}
			k++;
		}while(k<=20);
		System.out.println("Total of Even Numbers = " + totalEven);
		System.out.println("Total of Odd Numbers = " + totalOdd);
	}
	
}
