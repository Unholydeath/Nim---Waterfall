package group1.csc130.models;
public class Player {

    private String m_name;
	
	public Player(){}
	
	public Player(String newName){
		setName(newName);
	}

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

}
