package exercise9;

public class Customer {
	private String fullName;
	private String address;
	private String meterNumber;

	// Constructor
	public Customer(String fullName, String address, String meterNumber) {
		this.fullName = fullName;
		this.address = address;
		this.meterNumber = meterNumber;
	}
	// Getters & Setters

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	// Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Full name of household head: " + this.fullName + " | " + "Address: " + this.address + " | "
				+ "Meter number: " + this.meterNumber;
	}
}
