package exercise9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		PowerHouse powerHouse = new PowerHouse();
		while (true) {
			System.out.println("Application PowerHouse's Receipt Management");
			System.out.println("Enter 1: To Add Receipt");
			System.out.println("Enter 2: To Update Receipt");
			System.out.println("Enter 3: To Delete Receipt");
			System.out.println("Enter 4: To Show Receipts");
			System.out.println("Enter 5: To Exit");
			String choice = scan.nextLine();
			switch (choice) {
			case "1": {
				System.out.println("Enter customer's name: ");
				String name = scan.nextLine();
				System.out.println("Enter customer's address: ");
				String address = scan.nextLine();
				System.out.println("Enter customer's meter number: ");
				String meterNumber = scan.nextLine();
				Customer customer = new Customer(name, address, meterNumber);
				System.out.println(customer.toString());
				System.out.println("Enter old electricity reading: ");
				int oldNumber = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter new electricity reading: ");
				int newNumber = scan.nextInt();
				scan.nextLine();
				Receipt receipt = new Receipt(customer, oldNumber, newNumber);
				powerHouse.addReceipt(receipt);
				break;
			}
			case "2": {
				System.out.println("Enter customer's meter number: ");
				String meterNumber = scan.nextLine();
				System.out.println("Enter old electricity reading: ");
				int oldNumber = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter new electricity reading: ");
				int newNumber = scan.nextInt();
				scan.nextLine();
				powerHouse.updateReceipt(meterNumber, oldNumber, newNumber);
				break;
			}
			case "3": {
				System.out.println("Enter customer's meter number: ");
				String meterNumber = scan.nextLine();
				powerHouse.deleteReceipt(meterNumber);
				break;
			}
			case "4": {
				powerHouse.show();
				break;
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