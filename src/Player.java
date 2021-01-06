import java.util.Scanner;

public class Player {
	// two players: red and yellow
	public final char[] PLAYERS = {'R', 'Y'};
	
	private char currentPlayer;
	private int move;
	
	
	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	
	public char getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(char currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	// change players after every turn
	public void changePlayers() {
		if (currentPlayer == PLAYERS[0]) {
			currentPlayer = PLAYERS[1];
		} else {
			currentPlayer = PLAYERS[0];
		}
	}
	
	// prompt player to enter their desired column to place piece
	public void move(char player) {
		// indicate turn
		System.out.println("player " + player + " turn: ");
		
		// prompt player to enter desired column
		Scanner playerInput = new Scanner(System.in);
		System.out.println("where would you like to drop your piece?");
		move = playerInput.nextInt();
		
		playerInput.close();
		
	}
	
	
	


}
