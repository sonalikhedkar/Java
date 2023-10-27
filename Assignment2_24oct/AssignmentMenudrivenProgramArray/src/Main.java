import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
		System.out.println("Enter Your choice: ");
		System.out.println("1: add two array ");
		System.out.println("2: find transpose");
		System.out.println("3:find mininum number from 2D array");
		System.out.println("4:find maximum number from 2D array");
		System.out.println("5:Display elements from 2D array");
		System.out.println("6:Display number how many times appears in 2D array");
		choice=sc.nextInt();
		switch(choice) {
			case 1:
				int size;
				System.out.println("enter array's size");
			    size=sc.nextInt();
				int[]arr1=new int[size];
				int[]arr2=new int[size];
				System.out.println("enter elements of first array");
				MenuDrivenForArray.AcceptElements(arr1);
				System.out.println("enter elements second array array");
				MenuDrivenForArray.AcceptElements(arr2);
				MenuDrivenForArray.AddTwoArray(arr1,arr2);
				break;
			case 2:
				System.out.println("enter array's size row and column");
			    int rows =sc.nextInt();
			    int cols=sc.nextInt();
				int[][]array3=new int[rows][cols];
				System.out.println("enter elements of array");
				MenuDrivenForArray.AcceptElements(array3);
				MenuDrivenForArray.DisplayArray(array3);
				MenuDrivenForArray.DisplayTranspose(array3);
				break;
				
			case 3:
				System.out.println("enter array's size row and column");
			    int row =sc.nextInt();
			    int col=sc.nextInt();
				int[][]array1=new int[row][col];
				System.out.println("enter elements of array");
				MenuDrivenForArray.AcceptElements(array1);
				MenuDrivenForArray.MinimumNumber(array1);
				break;
				
			case 4:
				System.out.println("enter array's size row and column");
			      int ro =sc.nextInt();
			     int co=sc.nextInt();
				int[][]array2=new int[ro][co];
				System.out.println("enter elements of array");
				MenuDrivenForArray.AcceptElements(array2);
				MenuDrivenForArray.MaximumNumber(array2);
				break;
			case 5:
				System.out.println("enter array's size row and column");
			    int row1 =sc.nextInt();
			    int col1=sc.nextInt();
				int[][]arr3=new int[row1][col1];
				System.out.println("enter elements of array");
				MenuDrivenForArray.AcceptElements(arr3);
				MenuDrivenForArray.DisplayArray(arr3);
				break;
			
			case 6:
				System.out.println("enter array's size row and column");
			    int rows1 =sc.nextInt();
			    int cols1=sc.nextInt();
				int[][]ar=new int[rows1][cols1];
				System.out.println("enter elements of array");
				MenuDrivenForArray.AcceptElements(ar);
				MenuDrivenForArray.DisplayArray(ar);
				System.out.println("enter any number you want");
				int value =sc.nextInt();
				MenuDrivenForArray.NumberAppears(ar,value);
				break;
			default:
				System.out.println(" choose correct choice");
				break;
		 }
			
		}while(choice!=0);
		System.out.println("Exit ");
		System.exit(0);

	}

}
