package constructor;

public class Main {
	//Create Class Attribute
	int x;
	
	//Create a class constructor for the Main class
	public Main() {
	//set the initial value for the class attribute
		x = 5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of class Main(This will call the constructor)
		
		Main myObj = new Main();
		
		//Print the value of x
		System.out.println(myObj.x);
		
		//Note
		//The constructor name must match the class name
		//and cannot have a return type(void string or int)
		//also note that the constructor is called when the object is created
		//All classes do in fact have constructor by default: if you dont create a class constructor, Java creates it for you
		//However then you are not able to set initial values


}
