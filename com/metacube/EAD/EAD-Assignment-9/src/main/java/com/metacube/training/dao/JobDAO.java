package com.metacube.training.dao;

import com.metacube.training.model.JobTitle;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class defiens interface for JobDAO.
 * @author Chirag Jain
 */
public interface JobDAO {

    public boolean createJobTitle(JobTitle jobTitle);
}
