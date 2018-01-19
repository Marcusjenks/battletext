package battle;

public class Battle {

	public static void main(String[] args) {
		Prompt playAgain = new Prompt();
		Prompt playerName = new Prompt();
		Player player = new Player(playerName.getString("Welcome to battletext! What is your name?"), 20, 5, 0);
		player.getInfo();
		String answer;
		Enemy enemy = new Enemy();
		
		boolean running = true;
		
		while (running) {
			enemy = new Enemy();
			enemy.getInfo();
			
			while(enemy.getHealth() >= 0 && player.getHealth() >=0) {
			
				enemy.takeDamage(player.getStrength());
			
				if(enemy.getHealth() <= 0) {
					enemy.dead();
					break;
				}
			
			player.takeDamage(enemy.getStrength());
			}

			System.out.println(player.getHealth());
			System.out.println(enemy.getHealth());
		
			if (player.getHealth() <= 0) {
				System.out.println("The battle for glory has ended. Perhaps you will have better luck in the next life...");
				running = false;
				break;
			}
			
			answer = playAgain.getAnswer("Will you fight again for GLORY? y/n");
			if (answer.equals("n")){
				running = false;
			}
		}
		

}
}

