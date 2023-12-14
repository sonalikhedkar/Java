package com.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.beans.Employee;
import com.service.EmpServiceTreeMap;
import com.service.EmpServiceTreeMapImpl;


public class TestEmpTreeMap {

	public static void main(String[] args) {
		
      EmpServiceTreeMap eservice=new EmpServiceTreeMapImpl();
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice..");
			System.out.println("1:Display All\n2:Add new\n3:exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				Map<Integer,Employee> empmap=eservice.DisplayAll();
				//System.out.println(empmap);
				//System.out.println(empmap.values());
				empmap.values().stream().forEach(System.out::println);
				//Map<Integer,Employee> empmap1=empmap.clone();
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
