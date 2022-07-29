package project_tic_tac_toe;

/*THIS IS A TICTACTOE GAME RUNNING ONLY IN CONSOLE*/

/*must imports*/
import java.util.*;

/*main class*/
public class tic_tac_toe {

	/*main method*/
	public static void main(String[] args) {

		
			
			/*creating the scanner object*/
			Scanner playerPosition = new Scanner(System.in);
			
			/*using 2D array to create a gameboard*/
			char [][] gameBoard = {{' ', '|', ' ', '|', ' '},
					{'-', '+', '-', '+', '-'}, 
					{' ', '|', ' ', '|', ' '}, 
					{'-', '+', '-', '+', '-'}, 
					{' ', '|', ' ', '|', ' '}};  
			
			/*this will print the gameBoar at the beggining*/
			print_game_board(gameBoard);
			
			/*the program will ask for input until the game is over*/
			while(true) {

				/*asking for the user input*/
				System.out.println("\nEnter your replacement (1-9) : ");
				int position = playerPosition.nextInt();
				
				/*first we put the choice*/
				place_piece(gameBoard, position, "Player");
			
			
				/*here we create Random class fot the computer to play*/
				Random random = new Random();
				/*this will randomize from 1 - 9*/
				int computerPosition = random.nextInt(9) + 1;
			
				/*computer's position*/
				place_piece(gameBoard, computerPosition, "Computer");
				
				/*then we display the board accoridingly*/
				print_game_board(gameBoard);
			    /*just leaving some spacee*/
				System.out.println("\n");
				
			}

			
		
	
	}
	
	/*method to call the gameboard*/
	public static void print_game_board(char[][] gameBoard) {
		
		for(char[] x : gameBoard) {

			for(char y: x) {
				System.out.print(y);
			}
			System.out.println();
		}
		
	}
	
	
	/*mehtod for placing pieces*/
	public static void place_piece(char[][] gameBoard, int position, String user) {
		
		/*declaring a variable for symbol*/
		char symbol = 'X';
		
		/*classifying robot and player*/
		if(user.equals("Player")) {
			symbol = 'X';	
		}else {
			symbol = 'O';
		}
		
		/*now to work with user input*/
		/*we are going to use switch case*/
		/*here we should be careful with the index*/
		switch (position) {
		
		case 1 : 
			gameBoard[0][0] = symbol;
			break;
			

		case 2 : 
			gameBoard[0][2] = symbol;
			break;
			

		case 3 : 
			gameBoard[0][4] = symbol;
			break;
			

		case 4 : 
			gameBoard[2][0] = symbol;
			break;
			

		case 5 : 
			gameBoard[2][2] = symbol;
			break;
			

		case 6 : 
			gameBoard[2][4] = symbol;
			break;
			

		case 7 : 
			gameBoard[4][0] = symbol;
			break;
			

		case 8 : 
			gameBoard[4][2] = symbol;
			break;
			

		case 9 : 
			gameBoard[4][4] = symbol;
			break;
		
		}
	}
	
	/*a method to check the winner*/
	public static String checkWinner() {
		List TopRow = Arrays.asList(1, 2, 3);
		return "";
	}

}

