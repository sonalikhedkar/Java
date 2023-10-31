import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int choice;
     do {
    	 System.out.println("Enter 1 for Print table of number\n 2:For Display pattern\n 3: for prime Number\n4: exit");
    	 choice=sc.nextInt();
    	 switch(choice) {
    	 case 1:
    		 //for table of Number
    		 TableOfNumber.Table();
    		 break;
    	 case 2:
    		 //for pattern
    		 PatternDiamond.Pattern();
    		 break;
    	 case 3:
    		 PrimeNumber.Prime();
    	 }
     }while(choice!=4);
    
	}

}
