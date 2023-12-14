package com.dao;

import java.util.Map;
import java.util.TreeMap;

import com.beans.Employee;

public class TreeMapEmpDaoImpl implements TreeMapEmpDao{
	static Map<Integer,Employee> empmap;
	static {
		empmap=new TreeMap<>();
		empmap.put(4,new Employee(4,"Avantika",10000,"IT","Manager"));
		empmap.put(1,new Employee(1,"sonali",5000,"Art", "Writer"));
		empmap.put(2,new Employee(2,"sona",4000,"IT","Devloper"));
		empmap.put(2,new Employee(2,"sona",4000,"IT","Devloper"));
		empmap.put(3,new Employee(3,"Avantika",10000,"IT","Manager"));
	}
	@Override
	public Map<Integer,Employee> getAll() {
		return empmap;
	}
}
