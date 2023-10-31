import java.util.Arrays;

public class Team {
      private int teamno;
      private String teamname;
	   private Player captain;//object of Player class
	   private Player[] plist;//array of object of player class
	   
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team( int teamno,String teamname,Player captain,Player[] plist) {
		this.teamno=teamno;
		this.teamname=teamname;
		this.captain=captain;//here captain is object
		this.plist=plist;//here plist is array of object	
	}
	//Getter Methods
	public int getTeamno(){
		return teamno;
	}
	public String getTeamname() {
		return teamname;
	}
	public Player getCaptain() {
		return captain;
	}
	public Player[] getPlist() {
		return plist;
	}
	//setter methods
	public void setTeamno(int teamno) {
		this.teamno=teamno;
	}
	public void setTeamname(String teamname) {
		this.teamname=teamname;
	}
	public void setCaptain(Player captain) {
		this.captain=captain;
	}
	public void setPlist(Player[] plist) {
		this.plist=plist;
	}
	@Override
	public String toString() {
		return "Team [teamno=" + teamno + ", teamname=" + teamname + ", captain=" + captain + ", plist="
				+ Arrays.toString(plist) + "]";
	}
	
}
