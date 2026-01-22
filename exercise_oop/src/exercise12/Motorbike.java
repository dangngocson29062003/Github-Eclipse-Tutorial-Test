package exercise12;

public class Motorbike extends Vehicle {
	private String power;
	// Constructor

	public Motorbike(String iD, String brand, int year, double price, String color, String power) {
		super(iD, brand, year, price, color);
		this.power = power;
	}
	// Getters & Setters

	public String getpower() {
		return power;
	}

	public void setpower(String power) {
		this.power = power;
	}

	// Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Engine power: " + this.power;
	}
}
