package com.metacube.training.dao;

import java.util.List;

import com.metacube.training.model.Skill;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class defiens interface for JobDAO.
 * @author Chirag Jain
 */
public interface SkillDAO {

    List<Skill> getAllSkills();

    boolean createSkill(Skill project);
    
    Skill getSkillByName(String skillName);
}
