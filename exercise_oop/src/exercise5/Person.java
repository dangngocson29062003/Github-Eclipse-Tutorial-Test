package exercise5;

public class Person {
	private String fullName;
	private int age;
	private String idNumber;

	// Constructor
	public Person(String fullName, int age, String idNumber) {
		this.fullName = fullName;
		this.age = age;
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

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	// Methods
	public String showInfo() {
		return "Name: " + this.fullName + " | " + "Age: " + this.age + " | " + "ID Number: " + this.idNumber;
	}

}