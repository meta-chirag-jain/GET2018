package com.metacube.dao;

public class Queries {
	
	public static String getAddUserQuery = "INSERT INTO userDetails(first_name, last_name, dob, number, email, password, company)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
	
	public static String isEmailPresentQuery = "SELECT email"
			+ " FROM userDetails"
			+ " WHERE email = ?";
	
	public static String getFetchUserQuery = "SELECT first_name, last_name, dob, number, email, password, company, picture,"
			+ " DATE_FORMAT(NOW(), '%Y') - DATE_FORMAT(dob, '%Y') - (DATE_FORMAT(NOW(), '00-%m-%d') < DATE_FORMAT(dob, '00-%m-%d')) AS age"
			+ " FROM userDetails"
			+ " WHERE email = ?";
	
	public static String getFetchFriendsQuery = "SELECT first_name, last_name, email,"
			+ " DATE_FORMAT(NOW(), '%Y') - DATE_FORMAT(dob, '%Y') - (DATE_FORMAT(NOW(), '00-%m-%d') < DATE_FORMAT(dob, '00-%m-%d')) AS age"
			+ " FROM userDetails"
			+ " WHERE company = ?  AND email <> ?";

	public static String getUpdateUserQuery = "UPDATE userDetails "
    		+ "SET first_name = ?, "
    		+ "last_name = ?, "
    		+ "number = ?, "
    		+ "email = ? "
    		+ "WHERE email = ?";
	
}
