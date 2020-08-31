package manis;

public class Pigeon extends Animal {

	public int flyingSpeed;
	public int wings;
	public String Name;
	
	public Pigeon(String name, int brain, int body, int size, int weight) {
		
		super("Pigeon", 1,1, 3 , 4);
		this.flyingSpeed = flyingSpeed;
		this.wings = wings;
		this.Name = Name;
	}


	public void fly() {
		wingsMovement();
		windPressure();
		move(5);
	}
	private void wingsMovement() {
		System.out.println("wing movement called");
	}
	private void windPressure() {
		System.out.println("windpressure called ");
	}
	
}
