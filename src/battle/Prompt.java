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
	
	public String getAttack(String prompt) {
		System.out.println(prompt);
		String ans = scanner.nextLine();
		if (ans.equals("1")){
			System.out.println("\nYou attack!\n");
		}
		else if (ans.equals("2")) {
			System.out.println("\nYou run away! Coward...\n");
		}
		else {
			getAttack("Please use correct input!");
		}
		return ans;
	}
	
	public String getAnswer(String prompt) {
		System.out.println(prompt);
		String ans = scanner.nextLine();
		if (ans.equals("y")){
			System.out.println("\nFIGHT ON FOR GLORY.\n");

		}
		else if (ans.equals("n")){
			System.out.println("\nPathetic.\n");

		}
		else {
			getAnswer("Please use correct input!");
		}
		return ans;
	}
}
