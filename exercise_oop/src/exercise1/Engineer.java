package exercise1;

public class Engineer extends Officer {
	private String major;

	/* Constructor */
	public Engineer(String fullName, int age, String gender, String address, String major) {
		super(fullName, age, gender, address);
		this.major = major;
	}
	/* Getter & Setter */

	public String getmajor() {
		return major;
	}

	public void setmajor(String major) {
		this.major = major;
	}

	/* Methods */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Major: " + this.major;
	}
}
