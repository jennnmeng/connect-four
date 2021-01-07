
import tests.detectwintests;

public class DetectWinLogic extends GameboardLogic {

	// detect vertical win
	public boolean vertical(char[][] gameboard, char player) {

		for (int col = 0; col < COL; col++) {
			for (int row = ROW - 4; row >= 0; row--)
				if (gameboard[col][row] != EMPTY && gameboard[col][row] == gameboard[col][row + 1]
						&& gameboard[col][row + 1] == gameboard[col][row + 2]
						&& gameboard[col][row + 2] == gameboard[col][row + 3]) {
					return true;

				}
		}

		return false;

	}

	// detect horizontal win
	public boolean horizontal(char[][] gameboard, char player) {

		for (int row = ROW - 1; row >= 0; row--) {
			for (int col = 0; col < COL - 3; col++) {
				if (gameboard[col][row] != EMPTY && gameboard[col][row] == gameboard[col + 1][row]
						&& gameboard[col + 1][row] == gameboard[col + 2][row]
						&& gameboard[col + 2][row] == gameboard[col + 3][row])
					return true;
			}
		}

		return false;

	}

	// detect diagonal left leaning
	public boolean diagonalLeft(char[][] gameboard, char player) {

		for (int row = ROW - 3; row >= 0; row--) {
			for (int col = COL - 3; col >= 0; col--) {
				if (gameboard[col][row] != EMPTY && gameboard[col][row] == gameboard[col + 1][row - 1]
						&& gameboard[col + 1][row - 1] == gameboard[col + 2][row - 2]
						&& gameboard[col + 2][row - 2] == gameboard[col + 3][row - 3])
					return true;
			}
		}

		return false;
	}

	// detect diagonal right leaning
	public boolean diagonalRight(char[][] gameboard, char player) {

		for (int row = ROW - 1; row >= 3; row--) {
			for (int col = COL - 1; col >= 3; col--) {
				if (gameboard[col][row] != EMPTY && gameboard[col][row] == gameboard[col - 1][row - 1]
						&& gameboard[col - 1][row - 1] == gameboard[col - 2][row - 2]
						&& gameboard[col - 2][row - 2] == gameboard[col - 3][row - 3])
					return true;
			}
		}

		return false;
	}

	// determine gameover, return false if no winner
	public boolean gameover(char[][] gameboard, char player) {
		if (vertical(gameboard, player) || horizontal(gameboard, player) || diagonalLeft(gameboard, player)
				|| diagonalRight(gameboard, player))
			return true;

		return false;
	}

}
