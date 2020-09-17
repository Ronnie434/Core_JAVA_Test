package javaleads.lesson2;

public abstract class Vehicle {
	private int capacity;
	private String type;
	
	abstract public void runVehicle();
	public void printVehicleDetails(String details) {
		System.out.println(details);
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
