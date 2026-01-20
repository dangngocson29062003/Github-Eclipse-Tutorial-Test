package exercise5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Hotel hotel = new Hotel();
		while (true) {
			System.out.println("Application Booking Hotel");
			System.out.println("Enter 1: To booking room");
			System.out.println("Enter 2: To remove person by ID Number");
			System.out.println("Enter 3: To calculator price by ID Number");
			System.out.println("Enter 4: To show infor");
			System.out.println("Enter 5: To exit:");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				System.out.print("Enter age: ");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter ID Number: ");
				String passport = scanner.nextLine();
				Person person = new Person(name, age, passport);
				System.out.print("Enter number day for rent: ");
				int numberRent = scanner.nextInt();
				scanner.nextLine();
				System.out.println("-----------------------------------");
				System.out.println("Enter \"a\" or \"A\" to rent room type A");
				System.out.println("Enter \"b\" or \"B\" to rent room type \"B\"");
				System.out.println("Enter \"c\" or \"C\" to rent room type \"C\"");
				String choise = scanner.nextLine();
				Room room;
				if (choise.equals("A") || choise.equals("a")) {
					room = new RoomA(person, numberRent);
				} else if (choise.equals("B") || choise.equals("b")) {
					room = new RoomB(person, numberRent);
				} else if (choise.equals("C") || choise.equals("c")) {
					room = new RoomC(person, numberRent);
				} else {
					continue;
				}
				hotel.booking(room);
				break;
			}
			case "2": {
				System.out.print("Enter ID Number: ");
				String idNumber = scanner.nextLine();
				hotel.deleteCustomer(idNumber);
				break;
			}
			case "3": {
				System.out.print("Enter ID Number: ");
				String idNumber = scanner.nextLine();
				System.out.println("Price: " + hotel.caculatePrice(idNumber));
				break;
			}
			case "4": {
				hotel.show();
				break;
			}
			case "5": {
				return;
			}
			default:
				System.out.println("Invalid");
				continue;
			}
		}

	}

}
