package battle;

import java.util.Scanner;

public class Prompt {
	private Scanner scanner;

	public Prompt() {
		scanner = new Scanner(System.in);
	}

	public String getString(String prompt) {
		System.out.println(prompt);
		return scanner.nextLine();
	}
}
