package group1.csc130.levels;

public abstract class Level {
	public void PrintBoard(){
    }
	
	public boolean turnChoice(int row, int numBeads){
		
		boolean result = false;
		
		return result;
	}
	
	public boolean WinCheck(){return false;}
	
	public int getBeadAmount(int row){
		
		int beads = 0;
		
		return beads;
	}

	public int getNumRows() {
		return 0;
	}

	public void removeBeads(int row, int numBeads){}
}
