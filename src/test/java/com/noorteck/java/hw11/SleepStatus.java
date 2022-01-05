package com.noorteck.java.hw11;

public class SleepStatus {
	public static void main(String[] args) {
		System.out.println("****************");
		boolean amISleeping = sleepIn(false, false);
		if (amISleeping == true) {
			System.out.println("You can Sleep In");
		} else {
			System.out.println("Get Up!");
		}
		System.out.println("sleepIn: " + amISleeping);
		System.out.println("****************");
		System.out.println("****************");
		boolean currentlySleeping = sleepIn(true, false);
		if (currentlySleeping == true) {
			System.out.println("You can Sleep In");
		} else {
			System.out.println("Get Up!");
			System.out.println("sleepIn: " + currentlySleeping);
		}
		System.out.println("****************");
	}

	public static boolean sleepIn(boolean isWeekDay, boolean isVacation) {
		boolean result = false;
		if (isVacation == true) {
			result = true;
		} else if (isWeekDay == true) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}
}

/**
 * Write a method that takes Boolean parameters Method Name: sleepIn Method
 * Return Type: boolean Parameter 1 = boolean isWeekday Parameter 2 = boolean
 * isVacation The parameter isWeekday is true if it is a weekday, the parameter
 * isVacation is true if we are on vacation. We sleep in if it is not a weekday
 * otherwise return false.
 * 
 * if we are on a vacation. Return true if we sleep in
 * 
 * Then call your function from main method: Create a Boolean variable in your
 * main method and assign the value what sleepIn method returns • Variable Name:
 * Boolean amIsleeping; Example: if pass false, false value then your method
 * should return true sleepIn (false, false) true
 * 
 */
