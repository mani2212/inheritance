package inheritanceTest;

public class Car extends Vehicle {
    private int wheels;
	private int doors;
	private int lights;
	private boolean isManualgear;
	
	private int currentGear;
	
	public Car(String name, String size, int wheels, int doors, int lights, boolean isManualgear, int currentGear) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.lights = lights;
		this.isManualgear = isManualgear;
		this.currentGear = 1;
	}
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Current gear is " + currentGear);
	}
	
	public void changeVelocity(int speed,int direction) {
		System.out.println( " Car changeVelocity(): velocity is " + speed + " direction is " + direction) ;
		move(speed, direction);
		
	}
	
	
}
