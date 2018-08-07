package GET2018.com.metacube.DSA.Assignment2.Part2;

import java.util.List;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This interface declares function for implementing two level Nested List
 * @author Chirag Jain
 * 
 */
public interface INestedList {

	/** 
	 * @param object is nested list.
	 * @return sum of all elements in nested list.
	 */
	public int listSum(List<Object> object);
	
	/**
	 * @param object is nested list.
	 * @return largest element in nested list
	 */
	public int largestElement(List<Object> object);
	
	/**
	 * @param object is nested list.
	 * @param elementToSearch is element to be searched in list
	 * @return index of element in nested list
	 */
	public boolean searchElement(List<Object> object, int elementToSearch);

}
