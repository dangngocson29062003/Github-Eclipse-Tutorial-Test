package exercise3;

public class CandidateC extends Candidate {
	public static final String literature = "Literature";
	public static final String history = "History";
	public static final String geography = "Geography";

	// Constructor
	public CandidateC(String id, String name, String address, int priority) {
		super(id, name, address, priority);
	}

	// Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Subject: " + this.literature + " - " + this.history + " - " + this.geography;
	}
}
