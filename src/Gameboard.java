import java.util.Scanner;

public class Gameboard {
	// two players: red and yellow
	private final char[] PLAYERS = {'R', 'Y'};
	
	// gameboard dimensions
	private final int COL = 7;
	private final int ROW = 6;
	private char[][] gameboard = new char[COL][ROW];
	
	// "empty" char for empty spots on gameboard
	private char empty = '.';
	
	// current player
	// beginning player will always be red
	private char currentPlayer = 'R';
	

	// getter for gameboard
	public char[][] getGameboard() {
		return gameboard;
	}

	// setter for gameboard
	public void setGameboard(char[][] gameboard) {
		this.gameboard = gameboard;
	}

	// getter for current player
	public char getCurrentPlayer() {
		return currentPlayer;
	}

	// setter for currentPlayer
	public void setCurrentPlayer(char currentPlayer) {
		this.currentPlayer = currentPlayer;
	}


	// generate blank board
	public void blankGB() {
		
		// filling in all gameboard spots at beginning with '.'
		for (int row = 0; row < ROW; row++) {
			for (int col = 0; col < COL; col++) {
				gameboard[col][row] = empty; 
				System.out.print(gameboard[col][row]);
			}
			System.out.println();
		}
	}
	
	
	// generate new gameboard based on player's column choice
	public void fillGB (char[][] gameboard, int chosenCol, char player) {
		
		// generate new gameboard with new piece placed into given column
		for (int row = 0; row < COL; row++) {
			if (gameboard[chosenCol][row] == empty)  {
				gameboard[chosenCol][row] = player;
				break;
			}
		}
		
		// set gameboard as the newly generated gameboard
		this.gameboard = gameboard;
		
	}
	
	
	public void printGB(char[][] gameboard) {
		for (int row = 0; row < ROW; row++) {
			for (int col = 0; col < COL; col++) {
				System.out.print(gameboard[col][row]);
			}
			System.out.println();
		}
	}
	
	
	// prompt player to enter their desired column to place piece
	public int playerMove(char player) {
		// indicate turn
		System.out.println("player " + player + " turn: ");
		
		// prompt player to enter desired column
		Scanner playerInput = new Scanner(System.in);
		int move;
		System.out.println("where would you like to drop your piece?");
		move = playerInput.nextInt();
		
		// return desired column
		return move;
	}
	
	
	// return boolean for legality of chosen column 
	public boolean legalCol(char[][] gameboard, int chosenCol) {
		
		// if there is an empty spot in column, return true
		for (int row = 0; row < ROW; row++) {
			if (gameboard[chosenCol][row] == empty) {
				return true;
			}
		}
		
		// return false if there are no more empty spots in chosen column
		return false;
	}
	
	

}
