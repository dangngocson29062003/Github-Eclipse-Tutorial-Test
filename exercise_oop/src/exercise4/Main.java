package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quarter quarter = new Quarter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of families:");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {

			System.out.println("Enter address:");

			String address = scanner.nextLine();

			// Enter person number in family
			List<Person> persons = new ArrayList<>();
			System.out.println("Enter number of person: ");
			int number = scanner.nextInt();
			scanner.nextLine();
			for (int j = 0; j < number; j++) {
				System.out.println("Enter the full name of person number " + (j + 1) + " :");

				String fullName = scanner.nextLine();
				System.out.println("Enter the age of person number " + (j + 1) + " :");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the job of person number " + (j + 1) + " :");
				String job = scanner.nextLine();
				System.out.println("Enter the id number of person number " + (j + 1) + " :");
				String idNumber = scanner.nextLine();
				Person person = new Person(fullName, age, job, idNumber);
				persons.add(person);
			}

			// After done input
			quarter.addFamily(new Family(address, persons));

		}
		quarter.showFamilies();
	}

}
