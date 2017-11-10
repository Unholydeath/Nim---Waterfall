package group1.csc130.models;
public class Player {



    private String m_name;
	
	public Player(){}
	
	public Player(String newName){
		setM_name(newName);
	}

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

}
