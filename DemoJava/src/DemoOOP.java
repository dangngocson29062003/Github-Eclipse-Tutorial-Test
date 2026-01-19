public class DemoOOP {
	public static void main(String[] args) {
		Student std1 = new Student("Dang Ngoc Son", "Male", "29/06/2003", "Software Developer");
		System.out.println("Student 1: " + std1.getInfo() + ", Schedule: " + std1.showSchedule());
		std1.showSchedule();
		Student std2 = new Student();
		std2.setFullName("Le Ngoc Chau Anh");
		std2.setGender("Female");
		std2.setBirthDay("03/12/2003");
		std2.setMajor("Graphic Designer");
		System.out.println("Student 2: " + std2.getInfo() + ", Schedule: " + std2.showSchedule());
		Lecturer lec1 = new Lecturer("Nguyen Van A", "Nam", "01/01/1997", "HTML & CSS Master");
		System.out.println("Lecturer 1: " + lec1.getInfo() + ", Schedule: " + lec1.showSchedule());
		Lecturer lec2 = new Lecturer();
		lec2.setFullName("Nguyen Van B");
		lec2.setGender("Female");
		lec2.setBirthDay("01/01/1995");
		lec2.setSubject("Photoshop");
		System.out.println("Lecturer 2: " + lec2.getInfo() + ", Schedule: " + lec2.showSchedule());
		Manager manager1 = new Manager("Nguyen Van C", "Nam", "01/01/1997", "Java Programming",
				"Information Technology", 12);
		Manager manager2 = new Manager("Nguyen Van D", "Nam", "01/01/1997", "Figma Tool", "Designer", 8);

		System.out.println("Manager 1: " + manager1.getInfo() + ", Schedule: " + manager1.showSchedule());
		System.out.println("Manager 2: " + manager2.getInfo() + ", Schedule: " + manager1.showSchedule());
	}
}

interface Schedule {

	String showSchedule();
}

class Lecturer extends Person implements Schedule {
	String subject;

	/* Constructor */
	public Lecturer(String fullName, String gender, String birthDay, String subject) {
		super(fullName, gender, birthDay);
		this.subject = subject;
	}

	public Lecturer() {
	}

	/* Getter && Setter */
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	/* Methods */
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + ", Subject: " + this.subject;
	}

	@Override
	public String showSchedule() {
		// TODO Auto-generated method stub
		return "Work from 06:30 to 11:30";
	}
}

class Manager extends Lecturer {

	String department;
	int experience;

	/* Constructor */
	public Manager(String fullName, String gender, String birthDay, String subject, String department, int experience) {
		super(fullName, gender, birthDay, subject);
		this.department = department;
		this.experience = experience;
	}

	public Manager() {
	}

	/* Getter && Setter */
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	/* Methods */
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + ", Head of Department: " + this.department + ", Experience: " + this.experience
				+ " years";
	}
}

class Student extends Person implements Schedule {
	String major;

	/* Constructor */
	public Student(String fullName, String gender, String birthDay, String major) {
		super(fullName, gender, birthDay);
		this.major = major;
	}

	public Student() {
	}

	/* Getter && Setter */
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	/* Methods */
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + ", Major: " + this.major;
	}

	@Override
	public String showSchedule() {
		// TODO Auto-generated method stub
		return "Period 1: 06:45 - 07:35" + " | " + "Period 2: 07:35 - 08:25" + " | " + "Period 3: 08:25 - 09:15" + " | "
				+ "Take a 15-minute break" + " | " + "Period 4: 09:30 - 10:20" + " | " + "Period 5: 10:20 - 11h10";

	}

}

class Person {

	String fullName;
	String gender;
	String birthDay;

	/* Constructor */
	public Person(String fullName, String gender, String birthDay) {
		this.fullName = fullName;
		this.gender = gender;
		this.birthDay = birthDay;
	}

	public Person() {
	}

	/* Getters && Setters */
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

	/* Methods */
	public String getInfo() {
		return "Name: " + this.fullName + ", Gender: " + this.gender + ", Birthday: " + this.birthDay;
	}
}