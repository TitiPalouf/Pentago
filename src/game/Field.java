
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
    public Field() {
        
        pawn = new Pawn[3][3];
        clear();
    }
    
    public void clear() {
        
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                pawn[i][j] = new Pawn(Color.empty);
    }
    
    /**
     * @param _i
     * @param _j
     * @return
     */
    public Pawn getPawn(int _i, int _j) {
        
        return pawn[_i % 3][_j % 3];
    }
    
    /**
     * @param dir
     */
    public void barrelRoll(Direction dir) {
        
        Pawn tmpPawn;
        
        switch (dir) {
            case right:
                tmpPawn = pawn[0][0];
                
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
                tmpPawn = pawn[0][0];
                
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
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println(">> Test of Field Class");
        
        System.out.println("");
        
        System.out.println(">> We create a new Field");
        
        System.out.println("");
        
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
        
        System.out.println("");
        
        System.out.println(">> BarrelRoll to the right of the Field");
        
        System.out.println("");
        
        test.barrelRoll(Direction.right);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + test.getPawn(j, i).getColor() + " ");
            }
            System.out.println("");
        }
    }
    
}
