package com.metacube.training.model;

import java.io.InputStream;
import java.util.Date;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * @author Chirag Jain
 */
public class Project {

	int projectId;
	String description;
	Date startDate, endDate;
	InputStream projectLogo;
	
	
	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}
	
	
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	
	
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	
	
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	/**
	 * @return the projectLogo
	 */
	public InputStream getProjectLogo() {
		return projectLogo;
	}
	
	
	/**
	 * @param projectLogo the projectLogo to set
	 */
	public void setProjectLogo(InputStream projectLogo) {
		this.projectLogo = projectLogo;
	}
	
	

}
