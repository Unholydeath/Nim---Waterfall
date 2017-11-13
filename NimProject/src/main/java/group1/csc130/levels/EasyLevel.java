package group1.csc130.levels;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Unholydeath
 *
 */
public class EasyLevel extends Level {
	
	private List<Character> m_row1 = new ArrayList<>();
	private List<Character> m_row2 = new ArrayList<>();
	
	public EasyLevel(){
		setRow1(3);
		setRow2(3);
	}

	public List<Character> getRow1() {
		return m_row1;
	}

	public void setRow1(int beads) {
		for(int i = 0; i < beads; i++){
			m_row1.add('*');
		}
	}

	public List<Character> getRow2() {
		return m_row2;
	}

	public void setRow2(int beads) {
		for(int i = 0; i < beads; i++){
			m_row2.add('*');
		}
	}
	
	@Override
	public void PrintBoard(){
        System.out.println("1 - " + this.getRow1());
        System.out.println("2 - " + this.getRow2());
    }
	
	@Override
    public int getNumRows(){
        return 2;
    }

    @Override
    public int getBeadAmount(int row){

    	switch(row){
    	case 1:
    		return m_row1.size();
    	case 2:
    		return m_row2.size();
    	default:
    		return 0;
    	}	
    }
    
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
    	}
    }
    
    @Override
    public boolean WinCheck(){
    	boolean hasWon = false;
    	
    	if(m_row1.size() == 0 && m_row2.size() == 0){
    		hasWon = true;
    	}    	
    	return hasWon;
    }
}
