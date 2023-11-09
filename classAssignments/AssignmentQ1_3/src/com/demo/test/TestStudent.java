package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.sevice.StudentService;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter choice: ");
		
			System.out.println("1. Display All Student\n2. Search by id\n3. Search by name\n4. calculate GPA of a student\n5. Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				
				StudentService.DisplayAll();
				break;
			case 2:
				System.out.println("Enter id for search:");
				int id =sc.nextInt();
				Student s=StudentService.SearchById(id);
				if(s!=null) {
					System.out.println(s);
				}else {
					System.out.println("NOt found!..");
				}
				break;
			case 3:
				System.out.println("Enter name for search:");
				sc.nextLine();
				String name=sc.next();
				 s=StudentService.SearchByName(name);
				if(s!=null) {
					System.out.println(s);
				}else {
					System.out.println("NOt found!..");
				}
				break;
			case 4:
				System.out.println("enter id of student:");
				id=sc.nextInt();
				StudentService.CalculateGpa(id);
			   break;
			case 5:
				System.out.println("thank you!...");
				break;
			default:
				System.out.println("Enter correct choice!");
			
			}
		}while(choice!=5);
	}

}
