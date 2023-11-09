package com.demo.sevice;

import com.demo.beans.Student;

public class StudentService {
     private static Student[]st;
     private static int cnt;
     static {
    	 st=new Student[10];
    	 st[0]=new Student(1,"Sonali", 99, 98, 100);
    	 st[1]=new Student(2,"sharad",96,88,89);
    	 st[2]=new Student(3,"tukaram",99,100,100);
    	 st[3]=new Student(4,"Kartik",97,88,95);
    	 cnt=4;
     }
	
	public static void DisplayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(st[i]);
		}
	}

	public static Student SearchById(int id) {
		for(Student s:st) {
			if(id==s.getId()) {
				return s;
			}
		}
		return null;
	}

	public static Student SearchByName(String name) {
		
		for(int i=0;i<cnt;i++) {
			if(st[i].getName()==name) {
				return st[i];
			}
		}
		return null;
	}

	public static void CalculateGpa(int id) {
		Student s=SearchById(id);
		if(s!=null) {
			s.CalculateGPA();
			System.out.println("GPA OF STUDENT "+s.getGpa());
						
		}else {
			System.out.println("Student is not present:");
		}
		
	}

}
