package exercise13;

public class Senior extends Employee {
	private int expInYear;
	private String proSkill;

	// Constructor
	public Senior(String iD, String fullName, String birthDay, String phone, String email, int expInYear,
			String proSkill) {
		super(iD, fullName, birthDay, phone, email, "Senior");
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	// Getters & Setters

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	// Methods
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Experience | " + id + " | " + fullName + " | " + birthDay + " | " + phone + " | " + email
				+ " | ExpYear: " + expInYear + " | Skill: " + proSkill);
	}

}
