package group1.csc130.app;

/**
 * 
 * @author Unholydeath
 *
 */
public class Main {
	
    public static void main(String[] args) {

    	Game game = new Game();
    	
    	while(game.Run()){
    		game = new Game();
    	}
    }
}
