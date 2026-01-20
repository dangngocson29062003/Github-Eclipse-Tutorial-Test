package exercise3;

public class CandidateB extends Candidate {

	public static final String math = "Math";
	public static final String chemistry = "Chemistry";
	public static final String biology = "Biology";

	// Constructor
	public CandidateB(String id, String name, String address, int priority) {
		super(id, name, address, priority);
	}

	// Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Subject: " + this.math + " - " + this.chemistry + " - " + this.biology;
	}

}
