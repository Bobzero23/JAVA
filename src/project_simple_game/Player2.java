package project_simple_game;

/*player2 class*/
public class Player2 extends Player1 {

	/*player2 can wear armor*/
	boolean armor; 
	private int health;
	
	/*player2 constructor*/
	public Player2(String name, String weapon, int health, boolean armor) {
		super(name, weapon, health);
		this.armor = armor;
		this.health = health;
	}
	
	/*damage a player using gun1*/
	public void damaged_by_gun1() {
		
		if (armor == true) {
			System.out.println(getName() + " is wearing armor");
			this.health -= 20;
			
			if(health < 0) {   // if a player has no health then he is dead
				this.health = 0; // health can not be negative
				
				System.out.println(getName() + " is hit by weapon1 " + getWeapon() + 
						"  his health is reduced by 20 and new health is " + this.health);
				
				
			}else {
				System.out.println(getName() + " is hit by weapon1 " + getWeapon() + 
						"  his health is reduced by 20 and new health is " + this.health);
			}
			if(health <= 0)System.out.println(getName() + " is dead");
		}else {
			
			System.out.println(getName() + " is not wearing armor");
			this.health -= 30;  // reduce his health by 30 
			
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

	}
	
	/*damage a player using gun2*/
	public void damaged_by_gun2() {
		
		if (armor == true) {
			System.out.println(getName() + " is wearing armor");
			this.health -= 30;
			
			if(health < 0) {   // if a player has no health then he is dead
				this.health = 0; // health can not be negative
				System.out.println(getName() + " is dead");
				
				System.out.println(getName() + " is hit by weapon2 " + getWeapon() + 
						"  his health is reduced by 30 and new health is " + this.health);
				
			}else {
				System.out.println(getName() + " is hit by weapon2 " + getWeapon() + 
						"  his health is reduced by 30 and new health is " + this.health);
			}
			if(health <= 0)System.out.println(getName() + " is dead");
		}else {
			
			System.out.println(getName() + " is not wearing armor");
			this.health -= 50;  // reduce his health by 50 
			
			if(health < 0) {   // if a player has no health then he is dead
				this.health = 0; // health can not be negative
				
				System.out.println(getName() + " is hit by weapon2 " + getWeapon() + 
						"  his health is reduced by 50 and new health is " + this.health);
				
			}else {
				System.out.println(getName() + " is hit by weapon2 " + getWeapon() + 
						"  his health is reduced by 50 and new health is " + this.health);
			}
			if(health == 0)System.out.println(getName() + " is dead");
		}

	}
	

	

}
