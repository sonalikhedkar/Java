import java.util.Scanner;

public class MenuDrivenForArray {
	//function that accepts array elements of 1D
	public static void AcceptElements(int a[]) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	//function for addition of two array
	public static void AddTwoArray(int[]a, int[]a1) {
		int[] temp=new int[a.length];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i]+a1[i];	
		}
		System.out.println("Result of addition of two array");
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println()  ;
	}

	// function for accept 2D array
	public static void AcceptElements(int a1[][]) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[0].length;j++) {
			a1[i][j]=sc.nextInt();
			}
			
		}
	}
	//Dispaly 2D array
	public static void DisplayArray(int a1[][]) {
		System.out.println("Entered array is:");
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[0].length;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}

	}
	// Function for finding Minimum Number from 2D array
	public static void MinimumNumber(int a1[][]) {
		int min=a1[0][0];
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[0].length;j++) {
				if(min>a1[i][j]) {
					min=a1[i][j];
		    
		      }
			}	
		}
		System.out.println("Minimum Number from 2d array is :"+min);
	}
	//function for finding Maximum Number from 2D array
	public static void MaximumNumber(int a1[][]) {
		int max=a1[0][0];
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[0].length;j++) {
				if(max<a1[i][j]) {
					max=a1[i][j];
		    
		      }
			}	
		}
		System.out.println("Maximum Number from 2d array is :"+max);
	}
	//function to find transpose of 2D array
	public static void DisplayTranspose(int a1[][]) {
		System.out.println("Transpose of array is :");
		for(int i=0;i<a1[0].length;i++) {
			for(int j=0;j<a1.length;j++) {
				System.out.print(a1[j][i]+" ");
			}
			System.out.println();
		}

	}
	//check a particular number appears how many times in the 2D array
	public static void NumberAppears(int a[][],int v) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]==v) {
					count++;
				}
			}
		}
		System.out.println("Number appears in 2D array"+count+"times");
	}
}
