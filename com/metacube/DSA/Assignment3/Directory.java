package GET2018.com.metacube.DSA.Assignment3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class creates directory with their required properties.
 * @author Chirag Jain
 * 
 */
public class Directory {

	private final String name;
	private final Date dateOfCreation;
	private List<Directory> listOfSubDirectory;
	
	
	public Directory(String name, Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
		this.name = name;
		this.listOfSubDirectory = new ArrayList<Directory>();
	}

	/**
	 * 
	 * @return list of sub directories.
	 */
	public List<Directory> getListOfSubDirectory() {
		return listOfSubDirectory;
	}

	/**
	 * 
	 * @return name of directory.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return date and time when the directory is created.
	 */
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	
	
}
