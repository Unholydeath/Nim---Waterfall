package group1.csc130.levels;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Unholydeath
 * @author Isaiah Camara
 */
public class EasyLevel extends Level {
	
	private List<Character> m_row1;
	private List<Character> m_row2;
	
	public EasyLevel(){
		
		m_row1 = new ArrayList<>();
		m_row2 = new ArrayList<>();
	}

	public List<Character> getM_row1() {
		return m_row1;
	}

	public void setM_row1(int beads) {
		for(int i = 0; i < beads; i++){
			m_row1.add('*');
		}
	}

	public List<Character> getM_row2() {
		return m_row2;
	}

	public void setM_row2(int beads) {
		for(int i = 0; i < beads; i++){
			m_row2.add('*');
		}
	}

	@Override
	public int getNumRows(){
		return 2;
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
		}
		return heaps;
	}

	@Override
	public boolean turnChoice(int row, int numbeads){

	}
}
