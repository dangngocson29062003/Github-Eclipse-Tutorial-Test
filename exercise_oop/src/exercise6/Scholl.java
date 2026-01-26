package exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Scholl {
	List<Student> students;

	// Constructor
	public Scholl() {
		this.students = new ArrayList<Student>();
	}
	// Getter & Setter

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	// Methods
	public void addStudent(Student student) {
		this.students.add(student);
	}

	public List<Student> searchStudentsByAge(int age) {
		return this.students.stream().filter(item -> item.getAge() == age).collect(Collectors.toList());
	}

	public long countStudentsByAgeAndHometown(int age, String hometown) {
		return this.students.stream().filter(item -> item.getAge() == age && item.getHometown().equals(hometown))
				.count();
	}
}
