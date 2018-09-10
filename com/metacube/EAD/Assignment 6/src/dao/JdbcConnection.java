package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * create a connection with the database.
 * @author Chirag Jain
 *
 */
public class JdbcConnection {

    /**
     * method to create a connection with the database
     * @return connection 
     */
    public static Connection getConnection()
    {
        Connection connection = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/advertise";
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
    
}
