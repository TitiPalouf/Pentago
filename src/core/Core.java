package core;

import game.*;
import consoleui.*;

/**
 * Core Class, contains the game, the ui, and options
 * 
 * @author François
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

		game = new Game(options);
	}

	/**
	 * @param args Arguments, self-explanatory
	 */
	public static void main(String[] args) {
		Core core = new Core();
		
		core.ui.start(core.game);
	}

}
