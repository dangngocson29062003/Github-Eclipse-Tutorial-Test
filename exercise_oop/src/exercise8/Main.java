package exercise8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Library library = new Library();
		while (true) {
			System.out.println("Application Library Management");
			System.out.println("Enter 1: To Add Loan Card");
			System.out.println("Enter 2: To Delete Loan Card By ID");
			System.out.println("Enter 3: To Show Loan Cards");
			System.out.println("Enter 4: To Exit");
			String choice = scan.nextLine();
			switch (choice) {
			case "1": {
				System.out.println("Enter student's name: ");
				String name = scan.nextLine();
				System.out.println("Enter student's age: ");
				int age = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter student's class: ");
				String classID = scan.nextLine();
				Student student = new Student(name, age, classID);
				System.out.println(student.toString());
				System.out.println("Enter card ID: ");
				String id = scan.nextLine();
				System.out.println("Enter card's start day: ");
				String startDay = scan.nextLine();
				System.out.println("Enter card's end day: ");
				String endDay = scan.nextLine();
				System.out.println("Enter book ID: ");
				String bookID = scan.nextLine();
				LoanCard loanCard = new LoanCard(id, startDay, endDay, bookID, student);
				library.addLoanCard(loanCard);
				break;
			}
			case "2": {
				System.out.println("Enter card's ID: ");
				String id = scan.nextLine();
				library.deleteLoanCard(id);
				break;
			}
			case "3": {
				library.show();
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
