package project_tic_tac_toe;

/*THIS IS A TICTACTOE GAME RUNNING ONLY IN CONSOLE*/

/*must imports*/
import java.util.*;

/*main class*/
public class tic_tac_toe {
	
	static ArrayList<Integer> PlayerPositions = new ArrayList<>();
	static ArrayList<Integer> ComputerPositions = new ArrayList<>();

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
				/*avoiding to retake the taken positions*/
				while(PlayerPositions.contains(position) || ComputerPositions.contains(PlayerPositions)) {
					System.out.println("Wrong replacement, Enter the replacement again");
					position = playerPosition.nextInt();
				}
				
				/*first we put the choice*/
				place_piece(gameBoard, position, "Player");
			
			
				/*here we create Random class fot the computer to play*/
				Random random = new Random();
				/*this will randomize from 1 - 9*/
				int computerPosition = random.nextInt(9) + 1;
				while(PlayerPositions.contains(position) || ComputerPositions.contains(PlayerPositions)) {
					System.out.println("Wrong replacement, Enter the replacement again");
					position = playerPosition.nextInt();
		
					/*this will randomize from 1 - 9*/
					computerPosition = random.nextInt(9) + 1;
					
				}
		
				
				
				/*computer's position*/
				place_piece(gameBoard, computerPosition, "Computer");
				
				/*then we display the board accoridingly*/
				print_game_board(gameBoard);
			    /*just leaving some spacee*/
				System.out.println("\n");
				
				
				/*checking and displaying the winner*/
				String result = checkWinner();
				System.out.println(result);
				
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
			/*addig position to arraylist*/
			PlayerPositions.add(position);
		}else {
			symbol = 'O';
			/*addig position to arraylist*/
			ComputerPositions.add(position);
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
	@SuppressWarnings("rawtypes")
	public static String checkWinner() {
		
		/*winning conditions*/
		List TopRow = Arrays.asList(1, 2, 3);
		List MidRow = Arrays.asList(4, 5, 6);
		List BottomRow = Arrays.asList(7, 8, 9);
		List RightColumn = Arrays.asList(1, 4, 7);
		List MidColumn = Arrays.asList(2, 5, 8);
		List LeftColumn = Arrays.asList(3, 6, 9);
		List Cross1 = Arrays.asList(1, 5, 9);
		List Cross2 = Arrays.asList(7, 5, 3);

		/*creating a list which we gonna add all the above conditions*/
		/*instead of iterating all the lists above so that we
		 * will only iterate this one list here*/
		List<List> Winning = new ArrayList<>();
		Winning .add(TopRow);
		Winning.add(MidRow);
		Winning.add(BottomRow);
		Winning.add(RightColumn);
		Winning.add(MidColumn);
		Winning.add(LeftColumn);
		Winning.add(Cross1);
		Winning.add(Cross2);
		
		/*now iterating the list*/
		for(List L : Winning) {
			if(PlayerPositions.containsAll(L)) {
				return "Congratulations you win!!";
			}else if(ComputerPositions.containsAll(L)) {
				return "Sorry! Better luck next time..";
			}else if(ComputerPositions.size() + PlayerPositions.size() == 9) {
				return "CAT!";
			}
		}
		
		
		return "";
	}

}

