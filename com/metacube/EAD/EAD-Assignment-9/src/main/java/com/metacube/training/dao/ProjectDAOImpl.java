package com.metacube.training.dao;

import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.metacube.training.mappers.ProjectMapper;
import com.metacube.training.model.Project;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements interface for ProjectDAO.
 * @author Chirag Jain
 */
@Repository
public class ProjectDAOImpl implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;
    
//    public ProjectDAOImpl() {
//        
//    }

    @Autowired
    public ProjectDAOImpl(DataSource dataSource) {
        
    	jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
//	private static ProjectDAOImpl projectDAOObject = new ProjectDAOImpl();
		
	private static final String SQL_GET_ALL = "SELECT * FROM project";
	
	private static final String SQL_INSERT_PROJECT = "INSERT INTO project(description, start_date, end_date, project_logo) "
									+ "VALUES(?,?,?,?)";
	
//	public static ProjectDAOImpl getInstance() {
//		
//		return projectDAOObject;
//	}
	

	public List<Project> getAllProjects() {
		
//		List<Project> listOfProjects = new ArrayList<>();
//		
//		try
//        (
//            Connection connection = JdbcConnection.getConnection();
//            PreparedStatement stmt = connection.prepareStatement(SQL_GET_ALL);
//        ){
//			ResultSet result = stmt.executeQuery();
//			
//			while(result.next())
//			{
//				Project project = new Project();
//				project.setProjectId(result.getInt("project_id"));
//				project.setDescription(result.getString("description"));
//				project.setStartDate(new java.util.Date(result.getDate("start_date").getTime()));
//				project.setEndDate(new java.util.Date(result.getDate("end_date").getTime()));
//				Blob logo = result.getBlob("project_logo");
//				if(logo == null)
//					project.setProjectLogo(null);
//				else
//					project.setProjectLogo(logo.getBinaryStream());
//				
//				listOfProjects.add(project);
//			}
//        }
//        catch (SQLException exception) 
//        {
//            exception.printStackTrace();
//        }
		
		return jdbcTemplate.query(SQL_GET_ALL, new ProjectMapper());
	}


	public boolean createProject(Project project) {
//		boolean inserted = false;
//		
//		try
//        (
//            Connection connection = JdbcConnection.getConnection();
//            PreparedStatement stmt = connection.prepareStatement(SQL_INSERT_PROJECT);
//        ){
//            stmt.setString(1, project.getDescription());
//            stmt.setDate(2, new Date(project.getStartDate().getTime()));
//            stmt.setDate(3, new Date(project.getEndDate().getTime()));
//            stmt.setBlob(4, project.getProjectLogo());
//            
//            if(stmt.executeUpdate() > 0)
//            	inserted = true;
//
//        }
//        catch (SQLException exception) 
//        {
//            exception.printStackTrace();
//        }
		
		return jdbcTemplate.update(SQL_INSERT_PROJECT, project.getDescription(), new Date(project.getStartDate().getTime()),
				new Date(project.getEndDate().getTime()), project.getProjectLogo()) > 0;
	}

}
