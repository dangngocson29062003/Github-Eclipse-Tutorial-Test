package exercise7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TeacherManagement teacherManagement = new TeacherManagement();
		while (true) {
			System.out.println("Application Scholl Management");
			System.out.println("Enter 1: To Add Teacher");
			System.out.println("Enter 2: To Delete Teacher By ID");
			System.out.println("Enter 3: To Get Teacher's Real Salary By ID");
			System.out.println("Enter 4: To Exit");
			String choice = scan.nextLine();
			switch (choice) {
			case "1": {
				System.out.println("Enter teacher's ID: ");
				String id = scan.nextLine();
				System.out.println("Enter teacher's name: ");
				String fullName = scan.nextLine();
				System.out.println("Enter teacher's age: ");
				int age = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter teacher's hometown: ");
				String hometown = scan.nextLine();
				System.out.println("Enter teacher's salary: ");
				double salary = scan.nextDouble();
				scan.nextLine();
				System.out.println("Enter teacher's bonus: ");
				double bonus = scan.nextDouble();
				scan.nextLine();
				System.out.println("Enter teacher's penalty: ");
				double penalty = scan.nextDouble();
				scan.nextLine();
				Teacher teacher = new Teacher(id, fullName, age, hometown, salary, bonus, penalty);
				teacherManagement.addTeacher(teacher);
				break;
			}
			case "2": {
				System.out.println("Enter teacher's ID to delete: ");
				String id = scan.nextLine();
				teacherManagement.deleteTeacher(id);
				System.out.println("Delete successfully");
				break;
			}
			case "3": {
				System.out.println("Enter teacher's ID to get real salary: ");
				String id = scan.nextLine();

				System.out.println("ID: " + id + " | " + "Real Salary: " + teacherManagement.caculateRealSalary(id));
				break;
			}
			case "4": {
				return;
			}
			default:
				System.out.println("Invalid");
				continue;
			}
		}
	}

}
