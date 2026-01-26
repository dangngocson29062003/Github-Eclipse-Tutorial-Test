package exercise13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		EmployeeManagement employeeManagement = new EmployeeManagement();
		Validator validator = new Validator();
		try {
			while (true) {
				System.out.println("Application Employee Management");
				System.out.println("Enter 1: To Add Employee");
				System.out.println("Enter 2: To Add Certificate");
				System.out.println("Enter 3: To Update Employee");
				System.out.println("Enter 4: To Delete Employee");
				System.out.println("Enter 5: To Find Employees By Type");
				System.out.println("Enter 6: To Find All Employees");
				System.out.println("Enter 7: To Display Certificates");
				System.out.println("Enter 0: To Exit");
				String choice = scan.nextLine();
				switch (choice) {
				case "1": {
					System.out.println("Enter ID: ");
					String id = scan.nextLine();
					System.out.print("Enter full name: ");
					String fullName = scan.nextLine();
					validator.checkFullName(fullName);
					System.out.print("Ente birthday: ");
					String birthday = scan.nextLine();
					validator.checkBirthDay(birthday);
					System.out.print("Enter phone: ");
					String phone = scan.nextLine();
					validator.checkPhone(phone);
					System.out.print("Enter email: ");
					String email = scan.nextLine();
					validator.checkEmail(email);
					System.out.println("Enter f: To Add Fresher");
					System.out.println("Enter i: To Add Intern");
					System.out.println("Enter s: To Add Senior");
					String type = scan.nextLine();
					switch (type) {
					case "f": {
						System.out.print("Enter graduation date: ");
						String graduationDate = scan.nextLine();

						System.out.print("Enter graduation rank: ");
						String graduationRank = scan.nextLine();

						System.out.print("Enter education: ");
						String education = scan.nextLine();
						Fresher fresher = new Fresher(id, fullName, birthday, phone, email, graduationDate,
								graduationRank, education);
						employeeManagement.addEmployee(fresher);
						break;
					}
					case "i": {
						System.out.print("Enter majors: ");
						String major = scan.nextLine();

						System.out.print("Enter semester: ");
						String semester = scan.nextLine();

						System.out.print("Enter university name: ");
						String universityName = scan.nextLine();
						Intern intern = new Intern(id, fullName, birthday, phone, email, major, semester,
								universityName);
						employeeManagement.addEmployee(intern);
						break;
					}
					case "s": {
						System.out.print("Enter exp in year: ");
						int expInYear = scan.nextInt();
						scan.nextLine();

						System.out.print("Enter pro skill: ");
						String proSkill = scan.nextLine();
						Senior senior = new Senior(id, fullName, birthday, phone, email, expInYear, proSkill);
						employeeManagement.addEmployee(senior);
						break;
					}
					default: {
						System.out.println("Invalid");
						continue;
					}
					}

					break;
				}
				case "2": {
					System.out.println("Enter Employee's ID: ");
					String id = scan.nextLine();
					System.out.println("Enter Certificated ID: ");
					String certificatedID = scan.nextLine();
					System.out.println("Enter Certificate Name: ");
					String certificateName = scan.nextLine();
					System.out.println("Enter Certificate Rank: ");
					String certificateRank = scan.nextLine();
					System.out.println("Enter Certificated Date: ");
					String certificatedDate = scan.nextLine();
					Certificate certificate = new Certificate(certificatedID, certificateName, certificateRank,
							certificatedDate);
					employeeManagement.addCertificate(id, certificate);
					break;
				}
				case "3": {
					System.out.println("Enter Employee's ID: ");
					String id = scan.nextLine();
					employeeManagement.updateEmployee(id);
					break;
				}
				case "4": {
					System.out.println("Enter Employee's ID: ");
					String id = scan.nextLine();
					employeeManagement.deleteEmployee(id);
					break;
				}
				case "5": {
					System.out.println("Enter 0: To Select Senior");
					System.out.println("Enter 1: To Select Fresher");
					System.out.println("Enter 2: To Select Intern");
					String type = scan.nextLine();
					employeeManagement.findEmployeeByType(Integer.parseInt(type)).forEach(item -> item.showInfo());
					break;
				}
				case "6": {
					employeeManagement.findAll().forEach(item -> item.showInfo());
					break;
				}
				case "7": {
					employeeManagement.showCertificates();
					break;
				}
				case "0": {
					return;
				}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		}
	}

}
