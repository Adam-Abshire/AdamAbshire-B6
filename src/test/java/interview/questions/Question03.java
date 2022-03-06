package interview.questions;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question03 {

	// 3. Write a java program to find the duplicate characters in a string?
	
	// create a method with a linkedHashMap return
	// linkedHashMap has key-value pair and it maintains insertion order
	public static LinkedHashMap<Character, Integer> findDuplicate(String string) {
		
		// LinkedHashMap object that is returned
		LinkedHashMap<Character, Integer> duplicateCounter = new LinkedHashMap<Character, Integer>();
		
		// loop through the given String
		for(int i = 0; i < string.length(); i++) {
			// variable key is the character at the given index i
			char key = string.charAt(i);
			// if the Map object doesn't contain the key, add the key and value of 1 (its the 1st occurence)
			if (!duplicateCounter.containsKey(key)) {
			duplicateCounter.put(key, 1);
			// if it key is in the Map object, increase the int value associated with the key by 1
			} else {
				// value is assigned the last value assigned to the Map object
				int value = duplicateCounter.get(key);
				// each time the key (character) is 
				duplicateCounter.put(key, value + 1);
			}
		}
		// loop through given String
		for(int i = 0; i < string.length(); i++) {
			char key = string.charAt(i);
			// if the value associated with the key is 1 or below
			// remove the entry from the LinkedHashMap object
			if(duplicateCounter.get(key) <= 1) {
				duplicateCounter.remove(key);
			}
		}
		// return the LinkedHashMap object
		return duplicateCounter;
	}
	
	
	public static void main(String[] args) {
		
		LinkedHashMap<Character, Integer> result = findDuplicate("Java Programming is a fun hobby to have");
		
		System.out.println("Repeating Character = Occurences");
		// loop through the LinkedHashMap object's entries
		for (Map.Entry<Character, Integer> entry : result.entrySet()) {
			// print the key && the value for each entry
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
