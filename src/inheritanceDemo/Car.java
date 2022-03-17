package inheritanceDemo;

public class Car extends Vehicle {

	private String modelName = "Mustang";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object of car class
		Car myCar = new Car();
		
		//call the honk method method(from the vehicle class) on the myCar object
		myCar.honk();
		
		//Display the attribute values
		System.out.println(myCar.brand + " " + myCar.modelName);
	}

}
