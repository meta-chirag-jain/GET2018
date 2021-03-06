package com.metacube.training.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.metacube.training.model.JobTitle;
/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements interface for JobDAO.
 * @author Chirag Jain
 */
@Repository
public class JobDAOImpl implements JobDAO{

	private JdbcTemplate jdbcTemplate;
	
	public JobDAOImpl() {
        
    }

    @Autowired
    public JobDAOImpl(DataSource dataSource) {
        
    	jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    private static JobDAOImpl jobDaoObject = new JobDAOImpl();
    
    private static final String SQL_INSERT_JOB_TITLE = "INSERT INTO job_title(job_title) "
            + "VALUES(?)";    
    
    public static JobDAOImpl getInstance() {
        
        return jobDaoObject;
    }
    
    
    public boolean createJobTitle(JobTitle jobTitle) {
        
//        boolean inserted = false;
//        
//        try
//        (
//            Connection connection = JdbcConnection.getConnection();
//            PreparedStatement stmt = connection.prepareStatement(SQL_INSERT_JOB_TITLE);
//        ){
//            stmt.setString(1, jobTitle.getJobTitle());
//            
//            if(stmt.executeUpdate() > 0)
//                inserted = true;
//
//        }
//        catch (SQLException exception) 
//        {
//            exception.printStackTrace();
//        }
        
        return jdbcTemplate.update(SQL_INSERT_JOB_TITLE, jobTitle.getJobTitle()) > 0;
    }

    
}
