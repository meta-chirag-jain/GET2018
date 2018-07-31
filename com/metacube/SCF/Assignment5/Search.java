package GET2018.com.metacube.SCF.Assignment5;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class search for element in array
 * @author Chirag Jain
 * 
 */
public class Search {

	/**
	 * This function implement linear search using recursion.
	 * @param inputArray is input array.
	 * @param index is current index.
	 * @param x is element to search.
	 * @return index of x or -1 if not found.
	 */
	public int linearSearch(int[] inputArray, int index, int x) {

		if(inputArray == null) {
			throw new AssertionError("Array cant be null");
		}
		if(inputArray.length == 0) {
	    	throw new AssertionError("Array is empty");
	    }
		if(index < 0) {
			throw new AssertionError("Index cant be negative.");
		}
		
		if (inputArray.length == 0 || inputArray.length == index) {
			return -1;
		}
		if (inputArray[index] == x) {
			return index;
		}
		return linearSearch(inputArray, index + 1, x);
	}

	
	/**
	 * searches the element in an array using divide and conquer approach 
	 * throws AssertionError if array is empty
	 * @param array, assumes array to be sorted
	 * @param leftIndex
	 * @param rightIndex
	 * @param valueToSearch
	 * @return index at which the element is present, -1 if not present
	 */
	public int binarySearch(int[] array, int leftIndex, int rightIndex, int valueToSearch)
	{
		if(array == null) {
			throw new AssertionError("Array cant be null");
		}
	    if(array.length == 0) {
	    	throw new AssertionError("Array is empty");
	    }
	    if(leftIndex < 0 || rightIndex < 0) {
			throw new AssertionError("Index cant be negative.");
		}
		if (leftIndex > rightIndex)
			return -1;
		
		int mid = (leftIndex + rightIndex) / 2;
		
		if (array[mid] == valueToSearch)
		    return mid;
		else if (array[mid] > valueToSearch)
			return binarySearch(array, 0, mid - 1, valueToSearch);
		else
			return binarySearch(array, mid + 1, rightIndex, valueToSearch);
	}
}