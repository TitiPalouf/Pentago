package core;

import consoleui.ConsoleUI;
import graphicui.GraphicUI;
import game.Game;

public class Interface {
    GraphicUI gui = null;
    ConsoleUI cui = null;

    boolean closeRequested;
    boolean graphic;

    public Interface(boolean _graphic) {
        closeRequested = false;
        graphic = _graphic;

        if (graphic)
            gui = new GraphicUI();
        else
            cui = new ConsoleUI();
    }

    public void start(Game game) {
        if (graphic)
            gui.start(game);
        else
            cui.start(game);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Coucou Soinou");

    }

}
