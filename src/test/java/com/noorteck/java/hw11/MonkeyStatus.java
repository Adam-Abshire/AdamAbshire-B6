package com.noorteck.java.hw11;

public class MonkeyStatus {
	public static void main(String[] args) {
		//you are in trouble if both monkeys are smiling or both monkeys are not smiling.
		boolean areWeInTrouble = monkeyTrouble(true, true);
		System.out.println("are we in trouble: " + areWeInTrouble);
		System.out.println("are we in trouble: " + monkeyTrouble(false, false));
		System.out.println("are we in trouble: " + monkeyTrouble(true, false));
		System.out.println("are we in trouble: " + monkeyTrouble(false, true));
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
