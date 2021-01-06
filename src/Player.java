
public class Player {
	// two players: red and yellow
	public final char[] PLAYERS = {'R', 'Y'};
	
	private char currentPlayer;
	
	// getter for currentPlayer
	public char getCurrentPlayer() {
		return currentPlayer;
	}

	// setter for currentPlayer
	public void setCurrentPlayer(char currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	
	public void changePlayers() {
		if (currentPlayer == PLAYERS[0]) {
			currentPlayer = PLAYERS[1];
		} else {
			currentPlayer = PLAYERS[0];
		}
	}
	
	
	


}
