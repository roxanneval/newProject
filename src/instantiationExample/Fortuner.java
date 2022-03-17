package instantiationExample;

public class Fortuner {
	
	static void welcome() {
		System.out.println("Welcome to the Automation Class");
	}
	static void goodBye() {
	System.out.println("Thank you for coming");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an instance of Cars
		Cars car = new Cars();
		car.brand = "Ford";
		car.fuelCapacity = 60;
		car.warrantyYear = 2;
		
		welcome();
		System.out.println("The car brand is " + car.brand);
		System.out.println("The car feul capacity is " + car.fuelCapacity);
		System.out.println("The cars warranty period is " + car.warrantyYear + "years");
		car.drive();
		car.fuleAlert();
		System.out.println("Tyre is flat " + car.isTyreFlat());
		goodBye();
		System.out.println();
		
		//Create an instance of Cars
		Cars car2 = new Cars();
		car2.brand = "Opel";
		car2.fuelCapacity = 65;
		car2.warrantyYear = 5;
		
		welcome();
		System.out.println("The car brand is " + car2.brand);
		System.out.println("The car feul capacity is " + car2.fuelCapacity);
		System.out.println("The cars warranty period is " + car2.warrantyYear + "years");
		car.drive();
		car.fuleAlert();
		System.out.println("Tyre is flat " + car.isTyreFlat());
		goodBye();
	}

}
