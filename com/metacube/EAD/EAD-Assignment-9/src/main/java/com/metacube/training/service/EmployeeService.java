package com.metacube.training.service;

import java.util.List;

import com.metacube.training.dto.PreSignupDTO;
import com.metacube.training.enums.SearchCriteria;
import com.metacube.training.model.Employee;

public interface EmployeeService {

	public boolean addEmployee(PreSignupDTO preSignupTO);
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> searchEmployee(SearchCriteria criteria, String keyword);
	
	public Employee getEmployeeByCode(String employeeCode);
	
	public boolean updateEmployee(Employee employee);
	
	public boolean isValidLogin(String username, String password);
	
	public Employee getEmployeeByEmail(String email);
	
	public void addSkills(String[] skills, String employeeCode);

}
