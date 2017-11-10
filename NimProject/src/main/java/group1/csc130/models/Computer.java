package group1.csc130.models;

import java.util.Random;

public class Computer extends Player {
	
	public int maxRowRange;
	public int maxBeadRange;
	
	private Random m_random;
	
	public Computer(){
		m_random = new Random();
	}
	
	public void chooseRow(int range){
		
		int rowChoice = m_random.nextInt(range) + 1;
	}
	
	public int chooseBeads(int range){
        int beadChoice;
	return beadChoice = m_random.nextInt(range) + 1;
	}

    public int getMaxRowRange() {
        return maxRowRange;
    }

    public void setMaxRowRange(int maxRowRange) {
        this.maxRowRange = maxRowRange;
    }

    public int getMaxBeadRange() {
        return maxBeadRange;
    }

    public void setMaxBeadRange(int maxBeadRange) {
        this.maxBeadRange = maxBeadRange;
    }
}
