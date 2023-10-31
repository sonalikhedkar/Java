import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1. Add new team\n 2. display all teams\n");
		System.out.println("3. search team by captain\n 4. exit\nchoice : ");
		 choice=sc.nextInt();
		switch(choice) {
		    case 1:
		    	TeamServices.AddNewTeam();
		    	break;
		    case 2:
		    	TeamServices.DisplayAllTeams();
		    	break;
		    case 3:
		    	break;
		    default :
		    	System.out.println("Wrong choice");
		}
		
		}while(choice!=4);
	}

}
