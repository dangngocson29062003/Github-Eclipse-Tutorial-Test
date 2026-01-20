package exercise7;

abstract class Person {
	protected String id;
	protected String fullName;
	protected int age;
	protected String hometown;

	// Constructor
	public Person(String id, String fullName, int age, String hometown) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.hometown = hometown;
	}
	// Getters and Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + this.id + " | " + "Name: " + this.fullName + " | " + "Age: " + this.age + " | " + "Hometown: "
				+ this.hometown;
	}
}
