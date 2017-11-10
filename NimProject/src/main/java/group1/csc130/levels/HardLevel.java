package group1.csc130.levels;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Unholydeath
 *
 */

public class HardLevel extends Level {
	public HardLevel(){
        super.setNumRows(4);
    }
	private List<Character> m_row1 = new ArrayList<>();// 2 beads
	private List<Character> m_row2 = new ArrayList<>();// 3 beads
	 private List<Character> m_row3 = new ArrayList<>();// 7 beads
	 private List<Character> m_row4 = new ArrayList<>();// 8 beads
}
