package broken.abstraction1;

// must use extends keyword when inheriting from a class
public class FastFood extends Restaurant {
	
	// need a constructor that implicity calls Restaurant constructor
	// put name and luckynumber parameters
	public FastFood(String name, int luckyNumber) {
		super(name, 0, luckyNumber);
	}
	
	// added empty constructor to create FastFood Objects w/o arguments
	public FastFood() {
		super(null, 0, 0);
	}
	
	// added private variable info 
	private int info;
	
	// added specialMenu method
	// need to add implementation of all abstract methods
	@Override
	public void specialMenu() {
		System.out.println("Today's Special is Squid");
	}
	
	@Override
	public void rating() {
		System.out.println("5 Star");
	}
	
	// when overriding methods - cannot be more restrictive
	// changed protected to public
	public void location() {
		System.out.println("Reston VA");
	}
	
	// cannot override static method setOperationTime()
	// removed @Override && added keyword static
	// this becomes a hidden method()
	public static void setOperationTime() {
		System.out.println("24/7");
	}
	
	// this lunchMenu() method isn't overriding lunchMenu() in parent class
	// the method signature needs to be the same
	//@Override
	void lunchMenu(String time) {
		System.out.println("Time: " + time);
	}
	// created a new lunchMenu() method to override parent method
	@Override
	public void lunchMenu() {
		System.out.println("Burgers");
	}
	
	// breakfastMenu() was spelled incorrectly
	// since there is no return - changed return to void
	@Override
	public void breakfastMenu() {
		System.out.println("Not serving...");
	}
	
	// missing return -- added void
	// dinnerMenu() spelled incorrectly
	@Override 
	public void dinnerMenu() {
		System.out.println("7PM-10PM");
	}
	
	public void display() {
		// cannot change the value of a final value
		// DISCOUNT = 30.00;
		// luckyNumber needs to be int type not double
		luckyNumber = 22;
		//waitTime needs to be int type not String
		waitTime = 4;
		// call method rating() directly
		// removed System.out.println()
		rating();
	}
	
	// cannot make abstract methods in concrete class
	// removed keyword abstract from getInfo() && setInfo()
	// changed return type to int -- so that you can get it
	public int getInfo() {
		System.out.println("This is info");
		return info;
	}
	// added method body && parameter
	// basic setter method
	public void setInfo(int info) {
		this.info = info;
	}

}