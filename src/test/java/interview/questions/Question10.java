package interview.questions;

public class Question10 {

	/**
	 * 		10. Write a java program to convert
				a. String to Integer
				b. Integer to String
				c. Boolean to String
				d. String to Boolean
				e. Char to String
				f. String to Char
				g. Double to String
				h. String to Double
	 */
	
	
	public static void main(String[] args) {
		// a.
		String age = "11";
		Integer ageNumber = new Integer(age);
		System.out.println(ageNumber + 1);
		
		// b.
		Integer id = 456;
		String idString = "" + id;
		System.out.println(idString + 1);
		
		// c.
		Boolean isTrue = true;
		String isTrueString = "" + isTrue;
		System.out.println(isTrueString);
		
		// d. 
		String isJavaFun = "true";
		Boolean isJava = new Boolean(isJavaFun);
		System.out.println(isJava);
		
		// e. 
		Character gender = 'M';
		String genderString = "" + gender;
		System.out.println(genderString);
		
		// f.
		String happy = "y";
		Character isHappy = happy.charAt(0);
		System.out.println(isHappy);
		
		// g.
		Double cost = 13.99;
		String costString = "" + cost;
		System.out.println(costString);
		
		// h.
		String price = "14.25";
		Double priceOf = new Double(price);
		System.out.println(priceOf);
	}
}
