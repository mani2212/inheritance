package manis;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int brain, int body, int size, int weight, String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	private void chew() {
		System.out.println("Chew called ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog.eat called ");
		chew();
		walk();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog walk called  ");
		move(5);
	}
	
	
	public void run() {
		System.out.println("Dog run called ");
		move(10);
		
	}

}
