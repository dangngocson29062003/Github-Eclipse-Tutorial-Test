package exercise6;

public class Student {
	private String fullName;
	private int age;
	private String hometown;

	// Constructor
	public Student(String fullName, int age, String hometown) {
		this.fullName = fullName;
		this.age = age;
		this.hometown = hometown;
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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	// Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.fullName + " | " + "Age: " + this.age + " | " + "Hometown: " + this.hometown;
	}
}
