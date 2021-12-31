package com.noorteck.java.hw10;

public class QuestionFour {
	public static void main(String[] args) {
		System.out.println("****");
		getDoWhileLoopResult(2, 8);
		System.out.println("****");
		getDoWhileLoopResult(9, 1);
		System.out.println("****");
	}

	public static void getDoWhileLoopResult(int minNum, int maxNum) {
		do {
			System.out.println(minNum);
			minNum++;
		} while (minNum <= maxNum);
	}
}
