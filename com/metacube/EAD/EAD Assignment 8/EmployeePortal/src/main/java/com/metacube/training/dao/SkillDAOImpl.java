package com.metacube.training.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.metacube.training.dto.Skill;

public class SkillDAOImpl implements SkillDAO{

private static SkillDAOImpl skillDaoObject = new SkillDAOImpl();
    
    private static final String SQL_FIND_SKILL = "SELECT * "
            + "FROM skills "
            + "WHERE skill_id = ?";

    private static final String SQL_DELETE_SKILL = "DELETE FROM skills "
            + "WHERE skill_id = ?";

    private static final String SQL_UPDATE_SKILL = "UPDATE skills "
            + "SET skill_name = ? "
            + "WHERE skill_id = ?";

    private static final String SQL_GET_ALL = "SELECT * FROM skills";

    private static final String SQL_INSERT_SKILL = "INSERT INTO skills(skill_name) "
            + "VALUES(?)";
    
    
    public static SkillDAOImpl getInstance() {
        
        return skillDaoObject;
    }

    @Override
    public Skill getSkillById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Skill> getAllSkills() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean deleteSkill(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateSkill(Skill skill) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean createSkill(Skill skill) throws ClassNotFoundException, IOException {
        
        boolean inserted = false;
        
        try
        (
            Connection connection = JdbcConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(SQL_INSERT_SKILL);
        ){
            stmt.setString(1, skill.getName());
            
            if(stmt.executeUpdate() > 0)
                inserted = true;

        }
        catch (SQLException exception) 
        {
            exception.printStackTrace();
        }
        
        return inserted;
    }
}
