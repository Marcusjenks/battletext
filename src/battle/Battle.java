package battle;

public class Battle {

	public static void main(String[] args) {
		Prompt playAgain = new Prompt();
		Prompt playerName = new Prompt();
		Player player = new Player(playerName.getString("Welcome to battletext! What is your name?"), 200, 20, 0);
		player.getInfo();
		String answer;
		Enemy enemy;
		
		boolean running = true;
		while (running) {
		enemy = new Enemy();
		enemy.getInfo();
		
		enemy.takeDamage(player.getStrength());
		enemy.stillAlive();
		player.takeDamage(enemy.getStrength());
		player.stillAlive();
		
		System.out.println(player.getHealth());
		System.out.println(enemy.getHealth());
		
		answer = playAgain.getAnswer("Will you fight again for GLORY?");
		if (answer.equals("n")){
			running = false;
		}
		}
		

}
}

