package com.metacube.training.dao;

import java.io.IOException;
import java.util.List;

import com.metacube.training.dto.Skill;

public interface SkillDAO {
	
	Skill getSkillById(Long id);

    List<Skill> getAllSkills();

    boolean deleteSkill(Long id);

    boolean updateSkill(Skill project);

    boolean createSkill(Skill project) throws ClassNotFoundException, IOException;
    
}