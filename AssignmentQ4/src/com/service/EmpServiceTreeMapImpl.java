package com.service;

import java.util.Map;
import java.util.Set;

import com.beans.Employee;
import com.dao.TreeMapEmpDao;
import com.dao.TreeMapEmpDaoImpl;

public class EmpServiceTreeMapImpl implements EmpServiceTreeMap {
   private TreeMapEmpDao tedao;
    
	public EmpServiceTreeMapImpl() {
	super();
	tedao= new TreeMapEmpDaoImpl();
        }

	@Override
	public Map<Integer,Employee> DisplayAll() {
		
		return tedao.getAll();
	}

}
