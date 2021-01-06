
public class FullGame {

	public static void main(String[] args) {

		Gameboard game = new Gameboard();
		DetectWin win = new DetectWin();
		Player player = new Player();

		// introduction
		System.out.println("welcome to connect four!");
		game.blankGB();

		// red will begin every game
		player.setCurrentPlayer('R');
		
		// turns
		
		// 
		while (win.gameover(game.getGameboard(), player.getCurrentPlayer()) == true) {
			System.out.println();

			// prompt user for move, and generate new gameboard with spot filled
			game.fillGB(game.getGameboard(), game.playerMove(player.getCurrentPlayer()), player.getCurrentPlayer());

			game.printGB(game.getGameboard());

			// yellow's turn
			player.changePlayers();
		}
		
		player.changePlayers();

		// output winning player
		System.out.println("game over! the winner is " + player.getCurrentPlayer() + ".\nplay again?");

	}

}
