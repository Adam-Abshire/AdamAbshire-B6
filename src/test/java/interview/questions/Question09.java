package interview.questions;
import java.util.ArrayList;

public class Question09 {

	// 9. Write a java program to reverse a sentence word by word?
	
	// create method that returns the string value reversed
	public static String reverseWords(String string) {
		// arraylist object created to hold each word from the string provided
		ArrayList<String> wordList = new ArrayList<String>();
		// newString variable holds the value of each word
		// newString concatinates each letter individually
		// when newString reaches a space, it is added to the arrayList and then newString is reset
		// when newString reaches the last character in the string - it adds that word to the arraylist
		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			if (i == string.length() -1) {
				newString += string.charAt(i);
				wordList.add(newString);
			} else if (string.charAt(i) != ' ') {
				newString += string.charAt(i);
			} else {
				wordList.add(newString);
				newString = "";
			}
		}
		// print to make sure arraylist is proper
		System.out.println(wordList);
	
		// create String resultString to hold our return value
		String resultString = "";
		
		// loop through arraylist in reverse
		// concatinate backwards, and add each word onto the resultString prefaced with a space
		// if its the first word, negate the space
		for (int i = wordList.size() - 1; i >= 0; i--) {
			if (i == wordList.size() - 1) {
				resultString += wordList.get(i);
			} else {
				resultString = resultString + " " + wordList.get(i);
			}
		}
		return resultString;
	}
	
	
	public static void main(String[] args) {
		
		// should yeild Coming are Days Happy
		String result = reverseWords("Happy Days are Coming");
		System.out.println(result);
		
	}
}
