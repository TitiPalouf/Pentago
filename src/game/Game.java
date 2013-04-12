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
    Zone zone = null;

    /**
     * Array of Players, contains the Players.
     */
    Player[] player = null;

    /**
     * Current Player, contains a reference to the current Player
     */
    Player current = null;

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
    public Game(Options options) {
        int nbPlayers = 2;

        zone = new Zone();

        player = new Player[nbPlayers];

        for (int i = 0; i < nbPlayers; i++)
            player[i] = new Player();

        current = player[0];
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

                if (getPawn(j, i).owner + 1 < 10)
                    ret += "|     " + (getPawn(j, i).owner + 1) + " |";
                else
                    ret += "|     " + (getPawn(j, i).owner + 1) + " |";
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
            pawn.setOwner(current.getNumber());
            nextPlayer();
        }
    }

    public void nextPlayer() {
        int nbPlayers = 2;

        if (current.getNumber() == nbPlayers) {
            current = player[0];
        } else
            current = player[current.getNumber() + 1];
    }

    /**
     * Unitary Test of Game Class
     */
    public static void main(String[] args) {
        System.out.println("Test of Game Class");

        Options opt = new Options();

        Game test = new Game(opt);

        System.out.println(test.toString());

        test.play(5, 3);

        System.out.println(test.toString());
    }

}
