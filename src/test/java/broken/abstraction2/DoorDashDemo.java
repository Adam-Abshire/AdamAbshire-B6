package broken.abstraction2;

public class DoorDashDemo {
	// place everything in main method

	public static void main(String[] args) {

		// Cannot instantiate an object of Interface
//		DoorDash obj1 = new DoorDash("John", 123);		
//		Healthy obj2 = new Healthy();
		// subway constructor requires arguments
		Doordash obj3 = new Subway("John", 17);
		// there is no method setPrice in Doordash Interface
//		obj3.setPrice(22.22);

		// Subway & Chipotle don't have an IS-A Relationship
		// you cannot reference Subway pointing to Chipotle
		// changed Chipotle to MyChoice
		// MyChoice && Subway have is-a relationship
		Subway obj4 = new MyChoice();
		obj4.fee();
		// changed to obj6 to not conflict with obj4
		// Changed Chipotle to MyChoice to create MyChoice Object
		MyChoice obj6 = new MyChoice();
		// setPrice requires a double argument
		obj4.setPrice(2.99);

		//Subway constructor requires String argument, int argument
		Subway obj5 = new Subway("Cena", 77);

		// cannot change the value of final variables
//		obj5.AMOUNT = 22;
//		obj5.NAME = "MD";

		// access static variables through the Interface 
		System.out.println(Healthy.AMOUNT);
		System.out.println(Healthy.NAME);
	}

}
