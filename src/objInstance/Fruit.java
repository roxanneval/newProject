//OOP Demo

package objInstance;

//The Class is the object
public class Fruit {
	
	int x = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//Create an instance of the OopDemo Class
		Fruit Apple = new Fruit();
		Fruit Banana = new Fruit();
		Fruit Mango = new Fruit();
		
		//Print the value of x
		System.out.println(Apple.x);
		System.out.println(Banana.x);
		System.out.println(Mango.x);
		
		
	}

}
