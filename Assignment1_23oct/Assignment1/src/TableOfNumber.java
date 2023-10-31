import java.util.Scanner;
public class TableOfNumber {
     public static void Table() {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter number: ");
    	 int num=sc.nextInt();
    	 
     for(int i=1;i<=10;i++) {
    	 System.out.println(i*num);
     }
    }
}
