package group1.csc130.levels;
/**
 *@abstract
 * The level class is responsible for the game board. The level class is an
 * abstract class that gives Easy, Medium, and Hard their list of functions.
 * Level contains a turnChoice function, which removes characters from a list
 * of characters owned by the implementing classes, a printBoard function,
 * which prints a visual representation of the character lists owned by the
 * implementing classes, a winCheck function to see if all the character lists in
 * the level are empty, and a isValidInput function that validates the row
 * number and bead amount. There are two functions, getNumRows and
 * getBeadAmount to share the row and bead integers.
 **/

public abstract class Level {
	/**
	 *The printBoard method gets the current state of the level and prints it out.
	 *Prints the current row amount and how many beads are in those rows
	 */

	public void PrintBoard(){
    }
	/**
	 *  The turnChoice method takes in two ints and uses those to choose the row
	 *  they want to remove the beads from and how many beads they want to
	 *  remove. Checks if the input the user gave is valid if so it continues and
	 *  removes the beads from the row and if it isn’t valid it asks them for more input.
	 *
	 *@pram int row- the row they want to remove the beads from
	 *
	 *@pram int beadAmount- the number of beads they want to remove
	 */

	public boolean turnChoice(int row, int numBeads){
		
		boolean result = false;
		
		return result;
	}
	/**
	 *The wincheck method checks if the player removed the last bead from the last row in the game and if so they lose
	 *@return boolean- true if there is a loser, false if the game contiunes
	 */

	public boolean WinCheck(){return false;}
	/**
	 *The getBeadAmount gets the size of the list passed to it and retruns the int of the bead amount
	 *@return int- the amount of beads in the list
	 *@pram int rowChoice- The row they want to remove beads from
	 */

	public int getBeadAmount(int row){
		
		int beads = 0;
		
		return beads;
	}

	/**
	 * Gets the number of rows in the level
	 * @return the number of rows in the level
	 */
	public int getNumRows() {
		return 0;
	}

	/**
	 * The removeBeads method removes the beads from the list
     * in the level
	 * @param row - the row they want to remove the beads from
	 * @param numBeads - the number of beads they want to remove
	 */
	public void removeBeads(int row, int numBeads){}
}
