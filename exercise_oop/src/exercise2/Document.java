package exercise2;

public class Document {
	protected String id;
	protected String publisher;
	protected int number;

	/* Constructor */
	public Document(String id, String publisher, int number) {
		this.id = id;
		this.publisher = publisher;
		this.number = number;
	}

	public Document() {
	}

	/* Getters and Setters */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	/* Methods */

	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + this.id + " | " + "Publisher: " + this.publisher + " | " + "Number: " + this.number;
	}
}
