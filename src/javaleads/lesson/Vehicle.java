package javaleads.lesson;

public class Vehicle {
	private int capacity;
	private String type;
	
	public void printVehicleDetails() {
		System.out.println("Details: "+this.type+ " Capacity: "+this.capacity);
	}
	
	public void runVehicle() {
		
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
