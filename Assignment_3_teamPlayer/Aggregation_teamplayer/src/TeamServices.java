import java.util.Scanner;
public class TeamServices {
	static Team[] tarr;
	static int cnt;
	static {
		//arr=new int[10]
		 tarr= new Team[10];
		cnt=0;
	}
	///////////
//method for addnew team
	public static void AddNewTeam() {
		Scanner sc=new Scanner(System.in);
		//accept teamno from user
		System.out.println("enter team no: ");
		int tno=sc.nextInt();
		sc.nextLine();
		//accept team name from user
		System.out.println("enter team name: ");
		String tname=sc.nextLine();
		
		//accept captain details from user
		System.out.println("enter captain details: ");
		System.out.println("enter captain's player no: ");
		int pno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter captain name: ");
		String pname=sc.nextLine();
		sc.nextLine();
		System.out.println("enter captain skill: ");
		String skill=sc.next();
		// called to parameterized constructor of player class
		Player cap=new Player(pno,pname,skill);
		
		//accept other player details of team/plist
		Player[] plist=new Player[3];
		//loop to accept team members details
		for(int i=0;i<plist.length;i++) {
			System.out.println("player number");
			pno=sc.nextInt();
			sc.nextLine();
			System.out.println("enter player name");
			pname=sc.nextLine();
			
			System.out.println("enter skill");
			skill=sc.nextLine();
			//player parameterized for ith player
			plist[i]=new Player(pno,pname,skill);
		}
		//team parameterized constructor
		tarr[cnt]=new Team(tno,tname,cap,plist);
		cnt++;		
	}
	//////
	//method for display all teams
	public static void  DisplayAllTeams() {
		for(int i=0;i<cnt;i++) {
			System.out.println(tarr[i]);
		}
	}
}
