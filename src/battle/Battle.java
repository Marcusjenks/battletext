package battle;

public class Battle {

	public static void main(String[] args) {
		Prompt playerAction = new Prompt();
		Prompt playAgain = new Prompt();
		Prompt playerName = new Prompt();
		Player player = new Player(playerName.getString("Welcome to battletext! What is your name?"), 20, 5, 0);
		String choice;
		String answer;
		Enemy enemy;
		
		boolean running = true;
		
		while (running) {
			enemy = new Enemy();
			
			System.out.println("\nYou have encountered: " + enemy.getName() + "! \n");
									
			while(enemy.getHealth() > 0 && player.getHealth() >0) {
				
				enemy.getInfo();

				player.getInfo();

				choice = playerAction.getAttack("\nWhat will you do? \n(1) Attack \n(2) Run away");
				
				if (choice.equals("1")) {				
					enemy.takeDamage(player.getStrength());
			
					if(enemy.getHealth() <= 0) {
						enemy.dead();
						break;
					}
			
					player.takeDamage(enemy.getStrength());
				}
				else {
					break;
				}
			}

		
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

