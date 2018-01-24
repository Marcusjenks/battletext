package battle;

public class Player extends Entity {

	public Player(String name, int health, int strength, int lvl, int exp) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.lvl = lvl;
		this.exp = exp;

	}

	public void dead() {
		System.out.println("You died! How Lame");
	}

	public void gainExp(int enemyExp) {
		this.exp += enemyExp;
	}

	public void levelUp() {
		while (this.exp >= 100) {
			this.exp -= 100;
			this.lvl += 1;
			System.out.println("\nYou reached level " + this.lvl + "!\n");
			this.health += 20;
			this.strength += 5;
		}
	}
}
