package game;

/**
 * Pawn Class, contains just the value of the Pawn
 * 
 * @author Someone
 */
public class Pawn {
	/**
	 * Owner of the Pawn ( -1 : No Owner; 0~n : Player n°0~n )
	 */
	protected int owner;
	protected int nbPlayers;

	/**
	 * Pawn Constructor, initialize the owner to 0
	 */
	public Pawn(int _nbPlayers) {
		this.owner = -1;
		this.nbPlayers = _nbPlayers;
	}

	/**
	 * Get Owner of the Pawn
	 *
	 * @return owner Owner of the Pawn
	 */
	public int getOwner() {
		return owner;
	}

	/**
	 * Set Owner of the Pawn
	 * 
	 * @param owner Owner of the Pawn
	 */
	public void setOwner(int _owner) {
		if(_owner >= nbPlayers)
			owner = nbPlayers;
		else
			owner = _owner;
	}

	/**
	 * Test of Pawn Class
	 */
	public static void main(String[] args) {
		System.out.println("Test of Pawn Class");
		
		Pawn test = new Pawn(5);
		
		System.out.println(test.owner);
		
		test.setOwner(7);

		System.out.println(test.owner);
	}

}
