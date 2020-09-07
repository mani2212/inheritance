package inheritanceTest;

public class Lancer extends Car{

	private int totalGears;

	public Lancer(int extraGears) {
		super("Ferrari", "Sports", 4, 2, 8, true, 4);
		this.totalGears = totalGears;
	}
	
	public void accelerate(int speedRate) {
		int newVelocity = getcurrentVelocity() + speedRate;
		if(newVelocity == 0) {
			stop();
			changeGear(0);
		}
		else if (newVelocity > 0 && newVelocity <=10) {
			changeGear(1);
		}
		else if (newVelocity > 10 && newVelocity <=20 ) {
			changeGear(2);
		}
		else if (newVelocity > 20 && newVelocity <=70) {
			changeGear(3);
		}
		else if (newVelocity > 70 && newVelocity <200) {
			changeGear(4);
		}
		else {
			changeGear(5);
		}

		if(newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection() );
		}
		
}
}