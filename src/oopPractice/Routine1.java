package oopPractice;

public class Routine1 extends Workout {

	
	private String type = "HIIT";
	
	public void start() {
	 System.out.println("Lets get started!");
	}
	
	public String getType() {
	 return type;
	}
	
	public void setType(String type) {
	 this.type = type;
	}
	
	
	public void workoutStatus(boolean workoutStatus) {
		if (workoutStatus = true) {
			System.out.println("Welldone, you have completed the workout");
		}else {
			System.out.println("You need to push harder");	
		}
	}
}

