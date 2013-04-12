
package consoleui;

import game.Color;
import game.Game;

/**
 * ConsoleUI Class, handle the display of the game in the Console via basic System.out.
 */
public class ConsoleUI {
    
    /**
     * Line separator of the system ( Just a System.lineSeparator(), renamed to make it shorter )
     */
    static protected String nl       = System.lineSeparator();
    
    /**
     * Like nl, but with two System.lineSeparator(), to make a space behind.
     */
    static protected String twonl    = System.lineSeparator() + System.lineSeparator();
    
    // TODO: Find a way to replace it :X.
    
    /**
     * Number of Pawns in the game.
     */
    protected static int    nbPawns  = 3;
    
    /**
     * Number of Fields in the game.
     */
    protected static int    nbFields = 2;
    
    /**
     * Max number of Pawns in the game.
     */
    protected static int    maxPawns = 6;
    
    /**
     * Constructor : Does nothing atm.
     */
    public ConsoleUI() {
        
    }
    
    /**
     * Starts the UI with the game passed in parameter.
     * 
     * @param game
     *            The game from which to start the UI.
     */
    public void start(Game game) {
        
        // Draw the game ( Maybe add a loop in which we'll handle inputs and
        // playing ).
        draw(game);
    }
    
    /**
     * Print the object given in parameter in the default output ( Maybe find a way to print it in a
     * BufferedOutput to format a little ? ).
     * 
     * Print the object with two line ending, to make a space behind.
     * 
     * @param str
     *            The object to print
     */
    static public void print(Object str) {
        
        System.out.print(str.toString() + twonl);
    }
    
    public static String border() {
        
        String ret = new String();
        
        for (int k = 0; k < nbFields; k++) {
            for (int l = 0; l < nbPawns; l++) {
                ret += "---------";
            }
            if (k != nbFields - 1)
                ret += "--  --";
        }
        ret += nl;
        
        return ret;
    }
    
    static public void draw(Game game) {
        
        // String to return
        String ret = new String();
        
        // Add the current Player
        ret += "Current Player : " + game.getCurrent().getName();
        
        // Add a blank line
        ret += twonl;
        
        // Add the Color of the Current Player
        ret += "Player Color : " + game.getCurrent().getColor();
        
        // Add a blank line
        ret += twonl;
        
        // Add some spaces to align the field
        ret += "               ";
        
        // For the max number of Pawns, we draw the Columns Number, with right
        // align of the numbers
        for (int i = 0; i < maxPawns; i++) {
            if (i % nbPawns == 0 && i != 0)
                ret += "  ";
            
            if (i < 10)
                ret += "Col   " + i + "  ";
            else if (i < 100)
                ret += "Col  " + i + "  ";
            else
                ret += "Col " + i + "  ";
        }
        
        // Add a blank line
        ret += twonl;
        
        // Add some spaces
        ret += "             ";
        
        ret += border();
        
        // For the max number of Pawns in a row/column, we draw the Line number
        // ( With right
        // align too ), then the whole line of the Pawns
        for (int i = 0; i < maxPawns; i++) {
            // Line number
            if (i < 10)
                ret += "Line   " + i + " : ";
            else if (i < 100)
                ret += "Line  " + i + " : ";
            else
                ret += "Line " + i + " : ";
            
            // First | at the extreme left
            ret += "  |";
            
            // All the Pawns
            for (int j = 0; j < maxPawns; j++) {
                Color color = game.getPawn(j, i).getColor();
                
                // To add the space between the fields
                if (j % nbPawns == 0 && j != 0)
                    ret += "|  |";
                // Change the alignment based on the color
                switch (color) {
                    case red:
                        ret += "|  " + color + "  |";
                        break;
                    case blue:
                        ret += "|  " + color + " |";
                        break;
                    case green:
                        ret += "| " + color + " |";
                        break;
                    case empty:
                        ret += "| " + color + " |";
                        break;
                }
            }
            
            // Last | at the extreme right
            ret += "|";
            
            // Add a new line
            ret += nl;
            
            // Add some Spaces
            ret += "             ";
            
            // Add the border ( TODO : Put it in a method, cuz it's used a lot )
            ret += border();
            
            // If we're between two fields, put a space with a border
            if ((i + 1) % nbPawns == 0 && i != 0 && i != maxPawns - 1) {
                ret += nl;
                
                ret += "             ";
                
                ret += border();
            }
        }
        
        // Then print it !
        print(ret);
    }
    
    /**
     * Test of ConsoleUI Class
     * 
     * @param args
     *            Hahalol
     */
    public static void main(String[] args) {
        
        ConsoleUI.print(">> We create a new ConsoleUI <<");
        
        ConsoleUI console = new ConsoleUI();
        
        ConsoleUI.print(">> We create a new Game");
        
        Game game = new Game();
        
        ConsoleUI.print(">> Then we start the display of that game in the console");
        
        console.start(game);
    }
    
}
