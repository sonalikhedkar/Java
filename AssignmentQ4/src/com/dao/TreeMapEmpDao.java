package com.dao;



import java.util.Map;

import com.beans.Employee;

public interface TreeMapEmpDao {

	Map<Integer,Employee> getAll();

}
