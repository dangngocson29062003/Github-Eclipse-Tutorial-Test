package exercise4;

import java.util.ArrayList;
import java.util.List;

public class Quarter {
	List<Family> families;

	// Constructor
	public Quarter() {
		families = new ArrayList<>();
	}

	// Getter & Setter
	public List<Family> getFamilies() {
		return families;
	}

	public void setFamilies(List<Family> families) {
		this.families = families;
	}

	// Methods
	public void addFamily(Family family) {
		this.families.add(family);
	}

	public void showFamilies() {
		families.forEach(item -> System.out.println(item.showPerson()));
	}
}
