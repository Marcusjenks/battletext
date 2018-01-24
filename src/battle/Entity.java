package battle;

public class Entity {
	public Entity() {

	}

	protected String name;
	protected int health;
	protected int strength;
	protected int exp;
	protected int lvl;

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getStrength() {
		return strength;
	}

	public int getExp() {
		return exp;
	}

	public void getInfo() {
		System.out.println(getName() + " | Health: " + getHealth() + " | Strength: " + getStrength() + "\n");

	}

	public void takeDamage(int strength2) {
		this.health = this.health - strength2;
		System.out.println(this.name + " takes " + strength2 + " damage!\n");

	}

	public void dead() {
	}

}
