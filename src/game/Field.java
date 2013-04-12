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

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                pawn[i][j] = new Pawn();
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
        switch (dir) {
        case right:
            // Do a Right Barrel Roll!
            break;
        case left:
            // Do a Left Barrel Roll!
            break;
        default:
            throw new MyException("Haha lol");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Field test = new Field();

        System.out.println(test.getPawn(5, 2).getOwner());

        test.barrelRoll(Direction.right);

        System.out.println(test.getPawn(5, 2).getOwner());
    }

}
