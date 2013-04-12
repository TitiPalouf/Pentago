package game;

/**
 * Class Player
 * 
 */
public class Player {
    /**
     * Name of the Player
     */
    protected String name = null;
    protected static int number;

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param _name
     */
    public void setName(String _name) {
        name = _name;
    }

    /**
     * Get the number of the player
     * 
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set the number of the player
     * 
     * @param _number
     */
    public void setNumber(int _number) {
        number = _number;
    }

    /**
     * Player Constructor, initialize the name to a random name between
     * Stallman, Chewbacca, Someone, or many others
     * 
     * @param _number
     *            The number of the player
     */
    public Player() {
        double n = (Math.random() * 10);

        switch ((int) n) {
        case 0:
            name = new String("Stallman");
            break;
        case 1:
            name = new String("Chewbacca");
            break;
        case 2:
            name = new String("Someone");
            break;
        case 3:
            name = new String("Un Canard");
            break;
        case 4:
            name = new String("Obi-Wan Kenobi");
            break;
        case 5:
            name = new String("Chuck Norris");
            break;
        default:
            name = new String("Anonymous");
            break;
        }

        number++;
    }

    /**
     * Test of the Player Class
     * 
     * @param args
     *            Main Arguments
     */
    public static void main(String[] args) {
        Player[] test = new Player[5];

        for (int i = 0; i < 5; i++) {
            test[i] = new Player();
            System.out.println(test[i].getName());
            System.out.println(test[i].getNumber());
        }
    }
}
