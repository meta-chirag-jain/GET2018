package com.metacube.training.service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metacube.training.dao.EmployeeDAO;
import com.metacube.training.dto.PreSignupDTO;
import com.metacube.training.enums.SearchCriteria;
import com.metacube.training.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static EmployeeServiceImpl employeeServiceObject = new EmployeeServiceImpl();
	
	@Autowired
	private EmployeeDAO employeeDao;
	
	public static EmployeeServiceImpl getInstance() {
		
		return employeeServiceObject;
	}
	
	
	public boolean addEmployee(PreSignupDTO preSignupTO) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(preSignupTO.getDoj());
		int year = calendar.get(Calendar.YEAR);
		
		preSignupTO.setEmployeeCode(generateEmployeeCode(year));
		
		return employeeDao.preSignup(preSignupTO);
	}


	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllEmployees();
	}


	public List<Employee> searchEmployee(SearchCriteria criteria, String keyword) {
		
		List<Employee> listOfEmployees = null;
		
		switch (criteria) {
			
			case NAME : listOfEmployees = employeeDao.searchByName(keyword);
						  break;
						  
			case PROJECT : listOfEmployees = employeeDao.searchByProject(Integer.parseInt(keyword));
							 break;
							 
			case SKILL : listOfEmployees = employeeDao.searchBySkills(keyword);
						   break;
						   
			case EXPERIENCE : listOfEmployees = employeeDao.searchByExperience(Double.parseDouble(keyword));
								break;
		}
		
		return listOfEmployees;
	}
	

	public Employee getEmployeeByCode(String employeeCode) {
		
		return employeeDao.getEmployeeByCode(employeeCode);
	}
	

	public boolean updateEmployee(Employee employee) {
		
		return employeeDao.updateEmployee(employee);
	}


	public boolean isValidLogin(String username, String password) {
		
		boolean valid = false;
		
		if(password.equals(getEmployeeByEmail(username).getPassword()))
			valid = true;
		
		return valid;
	}
	
	public Employee getEmployeeByEmail(String email) {
		
		return employeeDao.getEmployeeByEmail(email);
	}

	
	public void addSkills(String[] skills, String employeeCode) {
		
		SkillService skillService = SkillServiceImpl.getInstance();
		
		for(String skill: skills)
		{
			if(!"n/a".equals(skill))
			{
				employeeDao.addSkill(skillService.getSkillByName(skill), employeeCode);
			}
				
		}
		
	}
	
	private String generateEmployeeCode(int year) {
		
	    String employeeCode;
		List<Employee> listOfEmployee = getAllEmployees();
		int size = listOfEmployee.size();
		if(size > 0)
		{
		    int[] codes = new int[size];
	        
	        for(int i = 0; i < size; i++)
	            codes[i] = Integer.parseInt(listOfEmployee.get(i).getEmployeeCode().split("/")[1]);
	            
	        Arrays.sort(codes);
	        employeeCode = "E" + year + "/" + (codes[size - 1] + 1);
		}
		else
		    employeeCode = "E" + year + "/" + 1;
		
		return employeeCode;
	}

}
