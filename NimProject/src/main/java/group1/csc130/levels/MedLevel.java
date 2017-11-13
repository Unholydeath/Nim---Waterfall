package group1.csc130.levels;

import java.util.ArrayList;
import java.util.List;

/**
 * MedLevel is a child class of Level. It has 3 lists of characters that symbolize rows of a game board.
 * It implements methods from Level: removeBeads(int row, int beads) to remove a number of characters from the given list,
 * printBoard() to print the lists to the console, getNumRows() to return the number of lists, getBeadAmount(int row)
 * to return the number of beads in the given row, and winCheck() to determine if all the rows are empty.
 * 
 * @author Braden Bodily, Tina Moore, Isaiah Camara
 *
 */
public class MedLevel extends Level {
	
	/**
	 * Instantiates m_row1, m_row2, and m_row3 by calling their setters with a desired number of characters
	 */
	public MedLevel(){
        setRow1(2);
        setRow2(5);
        setRow3(7);
    }
	 private List<Character> m_row1 = new ArrayList<>();
	 private List<Character> m_row2 = new ArrayList<>();
	 private List<Character> m_row3 = new ArrayList<>();

	/**
	 * Returns the List<Character> m_row1
	 * @return List<Character> m_row1
	 */
    public List<Character> getRow1() {
        return m_row1;
    }

    /**
	 * Adds a number of '*' characters to m_row1, representing beads based on the number of beads given
	 * @param int beads - number of characters to add to m_row1
	 */
    public void setRow1(int beads) {
        for (int i = 0; i < beads; i++) {
            this.m_row1.add('*');
        }
    }

    /**
	 * Returns the List<Character> m_row2
	 * @return List<Character> m_row2;
	 */
    public List<Character> getRow2() {
        return m_row2;
    }

    /**
	 * Adds a number of '*' characters to m_row2, representing beads based on the number of beads given
	 * @param int beads - number of characters to add to m_row2
	 */
    public void setRow2(int beads) {
        for (int i = 0; i < beads; i++) {
            this.m_row2.add('*');
        }
    }

    /**
	 * Returns the List<Character> m_row3
	 * @return List<Character> m_row3;
	 */
    public List<Character> getRow3() {
        return m_row3;
    }

    /**
	 * Adds a number of '*' characters to m_row3, representing beads based on the number of beads given
	 * @param int beads - number of characters to add to m_row3
	 */
    public void setRow3(int beads) {
        for (int i = 0; i < beads; i++) {
            this.m_row3.add('*');
        }
    }
    
    /**
	 * Prints a visual representation of List<Character> m_row1, List<Character> m_row2, List<Character> m_row3 to the console
	 */
    @Override
    public void PrintBoard(){
        System.out.println("1 - " + this.getRow1());
        System.out.println("2 - " + this.getRow2());
        System.out.println("3 - " + this.getRow3());
    }
    
    /**
	 * Returns the number of List<Character> rows
	 * @return int - number of rows
	 */
    @Override
    public int getNumRows(){
        return 3;
    }

    /**
	 * Returns the size of the list requested, using a switch statement
	 * @param int row - number of requested List<Character>
	 */
    @Override
    public int getBeadAmount(int row){

    	switch(row){
    	case 1:
    		return m_row1.size();
    	case 2:
    		return m_row2.size();
    	case 3:
    		return m_row3.size();
    	default:
    		return 0;
    	}	
    }
    
    /**
     * Removes a number of beads (int numBeads) from the requested List<Character> (row)
     * @param int row - number of request List<Character>
     * @param int numBeads - number of characters to remove
     */
    @Override
    public void removeBeads(int row, int numBeads){
    	
    	switch(row){
    	case 1:
    		for(int i = 0; i < numBeads; i++){
    			m_row1.remove(0);
    		}
    		break;
    	case 2:
    		for(int i = 0; i < numBeads; i++){
    			m_row2.remove(0);
    		}
    		break;
    	case 3:
    		for(int i = 0; i < numBeads; i++){
    			m_row3.remove(0);
    		}
    		break;
    	}
    }
    
    /**
     * Returns true if m_row1, m_row2, and m_row3 are empty, otherwise returns false
     * @return boolean hasWon - if the lists m_row1, m_row2, and m_row3 are empty
     */
    @Override
    public boolean WinCheck(){
    	boolean hasWon = false;
    	
    	if(m_row1.size() == 0 && m_row2.size() == 0 && m_row3.size() == 0){
    		hasWon = true;
    	}    	
    	return hasWon;
    }
}
