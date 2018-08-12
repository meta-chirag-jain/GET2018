package GET2018.com.metacube.DSA.Assignment4;

import java.util.HashSet;
import java.util.Set;
/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class computes unique characters in given string and 
 * save it in cache memory for future use.
 * @author Chirag Jain
 * 
 */
public class ComputeUnique {

	private CacheMemory cacheMemory = new CacheMemory();
	
	public CacheMemory getCacheMemory() {
		return cacheMemory;
	}

	/**
	 * 
	 * @param inputString
	 * @return number of unique characters
	 * @throws CustomException
	 */
	public Integer computeUnique(String inputString) throws CustomException {
		if(inputString == null) {
			throw new CustomException("String can't be null.");
		}
		
		int result;
		inputString = inputString.toUpperCase();
		
		if(cacheMemory.isPresent(inputString)) {
			result = cacheMemory.getResult(inputString);
		} else {
			result = compute(inputString);
			cacheMemory.saveResult(inputString, result);
		}
		return result;
	}
	
	/**
	 * compute unique characters in given string by using set.
	 * @param inputString
	 * @return unique characters
	 */
	private Integer compute(String inputString) {
		
		Set<Character> unique = new HashSet<Character>();
		
		for(char character : inputString.toCharArray()) {
			unique.add(character);
		}

		return unique.size();
	}
}
