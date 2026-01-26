package exercise12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		VehicleManagement vehicleManagement = new VehicleManagement();
		while (true) {
			System.out.println("Application Vehicle Management");
			System.out.println("Enter 1: To Add Vehicle");
			System.out.println("Enter 2: To Delete Vehicle");
			System.out.println("Enter 3: To Search Vehicle");
			System.out.println("Enter 4: To Show Vehicles");
			System.out.println("Enter 5: To Exit");
			String choice = scan.nextLine();
			switch (choice) {
			case "1": {
				System.out.println("Enter vehicle's id: ");
				String id = scan.nextLine();
				System.out.println("Enter vehicle's brand: ");
				String brand = scan.nextLine();
				System.out.println("Enter vehicle's year of manufacture: ");
				int year = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter vehicle's price: ");
				double price = scan.nextDouble();
				scan.nextLine();
				System.out.println("Enter vehicle's color: ");
				String color = scan.nextLine();

				System.out.println("Enter \"c\": To Add A Car");
				System.out.println("Enter \"m\": To Add A Motobike");
				System.out.println("Enter \"t\": To Add A Truck");
				String type = scan.nextLine();
				switch (type) {
				case "c": {
					System.out.println("Enter number of seats: ");
					int seater = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter engine type: ");
					String engine = scan.nextLine();
					Car car = new Car(id, brand, year, price, color, seater, engine);
					vehicleManagement.add(car);
					break;
				}
				case "m": {
					System.out.println("Enter engine power: ");
					String power = scan.nextLine();
					Motorbike motor = new Motorbike(id, brand, year, price, color, power);
					vehicleManagement.add(motor);
					break;
				}
				case "t": {
					System.out.println("Enter load capacity: ");
					String capacity = scan.nextLine();
					Truck truck = new Truck(id, brand, year, price, color, capacity);
					vehicleManagement.add(truck);
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
				System.out.println("Enter vehicle's id: ");
				String id = scan.nextLine();
				vehicleManagement.delete(id);
				break;
			}
			case "3": {
				System.out.println("Enter vehicle's brand: ");
				String brand = scan.nextLine();
				System.out.println("Enter vehicle's color: ");
				String color = scan.nextLine();
				vehicleManagement.search(brand, color).forEach(item -> System.out.println(item.toString()));
				break;
			}
			case "4": {
				vehicleManagement.show();
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
