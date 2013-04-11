package game;

import core.Options;

/**
 * Zone Class
 *
 */
public class Zone {
	/**
	 * Fields in the Zone
	 */
	protected Field field[][];
	protected int nbFields;
	protected int nbPawns;
	
	/**
	 * Constructor of Zone Class
	 * 
	 * @param nbFields
	 * @param nbPawns
	 */
	public Zone(Options options) {
		nbFields = options.getNbFields();
		nbPawns = options.getNbPawns();
		
		field = new Field[nbFields][nbFields];
		
		for(int i = 0; i < nbFields; i ++)
			for(int j = 0; j < nbFields; j++)
				field[i][j] = new Field(nbPawns, options.getNbPlayers());
		
	}
	
	public Field getField(int _i, int _j) {
		return field[_i/nbPawns][_j/nbPawns];
	}
	
	public int getNbFields() {
		return nbFields;
	}
	
	public int getMaxPawns() {
		return nbFields * nbPawns;
	}
	
	/**
	 * Unitary Test of Zone Class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
