package exercise3;

public class Candidate {
	protected String id;
	protected String name;
	protected String address;
	protected int priority;

	/* Constructors */
	public Candidate(String id, String name, String address, int priority) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.priority = priority;
	}

	public Candidate() {
	}
	/* Getters and Setters */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	/* Method */
	public String toString() {
		return "ID: " + this.id + " | " + "Name: " + this.name + " | " + "Address: " + this.address + " | "
				+ "Priority: " + this.priority;
	}
}
