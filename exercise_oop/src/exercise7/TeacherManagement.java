package exercise7;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {
	List<Teacher> teachers;

	// Constructor
	public TeacherManagement() {
		this.teachers = new ArrayList<Teacher>();
	}
	// Getters & Setters

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	// Methods
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	public void deleteTeacher(String id) {
		this.teachers.removeIf(item -> item.id.equals(id));
	}

	public double caculateRealSalary(String id) {
		Teacher teacher = this.teachers.stream().filter(item -> item.id.equals(id)).findFirst().orElse(null);
		if (teacher == null) {
			return 0;
		} else {
			return teacher.getSalary() + teacher.getBonus() - teacher.getPenalty();
		}
	}
}
