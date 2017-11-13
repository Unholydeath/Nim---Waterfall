package group1.csc130.levels;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Unholydeath
 * @author Isaiah Camara
 */

public class HardLevel extends Level {
	
	private List<Character> m_row1 = new ArrayList<>();
	private List<Character> m_row2 = new ArrayList<>();
	private List<Character> m_row3 = new ArrayList<>();
	private List<Character> m_row4 = new ArrayList<>();
	
	public HardLevel(){
        setM_row1(2);
        setM_row2(3);
        setM_row3(8);
        setM_row4(9);
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
    @Override
    public void PrintBoard(){
        System.out.println(this.getM_row1());
        System.out.println(this.getM_row2());
        System.out.println(this.getM_row3());
        System.out.println(this.getM_row4());
    }

    @Override
    public int getNumRows(){
        return 4;
    }

    @Override
    public int getBeadAmount(int row){
		int heaps = 0 ;
            switch (row) {
                case 1:
                    heaps = m_row1.size();
                    break;
                case 2:
                    heaps = m_row2.size();
                    break;
                case 3:
                    heaps = m_row3.size();
                    break;
                case 4:
                    heaps = m_row4.size();
                    break;
            }
        return heaps;
    }

    @Override
    public boolean turnChoice(int row, int numbeads){

    }
	
}
