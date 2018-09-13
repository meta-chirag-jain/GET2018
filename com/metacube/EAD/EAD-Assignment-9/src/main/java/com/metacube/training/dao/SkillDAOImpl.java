package com.metacube.training.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.metacube.training.mappers.SkillMapper;
import com.metacube.training.model.Skill;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements SkillDAO.
 * @author Chirag Jain
 */
@Repository
public class SkillDAOImpl implements SkillDAO {

	private JdbcTemplate jdbcTemplate;
    
//    public SkillDAOImpl() {
//        
//    }

    @Autowired
    public SkillDAOImpl(DataSource dataSource) {
        
    	jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    //private static SkillDAOImpl skillDaoObject = new SkillDAOImpl();
    
    private static final String SQL_FIND_SKILL = "SELECT * "
            + "FROM skills "
            + "WHERE skill_name = ?";

    private static final String SQL_GET_ALL = "SELECT * FROM skills";

    private static final String SQL_INSERT_SKILL = "INSERT INTO skills(skill_name) "
            + "VALUES (?)";
    
    
//    public static SkillDAOImpl getInstance() {
//        
//        return skillDaoObject;
//    }

    
    public List<Skill> getAllSkills() {
        
//    	List<Skill> listOfSkills = new ArrayList<>();
//    	
//    	try
//        (
//            Connection connection = JdbcConnection.getConnection();
//            PreparedStatement stmt = connection.prepareStatement(SQL_GET_ALL);
//        ){
//            ResultSet result = stmt.executeQuery();
//            
//            while(result.next())
//            {
//            	Skill skill = new Skill();
//            	skill.setId(result.getInt("skill_id"));
//            	skill.setName(result.getString("skill_name"));
//            	
//            	listOfSkills.add(skill);
//            }
//
//        }
//        catch (SQLException exception) 
//        {
//            exception.printStackTrace();
//        }
    	
        return jdbcTemplate.query(SQL_GET_ALL, new SkillMapper());
    }

    
    public boolean createSkill(Skill skill) {
        
//        boolean inserted = false;
//        
//        try
//        (
//            Connection connection = JdbcConnection.getConnection();
//            PreparedStatement stmt = connection.prepareStatement(SQL_INSERT_SKILL);
//        ){
//            stmt.setString(1, skill.getName());
//            
//            if(stmt.executeUpdate() > 0)
//                inserted = true;
//
//        }
//        catch (SQLException exception) 
//        {
//            exception.printStackTrace();
//        }
        System.out.println(skill.getName());
        int result = jdbcTemplate.update(SQL_INSERT_SKILL, skill.getName());
        System.out.println(result);
        return result > 0;
    }


    public Skill getSkillByName(String skillName) {
		
//		Skill skill = new Skill();
//		
//		try
//        (
//            Connection connection = JdbcConnection.getConnection();
//            PreparedStatement stmt = connection.prepareStatement(SQL_FIND_SKILL);
//        ){
//            stmt.setString(1, skillName);
//            
//            ResultSet result = stmt.executeQuery();
//            result.next();
//            
//            skill.setId(result.getInt("skill_id"));
//            skill.setName(skillName);
//
//        }
//        catch (SQLException exception) 
//        {
//            exception.printStackTrace();
//        }
		
		return jdbcTemplate.queryForObject(SQL_FIND_SKILL, new Object[] { skillName }, new SkillMapper());
	}
}
