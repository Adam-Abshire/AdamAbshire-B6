package broken.abstraction2;

// classes implement Interfaces
// need to use comma to separate Interfaces
// Spelling is important in Java
//this class should inherit DoorDash && Healthy
public class Chipotle implements Doordash, Healthy{

	public int calories;
	// need implementation for all abstract methods
	
	// Doordash
	@Override
	public void delivery() {
		System.out.println("Chipotle Deliver");
	}
	@Override
	public void fee() {
		System.out.println("Chipotle Fee");
	}
	@Override
	public void pickUp() {
		System.out.println("Chipotle Pickup");
	}
	
	// Healthy
	@Override
	public int getCalories() {
		return calories;
	}
	@Override
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
