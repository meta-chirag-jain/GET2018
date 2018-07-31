package GET2018.com.metacube.SCF.Assignment5;

/**
 * This class search for element in array
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
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

		if (inputArray.length == 0 || inputArray.length == index) {
			return -1;
		}
		if (inputArray[index] == x) {
			return index;
		}
		return linearSearch(inputArray, index + 1, x);
	}

	/**
	 * This function implement binary search using recursion.
	 * @param inputArray is input array.
	 * @param firstIndex is starting index.
	 * @param lastIndex is last index.
	 * @param x is element to search.
	 * @return index of x or -1 if not found.
	 */
	public int binarySearch(int[] inputArray, int firstIndex, int lastIndex, int x) {
		if (firstIndex >= lastIndex || inputArray.length == 0) {
			return -1;
		}
		int mid = (firstIndex + lastIndex) / 2;
		if (inputArray[mid] == x) {
			return mid;
		} else if (inputArray[mid] >= x) {
			binarySearch(inputArray, firstIndex, mid - 1, x);
		} else if (inputArray[mid] <= x) {
			binarySearch(inputArray, mid + 1, lastIndex, x);
		}
		return mid;
	}
}