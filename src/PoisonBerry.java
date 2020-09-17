
public class PoisonBerry implements fruit {

	@Override
	public void isSweet() {
		System.out.println("PoisonBerry is not sweet");
	}

	@Override
	public void isPoisonous() {
		System.out.println("PoisonBerry is very poisonous");
	}
	
	public static void main(String[] args) {
		PoisonBerry p1 = new PoisonBerry();
		p1.isSweet();
		p1.isPoisonous();
	}
	

}
