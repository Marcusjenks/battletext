package battle;

public class Player{
	
	public Player(String name, int health, int strength){
		this.name = name;
		this.health = health;
		this.strength = strength;
		
	}
	
	private String name;
	private int health;
	private int strength;
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStrength() {
		return strength;
	}
}
