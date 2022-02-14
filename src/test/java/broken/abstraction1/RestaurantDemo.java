package broken.abstraction1;

public class RestaurantDemo {
	
	// S in String is capitalized
	// rogue ; after args)
	public static void main(String[] args) {
		
		// cannot instantiate an object of abstract class
		// must point to concrete child class
		// Restaurant was misspelled
		Restaurant obj1 = new FastFood();
		obj1.location();
		System.out.println(obj1.DISCOUNT);
		
		// Restaurant misspelled again
		// since getInfo & setInfo aren't upcast, they cannot be seen by Class Restaurant
		// created an object of Class FastFood
		FastFood obj2 = new FastFood();
		// getter returns value -- no arguments needed
		obj2.getInfo();
		obj2.setInfo(7);
		
		// FastFood was spelled incorrectly 
		FastFood obj3 = new FastFood("John Cena", 12);
		
		// cannot change the value of a final variable..
//		obj3.DISCOUNT = 44.44;
		
		// call the methods directly..
		// don't try to print them to console..
		obj3.dinnerMenu();
		obj3.lunchMenu();
		
		
	}
 

}