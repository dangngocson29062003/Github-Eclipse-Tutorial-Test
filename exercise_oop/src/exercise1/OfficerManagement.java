package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfficerManagement {
	List<Officer> officers;

	/* Constructors */
	public OfficerManagement() {
		this.officers = new ArrayList<>();
	}

	/* Methods */
	public List<Officer> addOfficer(Officer officer) {
		this.officers.add(officer);
		return this.officers;
	}

	public List<Officer> searchOfficerByName(String fullName) {
		return this.officers.stream().filter(officer -> officer.fullName.contains(fullName))
				.collect(Collectors.toList());
	}

	public void showOfficersList() {
		this.officers.forEach(officer -> System.out.println(officer.toString()));
	}
}
