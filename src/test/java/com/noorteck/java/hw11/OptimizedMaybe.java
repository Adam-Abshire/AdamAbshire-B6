package com.noorteck.java.hw11;

public class OptimizedMaybe {
	public static void main(String[] args) {
		System.out.println("**********************************");
		boolean vacation = false;
		String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for(int day = 0; day < dayOfTheWeek.length; day++) {
			System.out.println(dayOfTheWeek[day]);
			System.out.println(sleepIn(dayOfTheWeek[day], vacation));
			System.out.println("**********************************");
		}
	}

	public static String sleepIn(String dayOfTheWeek, boolean onVacation) {
		String result = "";
		if (onVacation == true) {
			result = "You're on vacation, you can sleep in..";
		} else {
			switch (dayOfTheWeek) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				result = "Its a weekday, you have to get up!";
				break;
			case "Saturday":
			case "Sunday":
				result = "Its the weekend, you can sleep in..";
			}
		}
		return result;
	}
}
