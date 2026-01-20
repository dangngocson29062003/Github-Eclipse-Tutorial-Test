package exercise3;

public class CandidateA extends Candidate {
	public static final String math = "Math";
	public static final String physics = "Physics";
	public static final String chemistry = "Chemistry";

	// Constructor
	public CandidateA(String id, String name, String address, int priority) {
		super(id, name, address, priority);
	}

	// Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Subject: " + this.math + " - " + this.physics + " - " + this.chemistry;
	}
}
