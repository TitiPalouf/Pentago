package core;

/**
 * <b>Options</b> Class
 * 
 */
public class Options {
    /**
     * Number of Players
     */
    protected int nbPlayers;
    /**
     * Number of Fields
     */
    protected int nbFields;
    /**
     * Number of Pawns
     */
    protected int nbPawns;
    
    /**
     * Constructor of the class Options, initialize with basic game setup ( 2
     * players, 2 x 2 fields, 3 x 3 pawns per fields )
     * 
     */
    public Options() {
        nbPlayers = 2;
        nbFields = 2;
        nbPawns = 3;
    }
    
    /**
     * Initialize the options for the current Game ( Maybe remove it ? )
     * 
     */
    public void init() {
        
    }
    
    /**
     * get number of Players in the current Game
     * 
     * @return nbPlayers
     */
    public int getNbPlayers() {
        return nbPlayers;
    }
    
    /**
     * Set the number of Players in the current Game
     * 
     * @param nbPlayers
     */
    public void setNbPlayers(int nbPlayers) {
        this.nbPlayers = nbPlayers;
    }
    
    /**
     * Get Number of fields in the current Game
     * 
     * @return nbFields
     */
    public int getNbFields() {
        return nbFields;
    }
    
    /**
     * Set the number of fields in the current Game
     * 
     * @param nbFields
     */
    public void setNbFields(int nbFields) {
        this.nbFields = nbFields;
    }
    
    /**
     * Get Number of Pawns in the current Game
     * 
     * 
     * @return nbPawns
     */
    public int getNbPawns() {
        return nbPawns;
    }
    
    /**
     * Set Number of Pawns in the current Game
     * 
     * @param nbPawns
     */
    public void setNbPawns(int nbPawns) {
        this.nbPawns = nbPawns;
    }
    
    /**
     * Unitary Test of Options
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    }
    
}
