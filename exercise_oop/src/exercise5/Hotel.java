package exercise5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	List<Room> rooms;

	// Constructor
	public Hotel() {
		this.rooms = new ArrayList<Room>();
	}

	// Methods
	public void booking(Room room) {
		this.rooms.add(room);
	}

	public void deleteCustomer(String idNumber) {
		this.rooms.removeIf(item -> item.person.getIdNumber().equals(idNumber));
	}

	public double caculatePrice(String idNumber) {
		Room roomRented = this.rooms.stream().filter(item -> item.person.getIdNumber().equals(idNumber)).findFirst()
				.orElse(null);
		return roomRented.price * roomRented.totalDays;
	}

	public void show() {
		rooms.forEach(item -> System.out.println(item.toString()));
	}
}
