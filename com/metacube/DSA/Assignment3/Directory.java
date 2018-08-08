package GET2018.com.metacube.DSA.Assignment3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory {

	private final String name;
	private final Date dateOfCreation;
	private List<Directory> listOfSubDirectory;
	
	
	public Directory(String name, Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
		this.name = name;
		this.listOfSubDirectory = new ArrayList<Directory>();
	}


	public List<Directory> getListOfSubDirectory() {
		return listOfSubDirectory;
	}


	public void setListOfSubDirectory(List<Directory> listOfSubDirectory) {
		this.listOfSubDirectory = listOfSubDirectory;
	}


	public String getName() {
		return name;
	}


	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	
	
}
