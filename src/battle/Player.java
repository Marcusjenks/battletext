package battle;

public class Player extends Entity{

	public Player(String name, int health, int strength, int exp) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.exp = exp;
		
	}	
	public void stillAlive() {
		if (this.getHealth() <=0){
		System.out.println("You died! How Lame");
		}
	}
}
