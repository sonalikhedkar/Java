package javacodingQuestions;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter first string");
		  String str1=sc.next();
		  System.out.println("Enter second string");
		  String str2=sc.next();
		  boolean flag= true;
		  if(str1.length()==str2.length()) {
		  char chars1[] = str1.toCharArray();
	      Arrays.sort(chars1);
	      char chars2[]=str2.toCharArray();
	        for(int i=0;i<chars1.length;i++) {
	        	if(chars1[i]!=chars2[i]) {
	        	   flag=false;
	        	   break;
	        	}
	        }
		  }else {
			  flag=false;
		  }
		  if(flag) {
			  System.out.println("Strings are Anagram");
		  }else {
			  System.out.println("Strings are not Anagram");
		  }
	}

}
