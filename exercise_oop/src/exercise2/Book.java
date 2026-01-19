package exercise2;

public class Book extends Document {
	private String author;
	private int pageNumbers;

	/* Constructor */
	public Book(String id, String publisher, int number, String author, int pageNumbers) {
		super(id, publisher, number);
		this.author = author;
		this.pageNumbers = pageNumbers;
	}
	/* Getters and Setters */

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageNumbers() {
		return pageNumbers;
	}

	public void setPageNumbers(int pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	/* Methods */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Author: " + this.author + " | " + "Page Numbers: " + this.pageNumbers;
	}
}
