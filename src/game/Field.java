package game;

public class Field {
	protected Pawn[][] pawn;
	protected int nbPawns;

	public Field(int _nbPawns, int nbPlayers) {
		nbPawns = _nbPawns;

		pawn = new Pawn[nbPawns][nbPawns];

		for (int i = 0; i < nbPawns; i++)
			for (int j = 0; j < nbPawns; j++)
				pawn[i][j] = new Pawn(nbPlayers);
	}

	public Pawn getPawn(int _i, int _j) {
		return pawn[_i % nbPawns][_j % nbPawns];
	}

	/**
	 * @param args
	 */
	public static void main() {
		// TODO Auto-generated method stub

	}

}
