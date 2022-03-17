package oopPractice;

public class Workout {
	private String workoutName;
	private int duration;
	private String difficulty ;
	private int calories;

	//Getters
	public String getWorkoutName() {
	return workoutName;
	}
	
	public int getDuration() {
	return duration;
	}
	
	public String getDifficulty() {
	return difficulty;
	}
	
	public int getCalories() {
	return calories;
	}
	
	//Setters
	public void setWorkoutName(String workoutName) {
	this.workoutName = workoutName;
	}
	
	public void setDuration(int duration) {
	this.duration = duration;
	}
	
	public void setDifficulty(String difficulty) {
	this.difficulty = difficulty;
	}
	
	public void setCalories(int calories) {
	this.calories = calories;
	}
	
}
