package exercise13;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManagement {
	List<Employee> employees;
	// Constructor

	public EmployeeManagement(List<Employee> employees) {
		this.employees = employees;
	}

	// Methods
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public void updateEmployee(String id) {
		Scanner sc = new Scanner(System.in);
		Employee employee = this.employees.stream().filter(item -> item.id.equals(id)).findFirst().orElse(null);
		if (employee == null) {
			System.out.println("Not found");
			return;
		}

		System.out.print("Enter new full name: ");
		employee.setFullName(sc.nextLine());

		System.out.print("Enter new birthday: ");
		employee.setBirthDay(sc.nextLine());

		System.out.print("Enter new phone: ");
		employee.setPhone(sc.nextLine());

		System.out.print("Enter new email: ");
		employee.setEmail(sc.nextLine());

		// --------- Update riêng theo từng loại ----------
		if (employee instanceof Senior) {
			Senior e = (Senior) employee;

			System.out.print("Enter exp in year: ");
			e.setExpInYear(Integer.parseInt(sc.nextLine()));

			System.out.print("Enter pro skill: ");
			e.setProSkill(sc.nextLine());

		} else if (employee instanceof Fresher) {
			Fresher f = (Fresher) employee;

			System.out.print("Enter graduation date: ");
			f.setGraduationDate(sc.nextLine());

			System.out.print("Enter graduation rank: ");
			f.setGraduationRank(sc.nextLine());

			System.out.print("Enter education: ");
			f.setEducation(sc.nextLine());

		} else if (employee instanceof Intern) {
			Intern i = (Intern) employee;

			System.out.print("Enter majors: ");
			i.setMajors(sc.nextLine());

			System.out.print("Enter semester: ");
			i.setSemester(sc.nextLine());

			System.out.print("Enter university name: ");
			i.setUniversityName(sc.nextLine());
		}

		System.out.println("Update successfully!");

	}

	public void deleteEmployee(String id) {
		this.employees.removeIf(item -> item.id.equals(id));
	}

	public List<Employee> findEmployeeByType(int type) {
		return this.employees.stream().filter(item -> {
			if (type == 0) {
				return item instanceof Senior;
			}
			if (type == 1) {
				return item instanceof Fresher;
			}
			if (type == 2) {
				return item instanceof Intern;
			}
			return false;
		}).collect(Collectors.toList());
	}

	public List<Employee> findAll() {
		return this.employees;
	}
}
