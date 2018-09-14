package GET2018.com.metacube.DSA.Assignment3;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * Implementation of Bowler Class where we describe about properties of bowler
 * @author Chirag Jain
 * 
 */
public class Bowler {
	int bowl;
	String name;
	
	public Bowler(int bowl, String name) throws CustomException {
		if(bowl == 0) {
			throw new CustomException("Bowler not allowed with zero bowl");
		}
		
		if(name == null) {
			throw new NullPointerException("Bowler name can'nt be null");
		}
		this.bowl = bowl;
		this.name = name;
	}
	
	/**
	 * this function sets number of balls of bowler
	 * @param bowl
	 */
	public void setBowl(int bowl) {
		if(bowl >= 0) {
			this.bowl = bowl;
		}
	}
	
	/**
	 * 
	 * @return number of balls of bowler
	 */
	public int getBowl() {
		return bowl;
	}
	
	/**
	 * 
	 * @return name of bowler
	 */
	public String getBowler() {
		return name;
	}
}
