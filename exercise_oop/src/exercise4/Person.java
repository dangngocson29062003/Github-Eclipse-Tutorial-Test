package exercise4;

public class Person {
	private String fullName;
	private int age;
	private String job;
	private String idNumber;

	// Constructor
	public Person(String fullName, int age, String job, String idNumber) {
		this.fullName = fullName;
		this.age = age;
		this.job = job;
		this.idNumber = idNumber;
	}
	// Getter & Setter

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	// Methods
	public String showInfo() {
		return "Name: " + this.fullName + " | " + "Age: " + this.age + " | " + "Job: " + this.job + " | "
				+ "ID Number: " + this.idNumber;
	}

}