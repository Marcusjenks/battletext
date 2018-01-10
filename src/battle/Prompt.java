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
	
	public String getAnswer(String prompt) {
		System.out.println(prompt);
		String ans = scanner.nextLine();
		if (ans.equals("y")){
			System.out.println("FIGHT ON FOR GLORY.");

		}
		else if (ans.equals("n")){
			System.out.println("Pathetic.");

		}
		else {
			getAnswer("Please use correct input!");
		}
		return ans;
	}
}
