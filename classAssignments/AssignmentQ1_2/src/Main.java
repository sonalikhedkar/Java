import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[]sts=new Student[2];
		for(int i=0;i<2;i++) {
			System.out.println("Enter id of Student "+(i+1)+":");
			int id=sc.nextInt();
			System.out.println("Enter Name of Student "+(i+1)+":");
			String name=sc.next();
			System.out.println("Enter marks1 of Student "+(i+1)+":");
			int m1=sc.nextInt();
			System.out.println("Enter marks2 of Student "+(i+1)+":");
			int m2=sc.nextInt();
			System.out.println("Enter marks3 of Student "+(i+1)+":");
			int m3=sc.nextInt();
			sts[i]=new Student(id,name,m1,m2,m3);
		}
		System.out.println(sts[0]);
		System.out.println(sts[1]);

	}

}
