package group1.csc130.app;

/**
 * the main class runs the implemented Game's
 * run method in a while loop until the player
 * doesn't want to play any more
 */
public class Main {
    /**
     * Main method for the game that runs the Game
     * until the player doesn't want to play any more.
     * @param args
     */
    public static void main(String[] args) {

		boolean keepPlaying = true;

		while(keepPlaying){
		Game game = new Game();
		keepPlaying = game.run();
		}
	}
}
