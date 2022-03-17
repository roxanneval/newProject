package constructor;

public class ConstructorParameters2 {

	int modelYear; //attributes
	String modelname; //Attributes
	
	public ConstructorParameters2(int year, String name) {
	modelYear = year;
	modelname =name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // Call the constructor by by creating an object of the class
		ConstructorParameters2 myCar =new ConstructorParameters2(1969, "Mustang");
		System.out.println((myCar.modelYear + " " + myCar.modelname));
	}

}
