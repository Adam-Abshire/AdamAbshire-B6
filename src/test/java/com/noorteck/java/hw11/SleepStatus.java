package com.noorteck.java.hw11;

public class SleepStatus {
	public static void main(String[] args) {
		System.out.println("*************************");
		String[] daysOfTheWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		boolean vacation = false;
		//determines whether or not you are on vacation..
		if(vacation == true) {
			System.out.println("You're on vacation....");
			System.out.println("*************************");
		}else {
		//Loop through each day of the week to determine if you can sleep in or not, prints result to console for each day
			for (int day = 0; day <= daysOfTheWeek.length - 1; day++) {
				if (isWeekDay(daysOfTheWeek[day]) == true) {
					System.out.println(daysOfTheWeek[day] + " is a weekday");
					System.out.println(booleanToString(sleepIn(isWeekDay(daysOfTheWeek[day]), vacation)));
					System.out.println("*************************");
				} else {
					System.out.println(daysOfTheWeek[day] + " is a weekend");
					System.out.println(booleanToString(sleepIn(isWeekDay(daysOfTheWeek[day]), vacation)));
					System.out.println("*************************");
				}
			}
		}
	}

	// Function takes two boolean parameters and returns a boolean value - whether
	// or not you can sleep in
	// True means that you can sleep in - False means that you have to wake up early
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

	// Function takes the sleep in boolean and translates it into plain language
	// string
	public static String booleanToString(boolean sleepIn) {

		String result = "";
		if (sleepIn == true) {
			result = "You can sleep in...";
		} else {
			result = "You have to get up!";
		}
		return result;
	}

	// Takes a string and determines if it is a weekday or weekend
	public static boolean isWeekDay(String dayOfTheWeek) {
		boolean isWeekDay = false;
		switch (dayOfTheWeek) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			isWeekDay = true;
			break;
		case "Saturday":
		case "Sunday":
			isWeekDay = false;
		}
		return isWeekDay;
	}
}
//Question *#*#*#*#*#*#*#*#*#*#*
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

// This was the original version #############################################
/**
 * System.out.println("****************"); boolean amISleeping = sleepIn(false,
 * false); if (amISleeping == true) { System.out.println("You can Sleep In"); }
 * else { System.out.println("Get Up!"); } System.out.println("sleepIn: " +
 * amISleeping); System.out.println("****************");
 * System.out.println("****************"); boolean currentlySleeping =
 * sleepIn(true, false); if (currentlySleeping == true) {
 * System.out.println("You can Sleep In"); } else { System.out.println("Get
 * Up!"); System.out.println("sleepIn: " + currentlySleeping); }
 * System.out.println("****************");
 */

//This was for the sleepIn & booleanToString - prints "sleepIn: true" || "sleepIn: false"
/**
 * String canISleep = booleanToString(sleepIn(false, true));
 * System.out.println(canISleep); System.out.println("sleepIn: " +
 * sleepIn(false, true));
 */

//Playing around with arrays ####################################################
/**
 * String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
 * "Friday", "Saturday", "Sunday"}; boolean isWeekDay; for(int i = 0; i <=
 * daysOfTheWeek.length - 1; i++) { switch(daysOfTheWeek[i]) { case "Monday":
 * case "Tuesday": case "Wednesday": case "Thursday": case "Friday": isWeekDay =
 * true; System.out.println(daysOfTheWeek[i] + " is a weekday");
 * System.out.println(booleanToString(sleepIn(isWeekDay, false)));
 * System.out.println("*************************"); break; case "Saturday": case
 * "Sunday": isWeekDay = false; System.out.println(daysOfTheWeek[i] + " is a
 * weekend"); System.out.println(booleanToString(sleepIn(isWeekDay, true)));
 * System.out.println("**************************"); } }
 */
