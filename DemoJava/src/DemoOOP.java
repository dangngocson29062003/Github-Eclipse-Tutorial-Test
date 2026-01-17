
public class DemoOOP {
	public static void main(String[] args) {
		Student std1 = new Student("Dang Ngoc Son", "Male", "29/06/2003");
		System.out.println("Student 1: " + std1.fullName);
		Student std2 = new Student();
		std2.setFullName("Le Ngoc Chau Anh");
		std2.setGender("Female");
		std2.setBirthDay("03/12/2003");
		System.out.println("Student 2: " + std2.fullName);
	}
}

class Student {

	String fullName;
	String gender;
	String birthDay;

	/* Constructor */
	public Student(String fullName, String gender, String birthDay) {
		this.fullName = fullName;
		this.gender = gender;
		this.birthDay = birthDay;
	}

	public Student() {
	}

	/* Getter && Setter */
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
}