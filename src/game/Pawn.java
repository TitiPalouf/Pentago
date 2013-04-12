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
    protected Color color;
    
    /**
     * Pawn Constructor, initialize the owner to 0
     */
    public Pawn(Color _color) {
        color = _color;
    }    

    /**
     * Get Owner of the Pawn
     * 
     * @return owner Owner of the Pawn
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set Owner of the Pawn
     * 
     * @param owner
     *            Owner of the Pawn
     */
    public void setColor(Color _color) {
        color = _color;
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return color == Color.empty;
    }

    /**
     * Test of Pawn Class
     */
    public static void main(String[] args) {
        System.out.println("Test of Pawn Class");

        Pawn test = new Pawn(Color.empty);

        System.out.println(test.getColor());
        
        System.out.println("Set this pawn to blue");
        
        test.setColor(Color.blue);

        System.out.println(test.getColor());
    }

}
