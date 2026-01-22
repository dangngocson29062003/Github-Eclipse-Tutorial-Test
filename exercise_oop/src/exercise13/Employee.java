package exercise13;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	protected String id;
	protected String fullName;
	protected String birthDay;
	protected String phone;
	protected String email;
	protected String employeeType;
	protected List<Certificate> certificates;
	public static int employeeCount = 0;

	// Constructor
	public Employee(String id, String fullName, String birthDay, String phone, String email, String employeeType) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
		this.certificates = new ArrayList<Certificate>();
		employeeCount++;
	}

	// Getters & Setters
	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public static int getEmployeeCount() {
		return employeeCount;
	}

	public static void setEmployeeCount(int employeeCount) {
		Employee.employeeCount = employeeCount;
	}

	// Methods
	public abstract void showInfo();

	public void addCertificate(Certificate cert) {
		certificates.add(cert);
	}
}
