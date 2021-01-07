import java.util.Scanner;

public class GameboardLogic {
	
	// gameboard dimensions
	public final int COL = 7;
	public final int ROW = 6;
	private char[][] gameboard = new char[COL][ROW];
	
	
	// "empty" char for empty spots on gameboard
	public final char EMPTY = '.';
	

	// getter for gameboard
	public char[][] getGameboard() {
		return gameboard;
	}

	// setter for gameboard
	public void setGameboard(char[][] gameboard) {
		this.gameboard = gameboard;
	}

	// generate blank board at start of every new game
	public void blankGB() {
		
		// filling in all gameboard spots at beginning with '.'
		for (int row = 0; row < ROW; row++) {
			for (int col = 0; col < COL; col++) {
				gameboard[col][row] = EMPTY; 
				System.out.print(gameboard[col][row]);
			}
			System.out.println();
		}
	}
	
	
	// generate new gameboard based on player's column choice
	public void fillGB (char[][] gameboard, int chosenCol, char player) {
		
		// generate new gameboard with new piece placed into given column
		for (int row = ROW - 1; row >= 0; row--) {
			if (gameboard[chosenCol][row] == EMPTY)  {
				gameboard[chosenCol][row] = player;
				return;
			}
		}
		
		// set gameboard as the newly generated gameboard
		this.gameboard = gameboard;
		
	}
	
	// prints the new gameboard after a move has been made
	public void printGB(char[][] gameboard) {
		
		for (int row = 0; row < ROW; row++) {
			for (int col = 0; col < COL; col++) {
				System.out.print(gameboard[col][row]);
			}
			System.out.println();
		}
	}
	
	
	// return boolean for legality of chosen column 
	public boolean legalCol(char[][] gameboard, int chosenCol) {
		
		// if there is an empty spot in column, return true
		for (int row = ROW - 1; row >= 0; row--) {
			if (gameboard[chosenCol][row] == EMPTY) {
				return true;
			}
		}
		
		// return false if there are no more empty spots in chosen column
		return false;
	}
	
	

}
