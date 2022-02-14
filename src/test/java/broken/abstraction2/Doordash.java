package broken.abstraction2;

public interface Doordash {
	
	// Interfaces do not support constructors
//	public Doordash(String name, int duration) {	
//		System.out.println("Name:" + name);
//		System.out.println("Duraiton:" + duration);
//	}
	
	// public abstract are implicitly added 
	public abstract void delivery();	
	public abstract void fee();	
	// abstract method must be public
	void pickUp();
		
	default int getLocation() {	
		System.out.println("Rest Town Center");
		// requires return of type int
		return 3;
	}
	
	public static void setLocation(String location) {		
		location = "Reston";	
		System.out.println(location);
		// void return type
//		return location;
	}
}
