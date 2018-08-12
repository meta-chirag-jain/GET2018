package GET2018.com.metacube.DSA.Assignment4;

import java.util.HashMap;
import java.util.Map;
/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * Implementation of Bowler Class where we describe about properties of bowler
 * @author Chirag Jain
 * 
 */
public class CacheMemory {

	private Map<String, Integer> cache = new HashMap<String, Integer>();
	
	/**
	 * 
	 * @param inputString
	 * @return true if given string is saved in cache memory.
	 */
	public boolean isPresent(String inputString) {
		return cache.containsKey(inputString);
	}
	
	/**
	 * 
	 * @param inputString
	 * @return unique characters in given string from cache memory
	 */
	public Integer getResult(String inputString) {
		return cache.get(inputString);
	}
	
	/**
	 * saves result of computation in cache memory
	 * @param inputString
	 * @param uniqueValues
	 * @return true if result is saved in cache memory.
	 */
	public boolean saveResult(String inputString, Integer uniqueValues) {
		cache.put(inputString, uniqueValues);
		return true;
	}
}
