package group1.csc130.levels;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Unholydeath
 *
 */
public class MedLevel extends Level {
	public MedLevel(){
        super.setNumRows(2);
    }
	 private List<Character> m_row1 = new ArrayList<>();
	 private List<Character> m_row2 = new ArrayList<>();
	private List<Character> m_row3 = new ArrayList<>();
}
