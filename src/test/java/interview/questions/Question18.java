package interview.questions;
import java.util.ArrayList;

public class Question18 {
	
	// 18. Write a java program to find the common elements or matching elements in the array?
	
	public static ArrayList<Integer> commonElements(int[] arrayOne, int[] arrayTwo) {
		ArrayList<Integer> elementListOne = new ArrayList<Integer>();
		ArrayList<Integer> elementListTwo = new ArrayList<Integer>();
		ArrayList<Integer> elementResults = new ArrayList<Integer>();
		
		for (int i = 0; i < arrayOne.length; i++) {
			elementListOne.add(arrayOne[i]);
		}
		for (int i = 0; i < arrayTwo.length; i++) {
			elementListTwo.add(arrayTwo[i]);
		}
		for (Integer element : elementListOne) {
			if (elementListTwo.contains(element)) {
				elementResults.add(element);
			}
		}
		return elementResults;
	}
	
	public static void main(String[] args) {
		
		int[] arrayOne = {1, 2, 3, 4, 5};
		int[] arrayTwo = {3, 4, 5, 6, 7};
		int[] arrayThree = {6, 7, 8, 9};
		int[] arrayFour = {1, 2, 3};
		
		ArrayList<Integer> resultOne = commonElements(arrayOne, arrayTwo);
		ArrayList<Integer> resultTwo = commonElements(arrayTwo, arrayThree);
		ArrayList<Integer> resultThree = commonElements(arrayThree, arrayFour);
		ArrayList<Integer> resultFour = commonElements(arrayFour, arrayOne);
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	
	}
}

