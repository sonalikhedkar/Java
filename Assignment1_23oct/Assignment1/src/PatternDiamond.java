

import java.util.Scanner;
public class PatternDiamond {

	
	
	public static void Pattern() {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The number of lines");
    int line =sc.nextInt();//for input like cin in cpp
    //first half
    int space =(int)(line/2);
    for(int i=1;i<=line;i=i+2) {
    	//sapces-
    	
    	for(int j=1;j<=space;j++) {
    		System.out.print(" ");
    	}
    	//stars
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    	space=space-1;
    }
    //second half
    space =1;
    for(int i=line-2;i>=1;i=i-2) {
    	//sapces
    	for(int j=0;j<space;j++) {
    		System.out.print(" ");
    	}
    	//stars
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    	space=space+1;
    	
    }
    
	
	
	
 }
}

