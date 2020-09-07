package inheritanceTest;

public class Vehicle {
	
	private String name;
	private String model;
	
	private int currentVelocity;
	private int currentDirection;
	
	public Vehicle(String name, String model) {
		this.name = name;
		this.model = model;
		
		this.currentDirection = 0;
		this.currentVelocity = 0;
		
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer() steering at "  + currentDirection + "Degrees ");
	}
	
	public void move(int speed,int direction) {
		currentDirection = direction;
		currentVelocity = speed;
		System.out.println("Vehicle.move moving at " + currentVelocity + "Kmph in direction " + currentDirection + " degrees" );

	}

	public String getName() {
		return name;
	}

	public String getmodel() {
		return model;
	}

	public int getcurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void stop() {
	this.currentVelocity = 0;
	}
	
}
