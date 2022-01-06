package com.noorteck.java.hw11;

public class MonkeyStatus {
	public static void main(String[] args) {
		boolean areWeInTrouble = monkeyTrouble(true, true);
		System.out.println(areWeInTrouble);
		System.out.println(monkeyTrouble(false, false));
		System.out.println(monkeyTrouble(true, false));
		System.out.println(monkeyTrouble(false, true));
	}
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result = false;
		if(aSmile == true && bSmile == true) {
			result = true;
		} else if(aSmile == false && bSmile == false) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
