package broken.abstraction1;

public abstract class Restaurant {
	
	public final double DISCOUNT = 20.00;
	public int luckyNumber= 12;
	public  int waitTime= 20;
	public String name;
	
	public Restaurant(String name, int luckyNumber, int waitTime) {
		// this keyword differentiates instance variable from parameter
		this.name = name;
		this.luckyNumber = luckyNumber;
		this.waitTime = waitTime;
		
		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}
	
	
	// abstract methods cannot be static
	public abstract void location();
	
	public static void setOperationTime() {
		System.out.println("Monday-Friday");
	}
	
	// abstract methods cannot be final
	// abstract methods must use keyword abstract
	public abstract void specialMenu();
	
	abstract void rating();
	
	// breakfast menu is not an abstract method because it has a method body
	// removed keyword abstract
	public void breakfastMenu() {
		System.out.println("9AM-11AM");
	}
	
	public abstract void lunchMenu();

	public abstract void dinnerMenu();
}
