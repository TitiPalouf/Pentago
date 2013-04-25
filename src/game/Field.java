package game;

/**
 * @author Someone
 * 
 */
public class Field {
    
    /**
     * 
     */
    protected Pawn[][] pawn;
    
    /**
     * 
     */
    public Field(Options options) {
        int nbrPawns = options.getNbPawns();
        pawn = new Pawn[nbrPawns][nbrPawns];
        clear();
    }
    
    
    /**
     * 
     */
    public Field() {
        
        pawn = new Pawn[3][3];
        clear();
    }
    
    /**
     * Clear the current Field
     */
    public void clear() {
        
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                pawn[i][j] = new Pawn(Color.empty);
    }
    
    /**
     * @param _i
     * @param _j
     * @return The pawn what else?
     */
    public Pawn getPawn(int _i, int _j) {
        
        return pawn[_i % 3][_j % 3];
    }
    
    /**
     * Do a barrel roll on this field
     * @param dir
     *      The direction of the barrel roll
     */
    public void barrelRoll(Direction dir) {
        
        Pawn tmpPawn = pawn[0][0];
        
        switch (dir) {
            case right:
                pawn[0][0] = pawn[0][2];
                pawn[0][2] = pawn[2][2];
                pawn[2][2] = pawn[2][0];
                
                pawn[2][0] = tmpPawn;
                
                tmpPawn = pawn[1][0];
                
                pawn[1][0] = pawn[0][1];
                pawn[0][1] = pawn[1][2];
                pawn[1][2] = pawn[2][1];
                
                pawn[2][1] = tmpPawn;
                break;
            case left:
                pawn[0][0] = pawn[2][0];
                pawn[2][0] = pawn[2][2];
                pawn[2][2] = pawn[0][2];
                
                pawn[0][2] = tmpPawn;
                
                tmpPawn = pawn[1][0];
                
                pawn[1][0] = pawn[2][0];
                pawn[2][0] = pawn[2][2];
                pawn[2][2] = pawn[0][2];
                
                pawn[0][2] = tmpPawn;
                break;
            default:
                throw new MyException("Haha lol");
                break;
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println(">> Test of Field Class\n");
        
        System.out.println(">> We create a new Field\n");
        
        Field test = new Field();
        
        test.getPawn(3, 2).setColor(Color.red);
        test.getPawn(4, 2).setColor(Color.red);
        test.getPawn(5, 2).setColor(Color.red);
        test.getPawn(2, 2).setColor(Color.red);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + test.getPawn(j, i).getColor() + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\n>> BarrelRoll to the right of the Field\n");
        
        test.barrelRoll(Direction.right);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + test.getPawn(j, i).getColor() + " ");
            }
            System.out.println("");
        }
    }
    
}
