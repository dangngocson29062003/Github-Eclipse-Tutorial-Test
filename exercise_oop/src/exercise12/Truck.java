package exercise12;

public class Truck extends Vehicle {
	private String capacity;
	// Constructor

	public Truck(String iD, String brand, int year, double price, String color, String capacity) {
		super(iD, brand, year, price, color);
		this.capacity = capacity;
	}
	// Getters & Setters

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	// Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Load capacity: " + this.capacity;
	}
}
