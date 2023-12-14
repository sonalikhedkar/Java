package javacodingQuestions;
import java.util.*;
//using set
public class unique_value {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] array = new int[7];
		System.out.print("enter array elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("your array");
		for(int i=0;i<7;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		HashSet<Integer> set = new HashSet<Integer>() ;
		System.out.println("unique elements of array");
		for(int j=0;j<array.length;j++) {
			if(!set.contains(array[j])) {
				set.add(array[j]);
				System.out.print(array[j]+" ");
			}
		}
	}

}
