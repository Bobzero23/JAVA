package project_simple_game;

/*player1 class*/
public class Player1 {

	/*properties*/
	private String name;
	private String weapon;
	private int health;
	
	/*constructor*/
	public Player1(String name, String weapon, int health) {
		
		/*calling a constuctor*/
		this.name = name;
		this.weapon = weapon;
		this.health = health; 
	}
	
	/*some getters method*/
	public String getName() {
		return name;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	
	/*damage a player using gun1*/
	public void damaged_by_gun1() {
		
		this.health -= 30;  // reduce his health by 20 
		
		if(health < 0) {   // if a player has no health then he is dead
			this.health = 0; // health can not be negative
			System.out.println(getName() + " is hit by weapon1 " + getWeapon() + 
					"  his health is reduced by 30 and new health is " + this.health);
			
		}else {
			System.out.println(getName() + " is hit by weapon1 " + getWeapon() + 
					"  his health is reduced by 30 and new health is " + this.health);
		}
		if(health <= 0)System.out.println(getName() + " is dead");
	}
	
	/*damage a player using gun2*/
	public void damaged_by_gun2() {
		
		this.health -= 50;  // reduce his health by 40 
		
		if(health < 0) {   // if a player has no health then he is dead
			this.health = 0; // health can not be negative
			System.out.println(getName() + " is hit by weapon1 " + getWeapon() + 
					"  his health is reduced by 50 and new health is " + this.health);
			
		}else {
			System.out.println(getName() + " is hit by weapon1 " + getWeapon() + 
					"  his health is reduced by 50 and new health is " + this.health);
		}
		if(health <= 0)System.out.println(getName() + " is dead");
	}
	

	
}
