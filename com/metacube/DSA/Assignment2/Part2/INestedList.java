package GET2018.com.metacube.DSA.Assignment2.Part2;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This interface declares function for implementing two level Nested List
 * @author Chirag Jain
 * 
 */
public interface INestedList {

	/**
	 * 
	 * @return sum of all elements in nested list
	 */
	public int listSum();
	
	/**
	 * 
	 * @return largest element in nested list
	 */
	public int largestElement();
	
	/**
	 * 
	 * @param elementToSearch is element to be searched in list
	 * @return index of element in nested list
	 */
	public int[] searchElement(int elementToSearch);

}
