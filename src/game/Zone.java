package game;

import core.Options;

/**
 * Zone Class
 * 
 */
public class Zone {
    /**
     * Fields in the Zone
     */
    protected Field field[][];

    /**
     * Constructor of Zone Class
     */
    public Zone() {
        int nbFields = 2;

        field = new Field[nbFields][nbFields];

        for (int i = 0; i < nbFields; i++)
            for (int j = 0; j < nbFields; j++)
                field[i][j] = new Field();
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
