
public class FullGame {

	public static void main(String[] args) {
		Gameboard game = new Gameboard();
		
		// player R will begin every game
		game.setCurrentPlayer('R');
		
		// introduction
		System.out.println("welcome to connect four!");
		game.blankGB();
		
		System.out.println();
		
		// prompt user for move, and generate new gameboard with spot filled
		game.fillGB(game.getGameboard(), game.playerMove(game.getCurrentPlayer()), game.getCurrentPlayer());
		
		game.printGB(game.getGameboard());
		

	}

}
