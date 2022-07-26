package project_simple_game;

/*main class*/
public class Main {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating object of the player1 class*/
		Player2 player2 = new Player2("Bobzero", "AKM", 100, true);

		/*testing weapon1*/
		player2.damaged_by_gun1();
		player2.damaged_by_gun2();
		player2.damaged_by_gun2();
		
	}

}
