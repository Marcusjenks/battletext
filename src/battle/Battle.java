package battle;

public class Battle {

	public static void main(String[] args) {
		Enemy enemy;
		enemy = new Enemy();
	
		Prompt playerName = new Prompt();
		Player player = new Player(playerName.getString("Welcome to battletext! What is your name?"), 200, 20);
		System.out.println("Hello " + player.getName() + ". You have " + player.getHealth() + " HP and " + player.getStrength() + " Strength.");
		System.out.println("Enemy: " + enemy.getName() + " | Health: " + enemy.getHealth() + " | Strength: " + enemy.getStrength());
		

}
}

