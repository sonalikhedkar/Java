package com.dao;

import java.util.HashSet;
import java.util.Set;

import com.beans.Employee;

public class EmpDaoImpl implements EmpDao{
	static Set<Employee>empset;
	static {
		empset=new HashSet<>();
		empset.add(new Employee(1,"sonali",5000,"Art", "Writer"));
		empset.add(new Employee(1,"sona",4000,"IT","Devloper"));
		empset.add(new Employee(2,"Avantika",10000,"IT","Manager"));
	}
	@Override
	public Set<Employee> getAll() {
		return empset;
	}
}
