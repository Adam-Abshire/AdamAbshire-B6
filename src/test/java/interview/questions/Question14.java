package interview.questions;
import java.lang.Math;

public class Question14 {

	// 14. Write a java program to check whether a given number is a prime or not?
	
	// method that returns a boolean value
	public static boolean isPrime(int number) {
		
		// if the given number is less than 2 then it is not prime
		if (number < 2) {
			return false;
		}
		// lowest is the low number you want to divide into the given number
		// high is the highest number you want to divide into the given number
		// We will be dividing between numbers 2 && the square root of the given number
		double lowest = 2;
		double high = Math.sqrt(number);
		// loop through 2 and square root of given number
		for (double i = lowest; i <= high; i++) {
			// divide given number by each number between 2 and square root of the given number
			// modulus tells us if there is a remainder
			if (number % i == 0) {
				// if there is no remainder (it divides evenly) it is not prime -- return false
				return false;
			}
		}
		// if nothing divides evenly -- then it is true
		return true;
	}
	
	public static void main(String[] args) {
		boolean result = isPrime(45); // false
		boolean resultTwo = isPrime(11); // true
		boolean resultThree = isPrime(1223); // true
		boolean resultFour = isPrime(44); // false
		boolean resultFive = isPrime(1); // false
		
		System.out.println(result);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		System.out.println(resultFive);
	}
}
