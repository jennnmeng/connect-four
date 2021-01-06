
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

		// continuing alternating between players until gameover is reached
		while (win.gameover(game.getGameboard(), player.getCurrentPlayer()) == true) {

			System.out.println();

			player.move(player.getCurrentPlayer());

			// continue prompting player for column choice if choice is illegal
			while (game.legalCol(game.getGameboard(), player.getMove()) == false) {
				System.out.println("column chosen is invalid.");
			}

			// prompt user for move, and generate new gameboard with spot filled
			game.fillGB(game.getGameboard(), player.getMove(), player.getCurrentPlayer());

			game.printGB(game.getGameboard());

			// change players
			player.changePlayers();
		}

		player.changePlayers();

		// output winning player
		System.out.println("game over! the winner is " + player.getCurrentPlayer() + ".\nplay again?");

	}

}
