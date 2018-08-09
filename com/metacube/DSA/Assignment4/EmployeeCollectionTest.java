package GET2018.com.metacube.DSA.Assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class checks employee collection.
 * @author Chirag Jain
 *
 */
public class EmployeeCollectionTest {

	EmployeeCollection employeeData = new EmployeeCollection();
	
	/**
	 * check employee addition test with same and different EIds.
	 * @throws CustomException
	 */
	@Test
	public void addEmployeeTest() throws CustomException {
		
		assertTrue(employeeData.addEmployee(3, "mohit", "ajmer"));
		assertTrue(employeeData.addEmployee(1, "chirag", "udaipur"));
		assertTrue(employeeData.addEmployee(2, "rahul", "jaipur"));
		
		assertFalse(employeeData.addEmployee(1, "hitesh", "mumbai"));
		
		assertTrue(employeeData.addEmployee(5, "richa", "jaipur"));
		assertTrue(employeeData.addEmployee(4, "arjita", "gwalior"));
		
	}
	
	/**
	 * check sort by Employee Id
	 * @throws CustomException
	 */
	@Test
	public void sortByEIdTest() throws CustomException {
		
		assertTrue(employeeData.addEmployee(3, "mohit", "ajmer"));
		assertTrue(employeeData.addEmployee(1, "chirag", "udaipur"));
		assertTrue(employeeData.addEmployee(2, "rahul", "jaipur"));
		assertFalse(employeeData.addEmployee(1, "hitesh", "mumbai"));
		assertTrue(employeeData.addEmployee(5, "richa", "jaipur"));
		assertTrue(employeeData.addEmployee(4, "arjita", "gwalior"));
		
		employeeData.sortEId();
		
		EmployeeCollection eIdSorted = new EmployeeCollection();
			
		eIdSorted.addEmployee(1, "chirag", "udaipur");
		eIdSorted.addEmployee(2, "rahul", "jaipur");
		eIdSorted.addEmployee(3, "mohit", "ajmer");
		eIdSorted.addEmployee(4, "arjita", "gwalior");
		eIdSorted.addEmployee(5, "richa", "jaipur");	
			
		for(int i = 0, dataLength = employeeData.getEmployee().size(); i < dataLength; i++) {
			assertEquals(eIdSorted.getEmployee().get(i).getEmpId(), employeeData.getEmployee().get(i).getEmpId());
			assertEquals(eIdSorted.getEmployee().get(i).getName(), employeeData.getEmployee().get(i).getName());
			assertEquals(eIdSorted.getEmployee().get(i).getAddress(), employeeData.getEmployee().get(i).getAddress());
		}
		
	}
	
	/**
	 * check sort by Employee name
	 * @throws CustomException
	 */
	@Test
	public void sortByENameAllLowercaseTest() throws CustomException {
		
		assertTrue(employeeData.addEmployee(3, "mohit", "ajmer"));
		assertTrue(employeeData.addEmployee(1, "chirag", "udaipur"));
		assertTrue(employeeData.addEmployee(2, "rahul", "jaipur"));
		assertFalse(employeeData.addEmployee(1, "hitesh", "mumbai"));
		assertTrue(employeeData.addEmployee(5, "richa", "jaipur"));
		assertTrue(employeeData.addEmployee(4, "arjita", "gwalior"));
		
		employeeData.sortEName();
		
		EmployeeCollection nameSorted = new EmployeeCollection();
		
		nameSorted.addEmployee(4, "arjita", "gwalior");
		nameSorted.addEmployee(1, "chirag", "udaipur");
		nameSorted.addEmployee(3, "mohit", "ajmer");
		nameSorted.addEmployee(2, "rahul", "jaipur");
		nameSorted.addEmployee(5, "richa", "jaipur");	

		for(int i = 0, dataLength = employeeData.getEmployee().size(); i < dataLength; i++) {
			assertEquals(nameSorted.getEmployee().get(i).getEmpId(), employeeData.getEmployee().get(i).getEmpId());
			assertEquals(nameSorted.getEmployee().get(i).getName(), employeeData.getEmployee().get(i).getName());
			assertEquals(nameSorted.getEmployee().get(i).getAddress(), employeeData.getEmployee().get(i).getAddress());
		}
		
	}
	
	/**
	 * check sort by Employee name by Ignoring cases
	 * @throws CustomException
	 */
	@Test
	public void sortByENameWithUppercaseTest() throws CustomException {
		
		assertTrue(employeeData.addEmployee(3, "mohit", "ajmer"));
		assertTrue(employeeData.addEmployee(1, "chirag", "udaipur"));
		assertTrue(employeeData.addEmployee(2, "Rahul", "jaipur"));
		assertFalse(employeeData.addEmployee(1, "hitesh", "mumbai"));
		assertTrue(employeeData.addEmployee(5, "richa", "jaipur"));
		assertTrue(employeeData.addEmployee(4, "arjita", "gwalior"));
		
		employeeData.sortEName();
		
		EmployeeCollection nameSorted = new EmployeeCollection();
		
		nameSorted.addEmployee(4, "arjita", "gwalior");
		nameSorted.addEmployee(1, "chirag", "udaipur");
		nameSorted.addEmployee(3, "mohit", "ajmer");
		nameSorted.addEmployee(2, "Rahul", "jaipur");
		nameSorted.addEmployee(5, "richa", "jaipur");	

		for(int i = 0, dataLength = employeeData.getEmployee().size(); i < dataLength; i++) {
			assertEquals(nameSorted.getEmployee().get(i).getEmpId(), employeeData.getEmployee().get(i).getEmpId());
			assertEquals(nameSorted.getEmployee().get(i).getName(), employeeData.getEmployee().get(i).getName());
			assertEquals(nameSorted.getEmployee().get(i).getAddress(), employeeData.getEmployee().get(i).getAddress());
		}
		
	}
	
	/**
	 * check for error when empId is less than 1.
	 * @throws CustomException
	 */
	@Test
	public void WrongEmpIdTest() throws CustomException {
		try {
			employeeData.addEmployee(0, "mohit", "ajmer");
		}
		catch(CustomException error) {
			assertEquals("Employee Id must be greater than equal to 1.", error.getMessage());
		}
		
		try {
			employeeData.addEmployee(-5, "mohit", "ajmer");
		}
		catch(CustomException error) {
			assertEquals("Employee Id must be greater than equal to 1.", error.getMessage());
		}
	}
	
	/**
	 * check for error when empName is less wrong.
	 * @throws CustomException
	 */
	@Test
	public void WrongEmpNameTest() throws CustomException {
		try {
			employeeData.addEmployee(1, "   ", "ajmer");
		}
		catch(CustomException error) {
			assertEquals("Employee address is wrong.", error.getMessage());
		}
		
		try {
			employeeData.addEmployee(1, null, "ajmer");
		}
		catch(CustomException error) {
			assertEquals("Employee address is wrong.", error.getMessage());
		}
	}
	
	/**
	 * check for error when empAddress is less wrong.
	 * @throws CustomException
	 */
	@Test
	public void WrongEmpAddressTest() throws CustomException {
		try {
			employeeData.addEmployee(1, "mohit", "  ");
		}
		catch(CustomException error) {
			assertEquals("Employee address is wrong.", error.getMessage());
		}
		
		try {
			employeeData.addEmployee(1, "mohit", null);
		}
		catch(CustomException error) {
			assertEquals("Employee address is wrong.", error.getMessage());
		}
	}

}
