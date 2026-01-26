package exercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		OfficerManagement officerManagement = new OfficerManagement();
		while (true) {
			System.out.println("Application Officer Management");
			System.out.println("Enter 1: To insert officer");
			System.out.println("Enter 2: To search filter by name");
			System.out.println("Enter 3: To show information officers");
			System.out.println("Enter 4: To exit");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println("Enter e: to insert Engineer");
				System.out.println("Enter w: to insert Worker");
				System.out.println("Enter s: to insert Staff");
				String type = scanner.nextLine();
				switch (type) {
				case "e": {
					System.out.println("Enter engineer's name: ");
					String fullName = scanner.nextLine();
					System.out.println("Enter engineer's age: ");
					int age = scanner.nextInt();
					System.out.println("Enter engineer's gender: ");
					scanner.nextLine();
					String gender = scanner.nextLine();
					System.out.println("Enter engineer's address: ");
					String address = scanner.nextLine();
					System.out.println("Enter engineer's major: ");
					String major = scanner.nextLine();
					Engineer engineer = new Engineer(fullName, age, gender, address, major);
					officerManagement.addOfficer(engineer);
					break;
				}
				case "w": {
					System.out.println("Enter worker's name: ");
					String fullName = scanner.nextLine();
					System.out.println("Enter worker's age: ");
					int age = scanner.nextInt();
					System.out.println("Enter worker's gender: ");
					String gender = scanner.nextLine();
					System.out.println("Enter worker's address: ");
					String address = scanner.nextLine();
					System.out.println("Enter worker's level: ");
					int level = scanner.nextInt();
					Worker worker = new Worker(fullName, age, gender, address, level);
					officerManagement.addOfficer(worker);
					break;
				}
				case "s": {
					System.out.println("Enter staff's name: ");
					String fullName = scanner.nextLine();
					System.out.println("Enter staff's age: ");
					int age = scanner.nextInt();
					System.out.println("Enter staff's gender: ");
					String gender = scanner.nextLine();
					System.out.println("Enter staff's address: ");
					String address = scanner.nextLine();
					System.out.println("Enter staff's job: ");
					String job = scanner.nextLine();
					Staff staff = new Staff(fullName, age, gender, address, job);
					officerManagement.addOfficer(staff);
					break;
				}

				}
				break;
			}
			case "2": {
				System.out.println("Enter name to search: ");
				String name = scanner.nextLine();
				officerManagement.searchOfficerByName(name).forEach(officer -> System.out.println(officer.toString()));
				break;
			}
			case "3": {
				officerManagement.showOfficersList();
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
