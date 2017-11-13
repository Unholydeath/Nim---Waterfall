package group1.csc130.app;

/**
 * 
 * @author Unholydeath
 *
 */
public class Main {
	
    public static void main(String[] args) {

    	boolean keepPlaying = true;
    	
    	while(keepPlaying){
    		Game game = new Game();
            keepPlaying = game.run();
    	}
    }
}
