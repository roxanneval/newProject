package encapsulationDemo;

public class Person {

	
	//private= restricted access
	private String pName;
	
	//Getter (gets the value)
	public String getName() {
		return pName;
	}
	
	//Setter (Sets the value)
	public void setName (String newName) {
		this.pName = newName;
	}
	
}
