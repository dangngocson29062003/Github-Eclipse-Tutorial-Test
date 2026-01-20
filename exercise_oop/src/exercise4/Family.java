package exercise4;

import java.util.List;
import java.util.stream.Collectors;

public class Family {
	private String address;
	private List<Person> persons;

	// Constructor
	public Family(String address, List<Person> persons) {
		this.address = address;
		this.persons = persons;
	}
	// Getter & Setter

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	// Methods
	public String showPerson() {
		return "Address: " + this.address + " ***** "
				+ persons.stream().map(Person::showInfo).collect(Collectors.joining(" ------ "));
	}
}
