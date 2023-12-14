package com.service;

import java.util.Set;

import com.beans.Employee;
import com.dao.EmpDao;
import com.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService{
	private EmpDao edao;
	

	public EmpServiceImpl() {
		edao=new EmpDaoImpl();
	}


	@Override
	public Set<Employee> DisplayAll() {
		return edao.getAll();
	}

}
