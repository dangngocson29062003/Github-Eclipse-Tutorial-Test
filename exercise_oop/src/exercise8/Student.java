package exercise8;

public class Student {
	private String fullName;
	private int age;
	private String classCode;

	// Constructor;
	public Student(String fullName, int age, String classCode) {
		this.fullName = fullName;
		this.age = age;
		this.classCode = classCode;
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

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	// Method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.fullName + " | " + "Age: " + this.age + " | " + "Class: " + this.classCode;
	}
}
