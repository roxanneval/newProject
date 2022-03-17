package oopPractice;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fitness fit1 = new Fitness();
		//Set values 
		fit1.setWorkoutName("Box Jumps");
		fit1.setDuration(20);
		fit1.setDifficulty("Medium");
		fit1.setCalories(20);
		fit1.getType();
		
		Fitness2 fit2 = new Fitness2();
		//Set values
		fit2.setWorkoutName("Snatch");
		fit2.setDuration(10);
		fit2.setDifficulty("High");
		fit2.setCalories(30);

		
		WarmUp warmUp = new WarmUp();
		//Set values
		warmUp.setWorkoutName("Inch Worms");
		warmUp.setDuration(2);
		warmUp.setDifficulty("Low");
		warmUp.setCalories(5);
		//warmUp.type();
		
		CoolDown coolDown = new CoolDown();
		//Set values
		coolDown.setWorkoutName("Puppy Dog Lats");
		coolDown.setDuration(2);
		coolDown.setDifficulty("Low");
		coolDown.setCalories(5);
		
		
		fit1.start();
		
		System.out.println();//Line Space
		
		//Print out details WarmUp
		warmUp.startOff();
		//Unable to print out the type on Routine 2
		System.out.println("Here is the your Warmup Activity:");
		System.out.println("We will start with : " + warmUp.getWorkoutName());
		System.out.println("We will do this for: " + warmUp.getDuration() + " minutes");
		System.out.println("Estimated calories burned is: " + warmUp.getCalories());
		System.out.println("Workout Level: " + warmUp.getDifficulty());
		
		System.out.println();//Line Space
		
	
		System.out.println();//Line Space
		
		//Print out Details for Fitness
		System.out.println("First Workout:");
		System.out.println("Lets get going with: " + fit1.getWorkoutName());
		System.out.println("We will do this for " + fit1.getDuration() + " minutes");
		System.out.println("Estimated calories burned is " + fit1.getCalories());
		System.out.println("Workout Level: " + fit1.getDifficulty());
		
		System.out.println();//Line Space
		
		fit1.getType();
		
		System.out.println();//Line Space
		
		//Print out Details for Fitness2
		System.out.println("Second Workout:");
		System.out.println("Lets get going with " + fit2.getWorkoutName());
		System.out.println("We will do this for " + fit2.getDuration() + " minutes");
		System.out.println("Estimated calories burned is " + fit2.getCalories());
		System.out.println("Workout Level: " + fit2.getDifficulty());
		fit2.go();
		
		System.out.println();//Line Space
			
		fit1.heartRate();	
		
		System.out.println();//Line Space
		
		//Print out details CoolDown
		System.out.println("Lets cool down!");
		System.out.println("The cooldown workout is : " + coolDown.getWorkoutName());
		System.out.println("We will do this for " + coolDown.getDuration() + " minutes");
		System.out.println("Estimated calories burned is " + coolDown.getCalories());
		System.out.println("Workout Level: " + coolDown.getDifficulty());
		
		System.out.println();//Line Space
		fit1.workoutStatus(true);
		
//		having an issue with this
		Routine1 route1 = new Routine1();
		route1.getType();
	}
}
