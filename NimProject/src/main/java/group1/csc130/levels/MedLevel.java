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
        setRow1(2);
        setRow2(5);
        setRow3(7);
    }
	 private List<Character> m_row1 = new ArrayList<>();
	 private List<Character> m_row2 = new ArrayList<>();
	 private List<Character> m_row3 = new ArrayList<>();

    public List<Character> getRow1() {
        return m_row1;
    }

    public void setRow1(int beads) {
        for (int i = 0; i < beads; i++) {
            this.m_row1.add('*');
        }
    }

    public List<Character> getRow2() {
        return m_row2;
    }

    public void setRow2(int beads) {
        for (int i = 0; i < beads; i++) {
            this.m_row2.add('*');
        }
    }

    public List<Character> getRow3() {
        return m_row3;
    }

    public void setRow3(int beads) {
        for (int i = 0; i < beads; i++) {
            this.m_row3.add('*');
        }
    }
    @Override
    public void PrintBoard(){
        System.out.println("1 - " + this.getRow1());
        System.out.println("2 - " + this.getRow2());
        System.out.println("3 - " + this.getRow3());
    }
    
    @Override
    public int getNumRows(){
        return 3;
    }

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
    
    @Override
    public void removeBeads(int row, int numBeads){
    	
    	switch(row){
    	case 1:
    		for(int i = 0; i < numBeads; i++){
    			m_row1.remove('*');
    		}
    	case 2:
    		for(int i = 0; i < numBeads; i++){
    			m_row2.remove('*');
    		}
    	case 3:
    		for(int i = 0; i < numBeads; i++){
    			m_row3.remove('*');
    		}
    	}
    }
    
    @Override
    public boolean WinCheck(){
    	boolean hasWon = false;
    	
    	if(m_row1.size() == 0 && m_row2.size() == 0 && m_row3.size() == 0){
    		hasWon = true;
    	}    	
    	return hasWon;
    }
}
