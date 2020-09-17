package javaleads.lesson2;

public class Car extends Vehicle{
	
	private int engineCount;
	
	@Override
	public void printVehicleDetails(String details) {
		// TODO Auto-generated method stub
		super.printVehicleDetails(details);
	}

	@Override
	public void runVehicle() {
		System.out.println("this is runVehicle method in car class");
	}
	
}
