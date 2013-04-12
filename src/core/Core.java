package core;

import game.*;
import consoleui.*;

/**
 * Core Class, contains the game, the ui, and options
 * 
 * @author Soinou
 * 
 */
public class Core {
    
	/**
	 * Game, contains all the game : players and zone
	 */
	Game game;
	
	/**
	 * Options, contains options of the game, like number of players, etc
	 */
	Options options;
	
	/**
	 * Interface, contains the ui of the game, Console or Graphic, depends on
	 * the user choice
	 */
	Interface ui;

	/**
	 * Constructor of Core Class
	 */
	public Core() {
		ui = new Interface(false);

		options = new Options();

		game = new Game();
	}
	
	public void playPawn(int _x, int _y) {
	    game.playPawn(_x, _y);	    
	}
	
	public void barrelRoll(int _x, int _y, Direction dir) {
	    game.getField(_x, _y).barrelRoll(dir);
	}
	public void start() {
	    
	}

	/**
	 * @param args Arguments, self-explanatory
	 */
	public static void main(String[] args) {
	    //Create the Core
		Core core = new Core();
		
		//Launch the core
		core.start();
	}

}
