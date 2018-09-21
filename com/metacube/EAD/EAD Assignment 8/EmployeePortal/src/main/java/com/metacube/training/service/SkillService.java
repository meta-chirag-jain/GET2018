package com.metacube.training.service;

import java.io.IOException;

import com.metacube.training.dto.Skill;

public interface SkillService {
	
	public boolean addSkill(Skill skill) throws ClassNotFoundException, IOException;

}