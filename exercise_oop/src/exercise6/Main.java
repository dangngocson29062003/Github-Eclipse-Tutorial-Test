package exercise6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Scholl scholl = new Scholl();
		while (true) {
			System.out.println("Application Scholl Management");
			System.out.println("Enter 1: To Add Student");
			System.out.println("Enter 2: To Search Students By Age");
			System.out.println("Enter 3: To Count Students By Age And Hometown");
			System.out.println("Enter 4: To Exit");
			String choice = scan.nextLine();
			switch (choice) {
			case "1": {
				System.out.println("Enter student's name: ");
				String fullName = scan.nextLine();
				System.out.println("Enter student's age: ");
				int age = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter student's hometown: ");
				String hometown = scan.nextLine();
				Student student = new Student(fullName, age, hometown);
				scholl.addStudent(student);
				break;
			}
			case "2": {
				System.out.println("Enter age to search: ");
				int age = scan.nextInt();
				scan.nextLine();
				scholl.searchStudentsByAge(age).forEach(item -> System.out.println(item.toString()));
				break;
			}
			case "3": {
				System.out.println("Enter age to search: ");
				int age = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter hometown to search: ");
				String hometown = scan.nextLine();
				System.out.println("There are " + scholl.countStudentsByAgeAndHometown(age, hometown)
						+ " students who are " + age + " years old and from " + hometown);
				break;
			}
			case "4": {
				return;
			}
			default: {
				System.out.println("Invalid");
				continue;
			}
			}
		}
	}

}
