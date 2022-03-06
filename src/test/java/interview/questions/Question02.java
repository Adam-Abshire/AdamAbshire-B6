package interview.questions;

public class Question02 {

	/** write a Java Program to find the first non-repeated
	 *  character in a String
	 */
	
	// create a method that return a character
	public static char findChar(String string) {
		// create character variable that will be returned
		// set value to empty (default)
		char cha = ' ';
		
		// loop through the given String
		for(int i = 0; i < string.length(); i++) {
		
			// check if its the first character
			if(i == 0) {
				// if its the first character see if it matches the 2nd character
				if(string.charAt(i) != string.charAt(i+ 1)) {
					cha = string.charAt(i);
					return cha;
				}
				// if its not the first character check if it matches the previous character
			} else if(string.charAt(i) != string.charAt(i - 1)) {
					cha = string.charAt(i);
					return cha;
			}			
		}
		return cha;
	}
	
	
	public static void main(String[] args) {
		
		char resultOne = findChar("sssssssmack"); // returns m
		char resultTwo = findChar("smack"); // return s
		char resultThree = findChar("iiiiiiiiiiit"); // returns t
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		
	}
	
}
