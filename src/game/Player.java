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
    protected Color color;
    
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
    public Color getColor() {
        return color;
    }
    
    /**
     * Set the number of the player
     * 
     * @param _number
     */
    public void setColor(Color _color) {
        color = _color;
    }
    
    /**
     * Player Constructor, initialize the name to a random name between
     * Stallman, Chewbacca, Someone, or many others
     * 
     * @param _number
     *            The number of the player
     */
    public Player(Color _color) {
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
        
        color = _color;
    }
    
    /**
     * Test of the Player Class
     * 
     * @param args
     *            Main Arguments
     */
    public static void main(String[] args) {
        Player[] test = new Player[2];
        
        test[0] = new Player(Color.red);
        System.out.println(test[0].getName());
        System.out.println(test[0].getColor());
        
        test[1] = new Player(Color.blue);
        System.out.println(test[0].getName());
        System.out.println(test[0].getColor());
    }
}
