package com.test;

import java.util.Scanner;
import java.util.Set;

import com.beans.Employee;
import com.service.EmpService;
import com.service.EmpServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		EmpService eservice=new EmpServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice..");
			System.out.println("1:Display All\n2:Add new\n3:exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				Set<Employee> empset=eservice.DisplayAll();
				empset.stream().forEach(System.out::println);
				break;
			case 2:
				break;
			
			case 3:
				sc.close();
				System.out.println("thank you for visiting!...");
				break;
				default:
					System.out.println("");
			}
		}while(choice!=3);
	}

}
