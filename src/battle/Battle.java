package battle;

public class Battle {

	public static void main(String[] args) {
		Prompt playerAction = new Prompt();
		Prompt playAgain = new Prompt();
		Prompt playerName = new Prompt();
		Player player = new Player(playerName.getString("Welcome to battletext! What is your name?"), 20, 5, 1, 0);
		String choice;
		String answer;
		Enemy enemy;

		boolean running = true;

		while (running) {
			enemy = new Enemy();

			System.out.println("\nYou have encountered: " + enemy.getName() + "! \n");

			boolean fighting = true;
			while (fighting) {
				enemy.getInfo();

				player.getInfo();

				choice = playerAction.getString("\nWhat will you do? \n(1) Attack \n(2) Run away");
				boolean response = true;
				while (response) {
					if (choice.equals("1")) {
						System.out.println("\nYou attack!\n");
						enemy.takeDamage(player.getStrength());

						if (enemy.getHealth() <= 0) {
							enemy.dead();
							player.gainExp(enemy.getExp());
							player.levelUp();
							fighting = false;
							response = false;
						}

						player.takeDamage(enemy.getStrength());

						if (player.getHealth() <= 0) {
							fighting = false;
							response = false;
						}

						response = false;

					} else if (choice.equals("2")) {
						System.out.println("You run away! Coward...");
						fighting = false;
						response = false;
					} else {
						choice = playerAction.getString("Please use correct input!");
					}
				}
			}

			if (player.getHealth() <= 0) {
				System.out.println(
						"The battle for glory has ended. Perhaps you will have better luck in the next life...");
				running = false;
			} else {
				answer = playAgain.getString("Will you fight again for GLORY? y/n");
				boolean ans = true;
				while (ans) {
					if (answer.equals("n")) {
						System.out.println("Pathetic");
						running = false;
						ans = false;
					} else if (answer.equals("y")) {
						System.out.println("Fight on for glory!");
						ans = false;
					} else {
						answer = playAgain.getString("Please use correct input");
					}
				}
			}
		}
	}
}
