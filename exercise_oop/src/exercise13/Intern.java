package exercise13;

public class Intern extends Employee {
	private String majors;
	private String semester;
	private String universityName;

	// Constructor
	public Intern(String iD, String fullName, String birthDay, String phone, String email, String majors,
			String semester, String universityName) {
		super(iD, fullName, birthDay, phone, email, "Intern");
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	// Getters & Setters
	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	// Methods
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(
				"Intern | " + id + " | " + fullName + " | " + majors + " | " + semester + " | " + universityName);
	}
}
