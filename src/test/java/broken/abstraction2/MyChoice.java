package broken.abstraction2;

//This class should inherit Subway
// extends keyword is used when a class inherits a class
public class MyChoice extends Subway {
	
	// need to explicitly call parent constructor
	public MyChoice() {
		super(null, 7);
	}
	
	// setPrice has to be public
	// setPrice is public in parent Class Subway
	// in order to override - the method signature must match
	// changed int --> double
	// setPrice was spelled wrong
	@Override 
	public void setPrice(double price) {
		System.out.println("New : " + price);
	}
	
	

}
