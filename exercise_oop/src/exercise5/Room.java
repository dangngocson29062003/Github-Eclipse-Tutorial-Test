package exercise5;

public class Room {
	protected String category;
	protected double price;
	protected Person person;
	protected int totalDays;

	// Constructor
	public Room(String category, double price, Person person, int totalDays) {
		this.category = category;
		this.price = price;
		this.person = person;
		this.totalDays = totalDays;
	}
	// Getter & Setter

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room: " + this.category + " | " + "Price: " + this.price + " | " + "Person: " + person.showInfo()
				+ " | " + "Total rented days: " + this.totalDays;
	}
}
