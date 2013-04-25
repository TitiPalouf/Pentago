package game;


/**
 * Zone Class
 * 
 */
public class Zone {
    /**
     * Fields in the Zone
     */
    protected Field field[][];
    int nbFields;
    
    /**
     * Constructor of Zone Class with options
     */
    public Zone(Options options) {
        this.nbrFields = getNbFields();
        field = new Field[nbFields][nbFields];
        
        for (int i = 0; i < nbFields; i++)
            for (int j = 0; j < nbFields; j++)
                field[i][j] = new Field(options);
    }
    
    /**
     * Constructor of Zone Class
     */
    public Zone() {
        this.nbrFields = 2;
        field = new Field[nbFields][nbFields];
        
        for (int i = 0; i < nbFields; i++)
            for (int j = 0; j < nbFields; j++)
                field[i][j] = new Field();
    }
    
    public void clear() {
        for (int i = 0; i < nbFields; i++)
            for (int j = 0; j < nbFields; j++)
                field[i][j].clear();
    }
    
    public Field getField(int _i, int _j) {
        return field[_i / 3][_j / 3];
    }
    
    /**
     * Test of Zone Class
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    }
    
}
