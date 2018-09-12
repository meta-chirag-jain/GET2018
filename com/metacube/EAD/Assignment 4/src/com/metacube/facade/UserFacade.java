package com.metacube.facade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.metacube.dao.ConnectionManager;
import com.metacube.dao.Queries;

public class UserFacade {
	
	public static boolean isEmailPresent(String email) {
		
		String query = Queries.isEmailPresentQuery;
		boolean isPresent = false;
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
            	
            	if (rset.next()) {
            	    isPresent = true;
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
		return isPresent;
	}

}
