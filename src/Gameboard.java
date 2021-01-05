import java.util.Scanner;

public class Gameboard {
	// two players: red and yellow
	private final char[] PLAYERS = {'R', 'Y'};
	
	// gameboard dimensions
	private final int GBX = 7;
	private final int GBY = 6;
	public char[][] gameboard = new char[GBX][GBY];
	
	// "empty" char for empty spots on gameboard
	private char empty = '.';
	
	
	// set blank board 
	public void blankBoardchar(char[][] gameboard) {
		
		// filling in all gameboard spots at beginning with '.'
		for (int col = 0; col < GBX; col++) {
			for (int row = 0; row < GBY; row++) {
				gameboard[col][row] = empty; 
			}
			System.out.println();
		}
		
		this.gameboard = gameboard;
		
	}
	
	
	// generate new gameboard based on player's column choice
	public void newGameboard(char[][] gameboard, int chosenCol, char player) {
		
		// generate new gameboard with new piece placed into given column
		for (int row = 0; row < GBX; row++) {
			if (gameboard[chosenCol][row] == empty)  {
				gameboard[chosenCol][row] = player;
				break;
			}
		}
		
		// set gameboard as the newly generated gameboard
		this.gameboard = gameboard;
		
	}
	
	
	// prompt player to enter their desired column to place piece
	public int playerMove(char player) {
		// indicate turn
		System.out.println("Player: " + player);
		
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
		for (int row = 0; row < GBY; row++) {
			if (gameboard[chosenCol][row] == empty) {
				return true;
			}
		}
		
		// return false if there are no more empty spots in chosen column
		return false;
	}

}
