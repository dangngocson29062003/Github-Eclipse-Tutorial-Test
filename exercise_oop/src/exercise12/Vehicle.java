package exercise12;

public abstract class Vehicle {
	protected String ID;
	protected String brand;
	protected int year;
	protected double price;
	protected String color;

	// Constructor
	public Vehicle(String iD, String brand, int year, double price, String color) {
		ID = iD;
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.color = color;
	}

	// Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + this.ID + " | " + "Brand: " + this.brand + " | " + "Year: " + this.year + " | " + "Price: "
				+ this.price + " | " + "Color: " + this.color;
	}
}
