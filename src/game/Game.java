package game;

import consoleui.ConsoleUI;

/**
 * Game Class, contains Game Elements, such as Zone, and Players
 * 
 */
public class Game {
    
    /**
     * Zone, contains the Fields and the Pawns.
     * 
     * @see Zone
     */
    protected Zone zone = null;
    
    /**
     * Array of Players, contains the Players.
     * 
     * @see Player
     */
    protected Player[] player = null;
    
    /**
     * Current Player, contains a reference to the current Player
     * 
     * @see Player
     */
    protected Player current = null;
    
    /**
     * Constructor of Game Class. Do the following :
     * <ul>
     * <li>Initialize the Zone.</li>
     * <li>Initialize the Players.</li>
     * </ul> 
     */
    public Game() {
        zone = new Zone();
        
        player = new Player[2];
        
        player[0] = new Player(Color.red);
        
        player[1] = new Player(Color.blue);
        
        setCurrent(player[0]);
    }
    
    /**
     * Clear method, used to clear the whole zone by putting all pawns to empty.
     * 
     * Will be used when the game will be playable again, to avoid destroying and reconstructing all objects.
     * 
     * call clear() of Zone Class
     * 
     * @see Zone
     */
    public void clear() {
        zone.clear();
    }
    
    /**
     * Method to get the Pawn at the specified location
     * @param _x X position of the Pawn
     * @param _y Y Position of the Pawn
     * @return A Pawn
     * @see Pawn
     */
    public Pawn getPawn(int _x, int _y) {
        return zone.getField(_x, _y).getPawn(_x, _y);
    }
    
    /**
     * Method to get the field at the specified location.
     * @param _x X position of the field
     * @param _y Y position of the field
     * @return A Field
     * @see Field
     */
    public Field getField(int _x, int _y) {
        return zone.getField(_x, _y);
    }
    
    /**
     * Method to get the current Player
     * @return A Player
     * @see Player
     */
    public Player getCurrent() {
        return current;
    }
    
    /**
     * Method to set the current player.
     * Used mainly by the nextPlayer method.
     * @param _current A Reference to the player that should be the current player.
     */
    private void setCurrent(Player _current) {
        current = _current;
    }
    
    
    /**
     * Method to play the pawn at the specified location.
     * @param _x X position of the pawn
     * @param _y Y position of the pawn
     */
    public void playPawn(int _x, int _y) {
        Pawn pawn = getPawn(_x, _y);
        
        if (pawn.isEmpty()) {
            pawn.setColor(getCurrent().getColor());
            nextPlayer();
        }
    }
    
    /**
     * Method to "Search what to put here"
     */
    public void nextPlayer() {
        if (getCurrent() == player[1]) {
            setCurrent(player[0]);
        } else
            setCurrent(player[1]);
    }
    
    /**
     * Test of Game Class, and a little use of the ConsoleUI Class to print it.
     */
    public static void main(String[] args) {
        ConsoleUI.print(">> Test of Game Class <<");
        
        ConsoleUI.print(">> We create a new Game <<");
        
        Game test = new Game();
        
        ConsoleUI.print(">> We draw it with the draw() method of the ConsoleUI class <<");
        
        ConsoleUI.draw(test);
        
        ConsoleUI.print(">> We play the pawn at the location 5,3 <<");
        
        test.playPawn(5, 3);
        
        ConsoleUI.print(">> We redraw the game <<");
        
        ConsoleUI.draw(test);
    }
    
}
