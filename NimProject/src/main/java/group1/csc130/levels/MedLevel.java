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
        super.setNumRows(3);
    }
	 private List<Character> m_row1 = new ArrayList<>();

	 private List<Character> m_row2 = new ArrayList<>();

	 private List<Character> m_row3 = new ArrayList<>();

    public List<Character> getM_row1() {
        return m_row1;
    }

    public void setM_row1(int beads) {
        for (int i = 0; i < beads; i++) {
            this.m_row1.add('*');
        }
    }

    public List<Character> getM_row2() {
        return m_row2;
    }

    public void setM_row2(List<Character> m_row2) {
        this.m_row2 = m_row2;
    }

    public List<Character> getM_row3() {
        return m_row3;
    }

    public void setM_row3(List<Character> m_row3) {
        this.m_row3 = m_row3;
    }
}
