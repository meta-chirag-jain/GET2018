package com.metacube.training.service;

import java.io.IOException;

import com.metacube.training.dao.SkillDAO;
import com.metacube.training.dao.SkillDAOImpl;
import com.metacube.training.dto.Skill;

public class SkillServiceImpl implements SkillService{

	private static SkillServiceImpl SkillServiceImpl = new SkillServiceImpl();
    
    public static SkillServiceImpl getInstance() {
        return SkillServiceImpl;
    }
    
    
    @Override
    public boolean addSkill(Skill skill) throws ClassNotFoundException, IOException {
        
        SkillDAO skillDao = SkillDAOImpl.getInstance();
        
        return skillDao.createSkill(skill);
    }
}
