package interview.questions;
import java.util.Map;
import java.util.LinkedHashMap;

public class Question04 {

	// 4. Write a java program to count number of occurrences of each character in a
	// String?	
	
	// create a method that returns a Map object
	public static LinkedHashMap<Character, Integer> countCharacter(String string) {
		// create Map object to be returned
		LinkedHashMap<Character, Integer> counterMap = new LinkedHashMap<Character, Integer>();
		// loop through given string
		for(int i = 0; i < string.length(); i++) {
			char key = string.charAt(i);
			// if Map object does not contain the character at given index
			if(!counterMap.containsKey(key)) {
				// add the key and assign value 1
				counterMap.put(key, 1);
				// if the key is already in the Map object
			} else {
				// get the value associated with the key --- save to variable counter
				int counter = counterMap.get(key);
				// override key by re-putting the key and add one to the value
				counterMap.put(key, counter+1);
			}
		}
		// return Map object
		return counterMap;
	}
	
	
	public static void main(String[] args) {
		
		LinkedHashMap<Character, Integer> result = countCharacter("Java Programming Language");
		// loop through each entry in Map object
		for(Map.Entry<Character, Integer> browse : result.entrySet()) {
			// print each key and value of the entry
			System.out.println(browse.getKey() + " = " + browse.getValue());
		}
	}
	
}