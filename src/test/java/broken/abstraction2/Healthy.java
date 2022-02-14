package broken.abstraction2;

public interface Healthy {
	// Interface can only support public static final variables 
	public static final int AMOUNT = 12; 
	// variables cannot be abstract
	public static final String NAME = "John Cena";	
	
	// interfaces cannot contain constructors
//	public Healthy(int calorie) {
//		System.out.println("Calorie: " + calorie );
//	}
//	
//	public Healthy(int calorie, int amount) {
//		System.out.println("Amount: " + amount);
//		System.out.println("Calorie:" + calorie);
//	}
	
	// getter method shouldn't require arguments
	// abstract methods do not have a method body
	// changed return type to int (its a getter method)
	public abstract int getCalories();//String type);// {
		//System.out.println("Organic");
	//}
	// added parameter to require arguments to set
	public abstract void setCalories(int calories);
}
