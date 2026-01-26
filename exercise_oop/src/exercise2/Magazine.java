package exercise2;

public class Magazine extends Document {
	private int issueNumber;
	private int issueMonth;

	/* Constructor */

	public Magazine(String id, String publisher, int number, int issueNumber, int issueMonth) {
		super(id, publisher, number);
		this.issueNumber = issueNumber;
		this.issueMonth = issueMonth;
	}

	/* Getters and Setters */
	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public int getIssueMonth() {
		return issueMonth;
	}

	public void setIssueMonth(int issueMonth) {
		this.issueMonth = issueMonth;
	}

	/* Methods */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Issue Number: " + this.issueNumber + " | " + "Issue Month: "
				+ this.issueMonth;
	}
}
