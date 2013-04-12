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

    /**
     * Pawn Constructor, initialize the owner to 0
     */
    public Pawn() {
        this.owner = -1;
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
     * @param owner
     *            Owner of the Pawn
     */
    public void setOwner(int _owner) {
        if (_owner >= 2)
            owner = 2;
        else
            owner = _owner;
    }

    public boolean isEmpty() {
        return owner == -1;
    }

    /**
     * Test of Pawn Class
     */
    public static void main(String[] args) {
        System.out.println("Test of Pawn Class");

        Pawn test = new Pawn();

        System.out.println(test.owner);

        test.setOwner(7);

        System.out.println(test.owner);
    }

}
