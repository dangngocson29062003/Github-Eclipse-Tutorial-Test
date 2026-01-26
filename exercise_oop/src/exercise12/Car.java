package exercise12;

public class Car extends Vehicle {
	private int seater;
	private String engine;

	// Constructor
	public Car(String iD, String brand, int year, double price, String color, int seater, String engine) {
		super(iD, brand, year, price, color);
		this.seater = seater;
		this.engine = engine;
	}

	// Getters & Setters
	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	// Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Number of seats: " + this.seater + " | " + "Engine type: " + this.engine;
	}
}