package interview.questions;

public class Question13 {

	
	// 13. Write a java program to swap two numbers without using third variable?
	
	public static void main(String[] args) {
		
		int numOne = 111, numTwo = 222;
		System.out.println(numOne + " " + numTwo);
		
		// 111 + 222 becomes 333
		numOne += numTwo;
		// 333 - 111 = 222
		numTwo = numOne - numTwo;
		// 333 - 222 = 111
		numOne -= numTwo;
		
		System.out.println(numOne + " " + numTwo);
		
	}
}
