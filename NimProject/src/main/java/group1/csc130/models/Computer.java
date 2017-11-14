package group1.csc130.models;

import java.util.Random;

public class Computer extends Player {
	
	private Random m_random;
	
	/**
	 * Instantiates a random object, sets the player's name to "Computer", and sets the PlayerType to COMPUTER
	 */
	public Computer(){
		m_random = new Random();
		setName("Computer");
		setType(PlayerType.COMPUTER);
	}
	
	/**
	 * Inherited from Player to allow access to the chooseRow(numRows) random generator.
	 * Chooses a random number between 1 and the number of rows given.
	 * @param int numRows - Maximum number of rows to pass to chooseRow(numRows)
	 * @return int chosenRow - Number of the chosen row
	 */
	@Override
	public int makeRowChoice(int numRows){
		return chooseRow(numRows);
	}
	
	/**
	 * Inherited from Player to allow access to the chooseBeads(maxBeads) random generator
	 * Chooses a random number between 1 and the number of beads given
	 * @param int maxBeads - Maximum number of beads to pass to chooseBeads(maxBeads)
	 * @return int chosenBeads - Number of beads chosen
	 */
	@Override
	public int makeBeadChoice(int maxBeads){
		return chooseBeads(maxBeads);
	}
	
	/**
	 * Selects a row from a randomly generated number based on the maximum number of rows available
	 * @param int range - Maximum range for the random generator
	 * @return int selectedRow - Returns the number from the random generator
	 */
	public int chooseRow(int range){
		return m_random.nextInt(range) + 1;
	}
	
	/**
	 * Returns a randomly generated number of beads based on the maximum number of beads avaiable
	 * @param int range - Maximum range for the random generator
	 * @return int selectedBeads - Returns the number from the random generator
	 */
	public int chooseBeads(int range){
        return m_random.nextInt(range) + 1;
	}
}
