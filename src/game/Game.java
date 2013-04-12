package game;

import core.Options;

/**
 * Game Class, contains Game Elements, such as Zone, and Players
 * 
 */
public class Game {

    /**
     * Zone, contains the Fields and the Pawns.
     */
    protected Zone zone = null;

    /**
     * Array of Players, contains the Players.
     */
    protected Player[] player = null;

    /**
     * Current Player, contains a reference to the current Player
     */
    protected Player current = null;

    /**
     * Constructor of Game Class. Do the following :
     * <ul>
     * <li>Initialize the Zone.</li>
     * <li>Initialize the Players.</li>
     * </ul>
     * 
     * @param options
     *            Options of the Game, to initialize members with right numbers.
     */
    public Game() {
        zone = new Zone();

        player = new Player[2];

        player[0] = new Player(Color.red);
        
        player[1] = new Player(Color.blue);

        current = player[0];
    }

    public void clear() {
        zone.clear();
    }

    public Pawn getPawn(int _i, int _j) {
        return zone.getField(_i, _j).getPawn(_i, _j);
    }

    @Override
    public String toString() {

        int nbPawns = 3;
        int nbFields = 2;
        int maxPawns = 6;
        String ret = new String();

        ret += "Current Player : " + current.getName() + System.lineSeparator();

        ret += "Player Color : " + current.getColor();

        ret += System.lineSeparator();

        ret += "               ";

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

        ret += System.lineSeparator();

        ret += "             ";

        for (int i = 0; i < nbFields; i++) {
            for (int j = 0; j < nbPawns; j++) {
                ret += "---------";
            }
            if (i != nbFields - 1)
                ret += "-  -";
        }

        ret += System.lineSeparator();

        for (int i = 0; i < maxPawns; i++) {
            if (i < 10)
                ret += "Line   " + i + " : ";
            else if (i < 100)
                ret += "Line  " + i + " : ";
            else
                ret += "Line " + i + " : ";

            ret += "  |";

            for (int j = 0; j < maxPawns; j++) {
                if (j % nbPawns == 0 && j != 0)
                    ret += "  ";

                switch (getPawn(j, i).getColor()) {
                case red:
                    ret += "|  " + getPawn(j, i).getColor() + "  |";
                    break;
                case blue:
                    ret += "|  " + getPawn(j, i).getColor() + " |";
                    break;
                case green:
                    ret += "| " + getPawn(j, i).getColor() + " |";
                    break;
                case empty:
                    ret += "| " + getPawn(j, i).getColor() + " |";
                    break;
                }
            }

            ret += "|";

            ret += System.lineSeparator();

            ret += "             ";

            for (int k = 0; k < nbFields; k++) {
                for (int l = 0; l < nbPawns; l++) {
                    ret += "---------";
                }
                if (k != nbFields - 1)
                    ret += "-  -";
            }

            ret += System.lineSeparator();

            if ((i + 1) % nbPawns == 0 && i != 0 && i != maxPawns - 1) {
                ret += System.lineSeparator();

                ret += "             ";

                for (int k = 0; k < nbFields; k++) {
                    for (int l = 0; l < nbPawns; l++) {
                        ret += "---------";
                    }
                    if (k != nbFields - 1)
                        ret += "-  -";
                }
                ret += System.lineSeparator();
            }
        }

        ret += System.lineSeparator();

        return ret;
    }

    void play(int _i, int _j) {
        Pawn pawn = getPawn(_i, _j);

        if (pawn.isEmpty()) {
            pawn.setColor(current.getColor());
            nextPlayer();
        }
    }

    public void nextPlayer() {
        if (current == player[1]) {
            current = player[0];
        } else
            current = player[1];
    }

    /**
     * Unitary Test of Game Class
     */
    public static void main(String[] args) {
        System.out.println("Test of Game Class");

        Game test = new Game();

        System.out.println(test.toString());

        test.play(5, 3);

        System.out.println(test.toString());
    }

}
