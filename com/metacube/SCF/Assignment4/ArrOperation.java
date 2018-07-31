package GET2018.com.metacube.SCF.Assignment4;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 * This class is created to perform following operation on array
 * 1. Return the size of the largest mirror section found in the input array.
 * 2. Return the number of clumps in the input array.
 * 3. Solve fixXY problem
 * 4. Split Array such that 
 * 
 * @author Chirag Jain
 *
 */
public class ArrOperation {
	
	/**
	 * This function returns the size of the largest mirror section found in the input array.
	 * @param inputArray is the array given by the user.
	 * @return length of largest mirror section.
	 */
	public int findLargestMirror(int[] inputArray) {
		
		if(inputArray == null) {
			throw new AssertionError("Array can't be null.");
		}
		if(inputArray.length == 0) {
			throw new AssertionError("Array can't be empty.");
		}
		
		int arrayLength = inputArray.length;
		
		int maxMirrorLength = 0;
			
		for(int i=0; i<arrayLength-1; i++) {
			int mirrorLength = 0;

			for(int j=arrayLength-1; j>i; j--) {				
				int front = i;
				int back = j;
				
				while(inputArray[front] == inputArray[back] && front <= back) {
					mirrorLength++;
					front++;
					back--;
				}
				
				if(front - back == 2) {
					mirrorLength = (mirrorLength * 2) - 1;
				}
				
				if(mirrorLength > maxMirrorLength) {
					maxMirrorLength = mirrorLength;
				}
			}
		}
		return maxMirrorLength;
	}
	
	/**
	 * This function counts total number of clumps in the input array.
	 * @param inputArray is the array given by the user.
	 * @return total number of clumps in the input array.
	 */
	public int countClumps(int[] inputArray) {
		
		if(inputArray == null) {
			throw new AssertionError("Array can't be null.");
		}
		if(inputArray.length == 0) {
			throw new AssertionError("Array can't be empty.");
		}
		
		int arrayLength = inputArray.length;
		int totalClumps = 0;
			
		for(int i=0; i<arrayLength-1; i++) {
			if(inputArray[i] == inputArray[i+1]) {
				totalClumps++;
				while( (inputArray[i] == inputArray[i+1]) && (i+1 != arrayLength-1) ) {
					i++;
				}
			}
		}	
		return totalClumps;
	}
		
	/**
	 * This is utility function to swap to elements.
	 * @param inputArray is the array given by the user.
	 * @param x is element 1.
	 * @param y is element 2.
	 * @param indexOfX is index of element 1.
	 * @return array after swapping x element 1 and element 2.
	 */
	public int[] swap(int[] inputArray, int x, int y, int indexOfX) {
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] == y && i == 0) {
				int temp = inputArray[indexOfX+1];
				inputArray[indexOfX + 1] = inputArray[i];
				inputArray[i] = temp;
				return inputArray;
			}
			else if(inputArray[i] == y && inputArray[i-1] != x) {
				int temp = inputArray[indexOfX+1];
				inputArray[indexOfX + 1] = inputArray[i];
				inputArray[i] = temp;
				return inputArray;
			}
		}
		throw new AssertionError("Values of X and Y must be equal.");
	}
	
	/**
	 * This function rearranges array so that every X is immediately followed by a Y.
	 * @param inputArray is the array given by the user.
	 * @param x is element 1.
	 * @param y is element 2.
	 * @return rearranged array so that every X is immediately followed by a Y.
	 */
	public int[] fixXY(int[] inputArray, int x, int y) {
		
		if(inputArray == null) {
			throw new AssertionError("Array can't be null.");
		}
		if(inputArray.length == 0) {
			throw new AssertionError("Array can't be empty.");
		}
		
		int xCount = 0;
		int yCount = 0;
		
		int arrayLength = inputArray.length;
		
		if(inputArray[arrayLength-1] == x) {
			throw new AssertionError("Last element can't be equal to x.");
		}
		
		for (int i = 0; i < arrayLength; i++) {
			if (inputArray[i] == x) {
				xCount++;
			}
			if(inputArray[i] == y) {
				yCount++;
			}
		}
		
		if (xCount != yCount) {
			throw new AssertionError("Occurence of X and Y not equal.");
		}
		
		int indexOfX;
		for (int i = 0; i < arrayLength-1; i++) {
			if (inputArray[i] == x) {
				if (inputArray[i + 1] == x) {
					throw new AssertionError("Two X values can't be together.");
				}
				indexOfX = i;
				swap(inputArray, x, y, indexOfX);
			}
		}
		return inputArray;
	}
	
	/**
	 * This function finds the index where sum of the numbers is equal on both side else return -1
	 * @param inputArray is the array given by the user.
	 * @return the index where sum of the numbers is equal on both side else return -1
	 */
	public int splitArray(int[] inputArray) {
		
		if(inputArray == null) {
			throw new AssertionError("Array can't be null.");
		}
		if(inputArray.length == 0) {
			throw new AssertionError("Array can't be empty.");
		}
		
		int arrayLength = inputArray.length;
		
		int totalArraySum = 0;
		for(int i=0; i<arrayLength; i++) {
			totalArraySum += inputArray[i];
		}
		
		int splitIndex = -1;
		int remainingArraySum = totalArraySum;
		int traversedArraySum = 0;
		
		for(int i=0; i<arrayLength; i++) {
			remainingArraySum -= inputArray[i];
			traversedArraySum += inputArray[i];
			
			if(traversedArraySum == remainingArraySum) {
				return i+1;
			}
		}
		return splitIndex;			
	}
	
}