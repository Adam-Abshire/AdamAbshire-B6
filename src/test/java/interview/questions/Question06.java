package interview.questions;

public class Question06 {

	// 6. Write a java program to count total number of words in the given String?

	public static int countWords(String string) {
		// check if string is empty or null value
		if(string.equals("") || string.equals(null)) {
			// return 0 if empty string or null value
			return 0;
		}
		// counter variable - starts at 1 because no spaces means 1 word
		int count = 1;
		// loop through the string and count the amount of space characters
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				count +=1;
			}
		}
		// returns the amount of spaces + 1
		// this will be the amount of words in the sentence
		return count;
	}
	
	public static void main(String[] args) {
		int empty = countWords("");
		int result = countWords("Hello There");
		int resultTwo = countWords("What is the point of this?");
		System.out.println("Words in sentence: " + empty);
		System.out.println("Words in sentence: " + result);
		System.out.println("Words in sentence: " + resultTwo);
	}
}
