package com.metacube.training.dao;

import java.util.List;

import com.metacube.training.model.Project;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class defiens interface for ProjectDAO.
 * @author Chirag Jain
 */
public interface ProjectDAO {

	List<Project> getAllProjects();

	boolean createProject(Project project);
	
}
