package com.metacube.training.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnection {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException{  
		
		InputStream inputStream = JdbcConnection.class.getClassLoader().getResourceAsStream("database.properties");
		Properties property = new Properties();  
		property.load(inputStream);
		
		Class.forName(property.getProperty("driver"));
		return DriverManager.getConnection(property.getProperty("url"),
		property.getProperty("username"), property.getProperty("password"));
	}
	
	/*
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		System.out.println(JdbcConnection.getConnection());
	}*/
}