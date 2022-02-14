package broken.abstraction2;

//this class should inerhit DoorDash && Healthy
// Doordash misspelled
// implement keyword is used when a Class inherits an Interface
// commas separate Interfaces when implemeneting more than one
public class Subway implements Doordash, Healthy {
	
	public int calories;
	
	public Subway(String name, int duration) {
		//Interfaces do not have constructor
		// removed super call
		//super(name, duration);
		
		System.out.println("name:" + name);
		System.out.println("duration: " + duration);
	}
	public void setPrice(double price) {
		System.out.println("Price: "+ price);
	}
	
	// need implementation for all abstract methods from Doordash
	@Override
	public void delivery() {
		System.out.println("Subway Delivery");
	}
	@Override
	public void fee() {
		System.out.println("Subway Fee");
	}
	@Override
	public void pickUp() {
		System.out.println("Subway Pickup");
	}
	// need implementation for all abstract methods from Healthy
	@Override
	public int getCalories() {
		return calories;
	}
	@Override
	public void setCalories(int calories) {
		this.calories = calories;
	}
}