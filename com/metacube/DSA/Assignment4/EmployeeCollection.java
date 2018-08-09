package GET2018.com.metacube.DSA.Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class creates collection of employee data structure.
 * @author Chirag Jain
 *
 */
public class EmployeeCollection {

	private List<Employee> employee = new ArrayList<Employee>();
	private Set<Integer> employeeId = new HashSet<Integer>();
	
	/**
	 * This function add employees to collection.
	 * @param empId
	 * @param name
	 * @param address
	 * @return true if employee is added else false.
	 * @throws CustomException
	 */
	public boolean addEmployee(int empId, String name, String address) throws CustomException {
		boolean flag;
		if(employeeId.add(empId)) {
			employee.add(new Employee(empId, name, address));
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	/**
	 * 
	 * @return collection of employee data.
	 */
	public List<Employee> getEmployee() {
		return employee;
	}
	
	/**
	 * Sorts data by EmpId.
	 */
	public void sortEId() {
		Collections.sort(employee, EmployeeSorter.sortByEId);
	}
	
	/**
	 * sorts data by EmpName.
	 */
	public void sortEName() {
		Collections.sort(employee, EmployeeSorter.sortByEname);
	}
	
	
	
}
