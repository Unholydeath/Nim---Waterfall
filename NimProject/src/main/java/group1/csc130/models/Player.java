package group1.csc130.models;
public class Player {

	public enum PlayerType{
		PLAYER,
		COMPUTER
	}
	
    private String m_name;
    private PlayerType m_type;
	
	public Player(){
		setType(PlayerType.PLAYER);	
	}
	
	public Player(String newName){
		setName(newName);
	}

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

	public PlayerType getType() {
		return m_type;
	}

	public void setType(PlayerType m_type) {
		this.m_type = m_type;
	}
	
	public int makeRowChoice(int numRows){ return 0;}
	
	public int makeBeadChoice(int maxBeads){ return 0;}
}
