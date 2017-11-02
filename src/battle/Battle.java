package battle;

public class Battle {

	public static void main(String[] args) {
		Player player = new Player("NoOne", 200, 20);
		System.out.println("Welcome to battletext! What is your name?");
		System.out.println("Hello " + player.getName() + ". You have " + player.getHealth() + " HP and " + player.getStrength() + " Strength.");
	}

}
