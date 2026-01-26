package exercise10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String input = scan.nextLine();
		Text text = new Text(input);
		System.out.println("Number of words in the text: " + text.countLength());
		System.out.println("Number of characters A: " + text.countA());
		System.out.println("Standardize text: " + text.standardizeText());
	}

}
