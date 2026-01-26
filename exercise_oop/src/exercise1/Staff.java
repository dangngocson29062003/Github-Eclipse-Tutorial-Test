package exercise1;

public class Staff extends Officer {
	private String job;

	/* Constructor */
	public Staff(String fullName, int age, String gender, String address, String job) {
		super(fullName, age, gender, address);
		this.job = job;
	}
	/* Getter & Setter */

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	/* Methods */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Job: " + this.job;
	}
}
