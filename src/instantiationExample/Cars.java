package instantiationExample;

public class Cars {
	String brand;
	int warrantyYear;
	int fuelCapacity;
	
	public void drive() {
		System.out.println("You are going 150km an hour");
	}
	
	public void fuleAlert() {
		System.out.println("Your car is low on fuel");
	}
	
	public boolean isTyreFlat() {
		
		return true;
	}

}
