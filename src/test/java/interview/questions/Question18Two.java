package interview.questions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question18Two {

	// 18. Write a java program to find the common elements or matching elements in the array?
	
	public static ArrayList<Integer> returnCommon(int[] arr){
		ArrayList<Integer> elementList = new ArrayList<Integer>();
		HashMap<Integer, Integer> elementMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			int value = 1;
			int key = arr[i];
			if (elementMap.containsKey(arr[i])) {
				value = elementMap.get(key) + 1;
				elementMap.put(key, value);
			} else {
				elementMap.put(key, 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : elementMap.entrySet()) {
			if (entry.getValue() > 1) {
				elementList.add(entry.getKey());
			}
		}
		return elementList;
	}
	
	public static void main(String[] args) {
		
		int[] arrayOne = {1, 2, 3, 1, 3, 2, 3, 5, 5};
		int[] arrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arrayThree = {1, 1, 2, 2, 3, 3, 4, 4, 5};
		int[] arrayFour = {1, 2, 3, 4, 5, 1};
		
		ArrayList<Integer> resultOne = returnCommon(arrayOne);
		ArrayList<Integer> resultTwo = returnCommon(arrayTwo);
		ArrayList<Integer> resultThree = returnCommon(arrayThree);
		ArrayList<Integer> resultFour = returnCommon(arrayFour);
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		
	}
}
