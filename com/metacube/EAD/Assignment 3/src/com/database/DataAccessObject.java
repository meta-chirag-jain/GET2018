package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.pojo.Employee;

public class DataAccessObject {
	
	private static Connection getConnection()
    {
        Connection connection = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employee";
            connection = DriverManager.getConnection(url, "root", "adminchirag");
        }
        catch(ClassNotFoundException exception)
        {
            exception.printStackTrace();
            System.exit(1);
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            System.exit(2);
        }
        
        return connection;
    }
	
	public static int addEmployee(Employee employee)
    {
        String query = "INSERT INTO employee_data(first_name, last_name, email, age) VALUES(?, ?, ?, ?)";
        int result = 0;
        
        try
        (
            Connection connection = getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
            	stmt.setString(1, employee.getFirstName());
            	stmt.setString(2, employee.getLastName());
                stmt.setString(3, employee.getEmail());
                stmt.setInt(4, employee.getAge());
            	
                result = stmt.executeUpdate();
                
            }
            catch (MySQLIntegrityConstraintViolationException exception) 
            {
            	System.out.println(exception);
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
        
        return result;
    }
	
	public static List<Employee> showEmployees()
    {
		String query = "SELECT first_name, last_name, email, age"
				+ " FROM employee_data";
        ResultSet rset = null;
        
        List<Employee> employeeList = new ArrayList<Employee>();
        
        try
        (
            Connection connection = getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
                rset = stmt.executeQuery();
                
                while(rset.next()) {
    				String firstName = rset.getString("first_name");
    		        String lastName = rset.getString("last_name");
    		        String email = rset.getString("email");
    		        int age = rset.getInt("age");
    		        
    		        Employee employee = new Employee();
    		        employee.setFirstName(firstName);
    		        employee.setLastName(lastName);
    		        employee.setEmail(email);
    		        employee.setAge(age);
    		        employeeList.add(employee);
    			}
                
            }
            catch (MySQLIntegrityConstraintViolationException exception) 
            {
            	System.out.println(exception);
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
        
        return employeeList;        
    }
	
	public static int updateEmployee(Employee employee, String oldEmail)
    {
        String query = "UPDATE employee_data "
        		+ "SET first_name = ?, "
        		+ "last_name = ?, "
        		+ "email = ?, "
        		+ "age = ? "
        		+ "WHERE email = ?";
        int result = 0;
        
        try
        (
            Connection connection = getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
            	stmt.setString(1, employee.getFirstName());
            	stmt.setString(2, employee.getLastName());
                stmt.setString(3, employee.getEmail());
                stmt.setInt(4, employee.getAge());
                stmt.setString(5, oldEmail);
            	
                result = stmt.executeUpdate();
                
            }
            catch (MySQLIntegrityConstraintViolationException exception) 
            {
            	System.out.println(exception);
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
        
        return result;
    }
	
	public static List<Employee> searchEmployees(String search)
    {
		String query = "SELECT first_name, last_name, email, age"
				+ " FROM employee_data"
				+ " WHERE concat(first_name , ' ' ,last_name) LIKE concat('%', ?, '%')"
				+ " OR concat(last_name , ' ' ,first_name) LIKE concat('%', ?, '%')";
		
        ResultSet rset = null;
        
        List<Employee> employeeSearchList = new ArrayList<Employee>();
        
        try
        (
            Connection connection = getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
            	stmt.setString(1, search);
            	stmt.setString(2, search);
            	
                rset = stmt.executeQuery();
                
                while(rset.next()) {
    				String firstName = rset.getString("first_name");
    		        String lastName = rset.getString("last_name");
    		        String email = rset.getString("email");
    		        int age = rset.getInt("age");
    		        
    		        Employee employee = new Employee();
    		        employee.setFirstName(firstName);
    		        employee.setLastName(lastName);
    		        employee.setEmail(email);
    		        employee.setAge(age);
    		        employeeSearchList.add(employee);
    			}
                
            }
            catch (MySQLIntegrityConstraintViolationException exception) 
            {
            	System.out.println(exception);
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
        
        return employeeSearchList;        
    }
}
