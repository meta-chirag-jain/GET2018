package com.metacube.training.service;

import java.util.List;

import com.metacube.training.model.Project;

public interface ProjectService {

	public boolean addProject(Project project);
	
	public List<Project> getAllProjects();
}
