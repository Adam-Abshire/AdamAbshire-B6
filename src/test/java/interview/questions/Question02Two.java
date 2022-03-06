package interview.questions;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question02Two {
	
	// Write a Java Program to find the first non-"repeated" character in a STring

	// method that returns a character value
	public static char nonRepeater(String string) {
		if (string.length() == 0) {
			System.out.println("This String doesn't contain any character");
			return ' ';
		}
		char cha = ' ';
		// LinkedHashMap can keep count of each character && keep insertion order
		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		
		// build your LinkedHashMap Object 
		for (int i = 0; i < string.length(); i++) {
			char key = string.charAt(i);
			if (charMap.containsKey(key)) {
				int value = charMap.get(key);
				charMap.put(key, value+1);
			} else {
				charMap.put(key, 1);
			}
		}
		
		// iterate through Map 
		for (Map.Entry<Character, Integer> map : charMap.entrySet()) {
			// return the first key with a value of 1 (not repeated)
			if (map.getValue() == 1) {
				return map.getKey();
			}
		}
		return cha;
	}
	
	
	public static void main(String[] args) {
		
		char result = nonRepeater("teether");
		char resultTwo = nonRepeater("Teether");
		char resultThree = nonRepeater("a a bbccdDed");
		
		System.out.println(result);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		
	}
}
