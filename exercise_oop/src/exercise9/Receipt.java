package exercise9;

public class Receipt {
	private Customer customer;
	private int oldNumber;
	private int newNumber;
	private double payment;

	// Constructor
	public Receipt(Customer customer, int oldNumber, int newNumber) {
		this.customer = customer;
		this.oldNumber = oldNumber;
		this.newNumber = newNumber;
	}

	// Getters & Setters

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getOldNumber() {
		return oldNumber;
	}

	public void setOldNumber(int previousNumber) {
		this.oldNumber = previousNumber;
	}

	public int getNewNumber() {
		return newNumber;
	}

	public void setNewNumber(int newNumber) {
		this.newNumber = newNumber;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	// Method
	public double caculate() {
		return (double) ((newNumber - oldNumber) * 5);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "- Customer - " + this.customer.toString() + " | " + "Old electricity reading: " + this.oldNumber + " | "
				+ "New electricity reading: " + this.newNumber;
	}
}
