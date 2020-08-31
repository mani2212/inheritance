package manis;

public class Fish extends Animal  {

	public Fish(String name, int brain, int body, int size, int weight, int fins, int eyes, int gills) {
		super("nemo", 1, 1, 3, 8);
		this.fins = fins;
		this.eyes = eyes;
		this.gills = gills;
	}

	
	private void moveSpeed() {
	
	}
	
	private void movefins() {
		
	}
	
	
	
	
	
	private void swim(int speed) {
		moveSpeed();
		movefins();
		super.move(speed);
	}
	
	private int fins;
	private int eyes;
	private int gills;

		// TODO Auto-generated constructor stub
	}