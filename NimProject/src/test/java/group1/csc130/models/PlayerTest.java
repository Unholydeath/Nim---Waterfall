package group1.csc130.models;

import static org.junit.Assert.*;

import org.junit.Test;

import group1.csc130.models.Player.PlayerType;

/**
 * Contains the testing methods of the Player class
 * 
 * @author Unholydeath
 *
 */

public class PlayerTest {
	
	/**
	 * Tests whether the initial PlayerType of Player is PLAYER when instantiated
	 */
	@Test
	public void TestPlayerIntialType(){
		Player player = new Player();
		assertTrue(player.getType() == PlayerType.PLAYER);
	}
	
	/**
	 * Tests whether the setType() function of Player can change the PlayerType of the Player
	 */
	@Test
	public void TestPlayerSetPlayerType(){
		Player player = new Player();
		player.setType(PlayerType.COMPUTER);
		assertTrue(player.getType() == PlayerType.COMPUTER);
	}
	
	/**
	 * Tests whether the setType() function of Player can be called multipul times and hold the final desired type of PlayerType
	 */
	@Test
	public void TestPlayerSetPlayerTypeTwice(){
		Player player = new Player();
		player.setType(PlayerType.COMPUTER);
		player.setType(PlayerType.PLAYER);
		assertTrue(player.getType() == PlayerType.PLAYER);
	}
	
	/**
	 * Player's name isn't instantiated when the class is, so the name should return null
	 */
    @Test
    public void TestInitialNameOfPlayer() {
    	Player player = new Player();
    	assertTrue(player.getName() == null);
    }
    
    /**
     * Tests if the setName function actually changes the Player's name
     */
    @Test
    public void TestSetNameOfPlayer(){
    	Player player = new Player();
    	player.setName("BillyBob");
    	assertTrue(player.getName().compareTo("BillyBob") == 0);
    }
    
    /**
     * Tests if the setName function changes the name properly multipul times
     */
    @Test
    public void TestSetNameOfPlayerTwice(){
    	Player player = new Player();
    	player.setName("Steve");
    	player.setName("Joe");
    	assertTrue(player.getName().compareTo("Joe") == 0);
    }
}