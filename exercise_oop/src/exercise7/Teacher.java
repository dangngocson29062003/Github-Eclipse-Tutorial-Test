package exercise7;

public class Teacher extends Person {
	private double salary;
	private double bonus;
	private double penalty;
	private double realSalary;

	// Constructor
	public Teacher(String id, String fullName, int age, String hometown, double salary, double bonus, double penalty) {
		super(id, fullName, age, hometown);
		this.salary = salary;
		this.bonus = bonus;
		this.penalty = penalty;
	}
	// Getters & Setters

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getPenalty() {
		return penalty;
	}

	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | " + "Salary: " + this.salary + " | " + "Bonus: " + this.bonus + "Penalty: "
				+ this.penalty;
	}
}
