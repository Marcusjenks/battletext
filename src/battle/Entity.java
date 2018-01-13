package battle;

public class Entity {
	public Entity(){
				
	}
	
	protected String name;
	protected int health;
	protected int strength;
	protected int exp;
	
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
		}
		
}

