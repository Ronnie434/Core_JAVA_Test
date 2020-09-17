
public class Apple implements fruit{
	
	@Override
	public void isSweet() {
		System.out.println("Apple is sweet");
	}

	@Override
	public void isPoisonous() {
		System.out.println("Apple in not poisonous");
	}
	
	
	public static void main(String[] args) {
		Apple a1 = new Apple();
		a1.isSweet();
		a1.isPoisonous();
	}
}
