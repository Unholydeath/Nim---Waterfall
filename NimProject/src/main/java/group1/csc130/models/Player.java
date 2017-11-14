package group1.csc130.models;

/**
 * The Player class hold the data associated with a single player
 * The player has a name, PlayerType, and can make bead or row choices if they're a computer
 * 
 * @author Braden Bodily, Tina Moore, Isaiah Camara
 */

public class Player {

	public enum PlayerType{
		PLAYER,
		COMPUTER
	}
	
    private String m_name;
    private PlayerType m_type;
	
    /**
     * Instantiates player and sets the PlayerType to PLAYER
     */
	public Player(){
		setType(PlayerType.PLAYER);	
	}
	
	/**
	 * Sets m_name to the given string
	 * @param String newName - Name of the player
	 */
	public Player(String newName){
		setName(newName);
	}

	/**
	 * Returns the String m_name
	 * @return String m_name - Name of the player 
	 */
    public String getName() {
        return m_name;
    }

    /**
     * Sets m_name to a given String
     * @param String name - String that'll become the new name
     */
    public void setName(String name) {
        m_name = name;
    }

    /**
     * Returns the player's PlayerType
     * @return PlayerType m_type - Type of the player
     */
	public PlayerType getType() {
		return m_type;
	}

	/**
	 * Set m_type to the given PlayerType given
	 * @param PlayerType m_type - PlayerType to set m_type to
	 */
	public void setType(PlayerType m_type) {
		this.m_type = m_type;
	}
	
	/**
	 * Give a maximum number of rows and receive a row chosen at random
	 * @param int numRows - Max number of rows, to be used for Computer's random generator
	 * @return int selectedRow - Number of selected row
	 */
	public int makeRowChoice(int numRows){ return 0;}
	
	
	/**
	 * Give a maximum number of beads and receive a number of beads chosen at random
	 * @param maxBeads - Max number of beads in a predetermined row
	 * @return int numBeads - Number of beads selected
	 */
	public int makeBeadChoice(int maxBeads){ return 0;}
}
