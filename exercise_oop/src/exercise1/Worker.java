package exercise1;

public class Worker extends Officer {
	private int level;

	/* Constructor */
	public Worker(String fullName, int age, String gender, String address, int level) {
		super(fullName, age, gender, address);
		this.level = level;
	}
	/* Getter and Setter */

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	/* Methods */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Level: " + this.level;
	}
}
