
import java.util.Scanner;

public class GameLogic {
	
	GameboardLogic gameboard = new GameboardLogic();
	DetectWinLogic win = new DetectWinLogic();
	Player player = new Player();
	
	Scanner userInput = new Scanner(System.in);
	private boolean replay = true;
	
	public void Game() {

		// introduction
		System.out.println("welcome to connect four!");
		gameboard.blankGB();

		// red will begin every game
		player.setCurrentPlayer('R');

		// continuing alternating between players until gameover is reached
		do {
			System.out.println();

			// prompt player for col choice, and set move as col choice
			player.move(player.getCurrentPlayer());

			// check if col choice is legal, and continue prompting player if illegal
			while (gameboard.legalCol(gameboard.getGameboard(), player.getMove()) == false) {
				System.out.println("column chosen is invalid.");
				player.move(player.getCurrentPlayer());
			}

			// prompt user for move, and generate new gameboard with spot filled
			gameboard.fillGB(gameboard.getGameboard(), player.getMove(), player.getCurrentPlayer());

			gameboard.printGB(gameboard.getGameboard());

			// change players
			player.changePlayers();
		} while (win.gameover(gameboard.getGameboard(), player.getCurrentPlayer()) != true);

		player.changePlayers();

		replay();

	}

	// method if the players would like to replay
	public void replay() {
		// output winning player
		System.out.println("game over! the winner is " + player.getCurrentPlayer() + ".\nplay again? (y/n)");
		System.out.println();
		String playAgain = userInput.nextLine();
		
		if (playAgain == "y") {
			replay = true;
		} else {
			replay = false;
		}
		
		while (replay = true) Game();
		
		System.out.println("thanks for playing connect four!");
	}
	
}
