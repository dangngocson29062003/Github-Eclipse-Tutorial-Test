package exercise13;

public class Fresher extends Employee {
	private String graduationDate;
	private String graduationRank;
	private String education;

	// Constructor
	public Fresher(String iD, String fullName, String birthDay, String phone, String email, String graduationDate,
			String graduationRank, String education) {
		super(iD, fullName, birthDay, phone, email, "Fresher");
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}
	// Getters & Setters

	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	// Methods
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Fresher | " + id + " | " + fullName + " | " + graduationDate + " | " + graduationRank
				+ " | " + education);
	}
}
