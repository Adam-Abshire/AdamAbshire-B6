package com.noorteck.java.hw8;

public class UsingForLoop {
	public static void main(String[] args) {
		for(int i = 1; i<=32; i++) {
			if(i%2== 0 && i >=2 && i <= 5) {
				System.out.println("Even Number 2-5" + "   " + "Value: " + i);
			}
			if(i%2==0 && i>=6 && i<=20) {
				System.out.println("Even Number 6-20" + "   " + "Value: " + i);
			}
			if(i%2!=0 && i>=15 && i<=20) {
				System.out.println("Odd Number 15-20" + "   " + "Value: " + i);
			}
		}
	}
}
