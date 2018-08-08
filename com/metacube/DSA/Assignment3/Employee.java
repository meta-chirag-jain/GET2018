package GET2018.com.metacube.DSA.Assignment3;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class defines employee structure.
 * @author Chirag Jain
 *
 */
public class Employee {

	private int empId;
	private String name;
	private String address;
	
	public Employee(int empId, String name, String address) throws CustomException {
		if(empId < 1) {
			throw new CustomException("Employee Id must be greater than equal to 1.");
		}
		if(name == null || name.trim() == "") {
			throw new CustomException("Employee name is wrong.");
		}
		if(address == null || address.trim() == "") {
			throw new CustomException("Employee address is wrong.");
		}
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	/**
	 * 
	 * @return employee id.
	 */
	public int getEmpId() {
		return empId;
	}
	
	/**
	 * 
	 * @return employee name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return employee address.
	 */
	public String getAddress() {
		return address;
	}


}
