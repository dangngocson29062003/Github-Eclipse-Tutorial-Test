package exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleManagement {
	List<Vehicle> vehicles;

	// Constructor
	public VehicleManagement() {
		vehicles = new ArrayList<Vehicle>();
	}

	// Methods
	public void add(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void delete(String id) {
		this.vehicles.removeIf(item -> id.equals(id));
	}

	public List<Vehicle> search(String brand, String color) {
		return this.vehicles.stream().filter(item -> item.brand.equals(brand) && item.color.equals(color))
				.collect(Collectors.toList());
	}

	public void show() {
		this.vehicles.forEach(item -> System.out.println(item.toString()));
	}
}
