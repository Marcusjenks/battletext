package battle;

public class Battle {

	public static void main(String[] args) {
		Enemy[] enemy;
		enemy = new Enemy[1];
		enemy[0] = new Enemy("Bat", 5, 1);
		
		Prompt playerName = new Prompt();
		Player player = new Player(playerName.getString("Welcome to battletext! What is your name?"), 200, 20);
		System.out.println("Hello " + player.getName() + ". You have " + player.getHealth() + " HP and " + player.getStrength() + " Strength.");
		System.out.println("Enemy: " + enemy[0].getName() + " Health: " + enemy[0].getHealth() + " Strength: " + enemy[0].getStrength());
	}

}
