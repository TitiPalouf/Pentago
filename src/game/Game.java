package game;

import core.Options;

/**
 * Game Class, contains Game Elements, such as Zone, and Players
 * 
 * @author François
 * 
 */
public class Game {

	/**
	 * Zone, contains the Fields and the Pawns.
	 */
	Zone zone = null;

	/**
	 * Array of Players, contains the Players.
	 */
	Player[] player = null;

	/**
	 * Current Player, contains a reference to the current Player
	 */
	Player current = null;

	/**
	 * Constructor of Game Class. Do the following :
	 * <ul>
	 * <li>Initialize the Zone.</li>
	 * <li>Initialize the Players.</li>
	 * </ul>
	 * 
	 * @param options
	 *            Options of the Game, to initialize members with right numbers.
	 */
	public Game(Options options) {
		zone = new Zone(options);

		player = new Player[options.getNbPlayers()];

		for (int i = 0; i < options.getNbPlayers(); i++)
			player[i] = new Player();

		current = player[0];
	}

	public Pawn getPawn(int _i, int _j) {
		return zone.getField(_i, _j).getPawn(_i, _j);
	}

	@Override
	public String toString() {
		int tmp;

		int maxPawns = zone.getMaxPawns();

		String ret = new String();

		tmp = maxPawns * 9 + 14;

		ret += "Current Player : " + current.getName() + System.lineSeparator();

		ret += System.lineSeparator();

		ret += "              ";

		for (int i = 0; i < maxPawns; i++) {
			if (i < 10)
				ret += "Col   " + i + "  ";
			else if (i < 100)
				ret += "Col  " + i + "  ";
			else
				ret += "Col " + i + "  ";
		}

		ret += System.lineSeparator();

		for (int i = 0; i < tmp; i++)
			ret += "-";

		ret += System.lineSeparator();

		for (int i = 0; i < maxPawns; i++) {
			if (i < 10)
				ret += "Line   " + i + " : ";
			else if (i < 100)
				ret += "Line  " + i + " : ";
			else
				ret += "Line " + i + " : ";

			ret += " |";

			for (int j = 0; j < maxPawns; j++) {
				if (getPawn(j, i).owner + 1 < 10)
					ret += "|   " + (getPawn(j, i).owner + 1) + "   |";
				else
					ret += "|   " + (getPawn(j, i).owner + 1) + "   |";
			}

			ret += "|";

			ret += System.lineSeparator();

			for (int k = 0; k < tmp; k++)
				ret += "-";

			ret += System.lineSeparator();
		}

		ret += System.lineSeparator();

		return ret;
	}

	/**
	 * Unitary Test of Game Class
	 */
	public static void main(String[] args) {
		System.out.println("Test of Game Class");

		Options opt = new Options();

		Game test = new Game(opt);

		System.out.println(test.toString());

	}

}
