package exercise10;

public class Text {
	private String str;

	// Constructor
	public Text() {
	}

	public Text(String str) {
		this.str = str;
	}
	// Getters & Setters

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	// Methods
	public int countLength() {
		return str.trim().split("\\s+").length;
	}

	public int countA() {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char temp = Character.toLowerCase(str.charAt(i));
			if (temp == 'a') {
				count++;
			}
		}
		return count;
	}

	public String standardizeText() {
		return this.str.trim().replaceAll("\\s+", " ");
	}
}
