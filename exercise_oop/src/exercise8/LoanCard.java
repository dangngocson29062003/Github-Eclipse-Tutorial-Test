package exercise8;

public class LoanCard {
	private String id;
	private String startDay;
	private String endDay;
	private String bookID;
	private Student student;

	// Constructor
	public LoanCard(String id, String startDay, String endDay, String bookID, Student student) {
		this.id = id;
		this.startDay = startDay;
		this.endDay = endDay;
		this.bookID = bookID;
		this.student = student;
	}
	// Getters & Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getEndDay() {
		return endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	// Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + this.id + " | " + "Start Day: " + this.startDay + " | " + "End Day: " + this.endDay + " | "
				+ "Book ID: " + this.bookID + " -- " + this.student.toString();

	}
}
