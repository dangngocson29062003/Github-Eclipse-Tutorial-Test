package exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DocumentManagement docManagement = new DocumentManagement();
		while (true) {
			System.out.println("Application Document Management");
			System.out.println("Enter 1: To add document");
			System.out.println("Enter 2: To delete document");
			System.out.println("Enter 3: To show document information");
			System.out.println("Enter 4: To search by category");
			System.out.println("Enter 5: To exit");
			String option = scan.nextLine();
			switch (option) {
			case "1": {
				System.out.println("Enter b: To add book");
				System.out.println("Enter n: To add newspaper");
				System.out.println("Enter m: To add magazine");
				String type = scan.nextLine();
				switch (type) {
				case "b": {
					System.out.println("Enter book's id: ");
					String id = scan.nextLine();
					System.out.println("Enter book's publisher: ");
					String publisher = scan.nextLine();
					System.out.println("Enter book's number: ");
					int number = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter book's author: ");
					String author = scan.nextLine();
					System.out.println("Enter book's page numbers: ");
					int pageNumbers = scan.nextInt();
					Book book = new Book(id, publisher, number, author, pageNumbers);
					docManagement.addDocument(book);
					System.out.println(book.toString());
					break;
				}
				case "n": {
					System.out.println("Enter book's id: ");
					String id = scan.nextLine();
					System.out.println("Enter book's publisher: ");
					String publisher = scan.nextLine();
					System.out.println("Enter book's number: ");
					int number = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter book's issue day: ");
					int issueDay = scan.nextInt();
					Newspaper newspaper = new Newspaper(id, publisher, number, issueDay);
					docManagement.addDocument(newspaper);
					System.out.println(newspaper.toString());
					break;
				}
				case "m": {
					System.out.println("Enter book's id: ");
					String id = scan.nextLine();
					System.out.println("Enter book's publisher: ");
					String publisher = scan.nextLine();
					System.out.println("Enter book's number: ");
					int number = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter book's issue number: ");
					int issueNumber = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter book's issue month: ");
					int issueMonth = scan.nextInt();
					Magazine magazine = new Magazine(id, publisher, number, issueNumber, issueMonth);
					docManagement.addDocument(magazine);
					System.out.println(magazine.toString());
					break;
				}
				default: {
					System.out.println("Invalid");
					continue;
				}
				}
			}
			case "2": {
				System.out.println("Enter ID to delete document: ");
				String id = scan.nextLine();
				docManagement.deleteDocument(id);
				System.out.println("Delete successfully");
				break;
			}
			case "3": {
				docManagement.showInfo();
				break;
			}
			case "4": {
				System.out.println("Enter b: To view book details");
				System.out.println("Enter n: To view newspaper details");
				System.out.println("Enter m: To view magazine details");
				String category = scan.nextLine();
				switch (category) {
				case "b": {
					docManagement.searchBook();
					break;
				}
				case "n": {
					docManagement.searchNewspaper();
					break;
				}
				case "m": {
					docManagement.searchMagazine();
					break;
				}
				default: {
					System.out.println("Invalid");
					continue;
				}
				}
			}
			case "5": {
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
