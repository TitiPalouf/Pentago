package game;

import consoleui.ConsoleUI;

/**
 * Pawn Class, contains just the color of the Pawn
 * 
 * @author Soinou
 */
public class Pawn {
    /**
     * Color of the Pawn ( defined in Color enum )
     * @see Color
     */
    protected Color color;
    
    /**
     * Pawn Constructor, initialize the color to the color given
     * @param _color Color to put in the Pawn
     * @see Color
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
     * Method to check if the Pawn is empty.
     * @return A Boolean ( True if the pawn is empty, false if it's not )
     */
    public boolean isEmpty() {
        return color == Color.empty;
    }
    
    /**
     * Test of Pawn Class
     */
    public static void main(String[] args) {        
        ConsoleUI.print(">> Test of Pawn Class <<");
        
        ConsoleUI.print(">> We create a new empty Pawn <<");
        Pawn test = new Pawn(Color.empty);
        
        ConsoleUI.print(">> We check its color <<");
        ConsoleUI.print(test.getColor());
        
        ConsoleUI.print(">> We set this pawn to blue <<");
        
        ConsoleUI.print(">> We set its color to blue <<");
        test.setColor(Color.blue);
        
        ConsoleUI.print(">> We check its color now <<");
        ConsoleUI.print(test.getColor());
    }
    
}
