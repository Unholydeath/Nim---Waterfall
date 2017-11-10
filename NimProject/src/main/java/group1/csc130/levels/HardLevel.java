package group1.csc130.levels;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Unholydeath
 *
 */

public class HardLevel extends Level {
	
	private List<Character> m_row1 = new ArrayList<>();
	private List<Character> m_row2 = new ArrayList<>();
	private List<Character> m_row3 = new ArrayList<>();
	private List<Character> m_row4 = new ArrayList<>();
	
	public HardLevel(){
        super.setNumRows(4);
	}

	public List<Character> getM_row1() {
		return m_row1;
	}

	public void setM_row1(int beads) {
		for (int i = 0; i < beads; i++){
			m_row1.add('*');
		}
	}

	public List<Character> getM_row2() {
		return m_row2;
	}

	public void setM_row2(int beads) {
		for (int i = 0; i < beads; i++){
			m_row2.add('*');
		}
	}

	public List<Character> getM_row3() {
		return m_row3;
	}

	public void setM_row3(int beads) {
		for (int i = 0; i < beads; i++){
			m_row1.add('*');
		}
	}

	public List<Character> getM_row4() {
		return m_row4;
	}

	public void setM_row4(int beads) {
		for (int i = 0; i < beads; i++){
			m_row1.add('*');
		}
	}
	
}
