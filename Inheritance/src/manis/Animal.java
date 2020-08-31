package manis;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	private int sleep;
	
	public Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.sleep = sleep;
	}

	
	public void eat() {
		System.out.println("Animal.eat called ");
		
	}
	
	public void walk() {
		System.out.println("Dog.walk called ");
	}
	public void move(int speed) {
		System.out.println("Animal method called , Animal moving at speed : " + speed);
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public int getBrain() {
		return brain;
	}
	public int getBody() {
		return body;
	}
	public int getSize() {
		return size;
	}
	public int getWeight() {
		return weight;
	}
		
	}
