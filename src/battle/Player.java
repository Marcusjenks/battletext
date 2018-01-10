package battle;

public class Player{
	
	public Player(String name, int health, int strength, int exp){
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.exp = exp;
		
	}
	
	private String name;
	private int health;
	private int strength;
	private int exp;
	
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
		System.out.println("Name: " + getName() + " | Health: " + getHealth() + " | Strength: " + getStrength());

	}

	public void takeDamage(int strength2) {
		this.health = getHealth() - strength2;
		
	}
	
	public void stillAlive() {
		if (this.health <=0){
			System.out.println("You died! How Lame");
		}
		
	}

	
}
