
public class Player {
//Declare Data members
	private int pno;
	private String pname;
	private String skill;
	
	//default constructor
	public Player() {
		
	}
	//parameterized constructor
	public Player(int pno,String pname,String skill) {
		this.pno=pno;
		this.pname=pname;
		this.skill=skill;	
	}
	//getter methods
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	 
	public String getSkill() {
		return skill;
	}
	//setter methods
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	//toString method
	@Override
	public String toString() {
		return "Player [pno=" + pno + ", skill=" + skill + "]";
	}
	
}
