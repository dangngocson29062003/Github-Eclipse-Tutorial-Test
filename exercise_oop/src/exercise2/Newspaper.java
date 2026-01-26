package exercise2;

public class Newspaper extends Document {
	private int issueDay;
	/* Constructor */

	public Newspaper(String id, String publisher, int number, int issueDay) {
		super(id, publisher, number);
		this.issueDay = issueDay;
	}
	/* Getter and Setter */

	public int getIssueDay() {
		return issueDay;
	}

	public void setIssueDay(int issueDay) {
		this.issueDay = issueDay;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Issue Day: " + this.issueDay;
	}
}
