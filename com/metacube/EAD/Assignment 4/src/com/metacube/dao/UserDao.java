package com.metacube.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.metacube.dao.Queries;
import com.metacube.enums.Status;
import com.metacube.facade.UserFacade;
import com.metacube.model.User;

public class UserDao {
	
	/**
	 * 
	 * @param user
	 * @return Status
	 */
	public static Status addUser(User user) {
		
		String query = Queries.getAddUserQuery;
		int result = 0;

		//check if already present in DB
		if(UserFacade.isEmailPresent(user.getEmail())) {
			return Status.DUPLICATE;
		}
		
		try
        (
            Connection connection = ConnectionManager.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
            	stmt.setString(1, user.getFirstName());
            	stmt.setString(2, user.getLastName());
            	stmt.setDate(3,  new Date(user.getDob().getTime()));
                stmt.setString(4, user.getNumber());
                stmt.setString(5, user.getEmail());
                stmt.setString(6, user.getPassword());
                stmt.setString(7, user.getCompany());
                
                result = stmt.executeUpdate();
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
		
		if(result != 1) {
			return Status.FAILED;
		}
		return Status.INSERTED;
	}
	
	/**
	 * 
	 * @param email
	 * @return
	 */
	public static User fetchUser(String email) {
		
		String query = Queries.getFetchUserQuery;
		ResultSet rset = null;
		User user = new User();

		try
        (
            Connection connection = ConnectionManager.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
            	stmt.setString(1, email);
            	
                rset = stmt.executeQuery();
                
                while(rset.next()) {
                	
                	String firstName = rset.getString("first_name");
    		        String lastName = rset.getString("last_name");
    		        Date dob = new Date(rset.getDate("dob").getTime());
    		        //String email = rset.getString("email");
    		        String number = rset.getString("number");
    		        String company = rset.getString("company");
    		        int age = rset.getInt("age");
    		        
    		        user.setFirstName(firstName);
    		        user.setLastName(lastName);
    		        user.setDob(dob);
    		        user.setEmail(email);
    		        user.setNumber(number);
    		        user.setCompany(company);
    		        user.setAge(age);
                }
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
		return user;
	}

	/**
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	public static boolean validateLogin(String email, String password) {
		
		String query = Queries.getFetchUserQuery;
		ResultSet rset;

		try
        (
            Connection connection = ConnectionManager.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
            	stmt.setString(1, email);
                rset = stmt.executeQuery();
                
                while(rset.next()) {
                	if(password.equals(rset.getString("password"))) {
                		return true;
                	}
                }
                	
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
		return false;
	}
	
	/**
	 * 
	 * @param company
	 * @return
	 */
	public static List<User> fetchFriends(String user_email, String company) {

		String query = Queries.getFetchFriendsQuery;
		ResultSet rset;
		List<User> friends = new ArrayList<User>();

		try
        (
            Connection connection = ConnectionManager.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
            	stmt.setString(1, company);
            	stmt.setString(2, user_email);
                rset = stmt.executeQuery();
                
                while(rset.next()) {
                	User friend = new User();
                	
                	String firstName = rset.getString("first_name");
    		        String lastName = rset.getString("last_name");
    		        String email = rset.getString("email");
    		        int age = rset.getInt("age");
    		        
    		        friend.setFirstName(firstName);
    		        friend.setLastName(lastName);
    		        friend.setEmail(email);
    		        friend.setAge(age);
    		        
    		        friends.add(friend);
                	
                }
                	
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
		
		return friends;
	}

	/**
	 * 
	 * @param user
	 * @param oldEmail
	 * @return
	 */
	public static void updateUser(User user, String oldEmail) {
		
		String query = Queries.getUpdateUserQuery;
		try
        (
            Connection connection = ConnectionManager.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
        ){
            try 
            {
            	stmt.setString(1, user.getFirstName());
            	stmt.setString(2, user.getLastName());
                stmt.setString(3, user.getNumber());
                stmt.setString(4, user.getEmail());
                stmt.setString(5, oldEmail);
                
                stmt.executeUpdate();
                
            }
            catch (SQLException exception)
            {
                exception.printStackTrace();
            }
        }
        catch (SQLException exception) {
        	exception.printStackTrace();
        }
	}

}
