package interview.questions;
import java.util.ArrayList;

public class Question16 {
	
	// 16. Write a java program to find factorial of a given number?
	
	// method that returns a list of numbers
	public static ArrayList<Integer> factorials(int number) {
		
		// creates ArrayList object to collect numbers
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		// run through all integers between 1 and the given number
		for (int i = 1; i <= number; i++) {
			// if the given number mod iteration is 0 -- then it divides evenly
			if (number % i == 0) {
				// add that number to list
				numList.add(i);
			}
		}
		// return the list of numbers
		return numList;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> results = factorials(15);
		ArrayList<Integer> resultsTwo = factorials(124);
		
		System.out.println(results);
		System.out.println(resultsTwo);
				
	}

}
