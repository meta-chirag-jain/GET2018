package GET2018.com.metacube.SCF.Assignment6;

import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;

/**
 * This immutable class create Set using an array to represent a set of integers in the range 1-1000.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public final class IntSet {

	private final int[] set;

	public IntSet(int[] inputArray) {
		if(inputArray == null) {
			throw new AssertionError("Set can't be null");
		}
		
		Arrays.sort(inputArray);
		int[] tempSet = removeUnwanted(inputArray);
		
		int[] finalSet = removeZero(tempSet);
		
		this.set = finalSet;	
	}
	
	/**
	 * This function removes elements which are not in range 1-1000 and are repeated.
	 * @param givenArray is the array passed.
	 * @return array after removing elements not in range 1-1000 and are repeated.
	 */
	private int[] removeUnwanted(int[] givenArray)
	{
		
		int n = givenArray.length;

	    if (n==0 || n==1){
	    	return givenArray;
	    }

	    int[] temp = new int[n];

	    // Start repeated elements and which are not in [1-1000]
	    int length = 0;
	    for (int i = 0; i < n-1; i++) {
	    	if (givenArray[i] != givenArray[i+1] && givenArray[i] >= 1 && givenArray[i] <= 1000) {
	        	temp[length++] = givenArray[i];
	        }
	    }

	    // Store the last element as whether
	    // it is unique or repeated, it hasn't
	    // stored previously
	    if (givenArray[n-1] >= 1 && givenArray[n-1] <= 1000) {
	    	temp[length++] = givenArray[n-1];
        }
	    return temp;
	}
	
	/**
	 * This function removes trailing zeros at the end of array left after other operations.
	 * @param givenArray
	 * @return array after removing trailing zeros.
	 */
	private int[] removeZero(int[] givenArray) {
		int length = 0;
		for(int i =0; i < givenArray.length && givenArray[i] != 0; i++) {
			length++;
		}
		
		int[] finalSet = new int[length];
		for(int i =0; i < length; i++) {
			finalSet[i] = givenArray[i];
		}
		
		return finalSet;		
	}

	/**
	 * @return length of set.
	 */
	public int size() {
		return set.length;
	}

	/**
	 * @return set array.
	 */
	public int[] getSet() {
		return set;
	}
	
	/**
	 * This function checks if given variable is member of set.
	 * @param x is passed variable
	 * @return yes if x is member of set else false.
	 */
	public boolean isMember(int x) {
		for (int i = 0; i < set.length; i++) {
			if (set[i] == x) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This function computes complement set.
	 * @param s1 is set 1.
	 * @param s2 is set 2.
	 * @return complement set object.
	 */
	public IntSet getComplement() {
		int[] complement = new int[1000 - set.length];
		for (int i = 1, j = 0, k = 0; i <= 1000; i++) {
			if(set[j] == i) {
				if(j + 1 < set.length)
					j++;
			} else {
				complement[k] = i;
				k++;
			}
		}
		IntSet complementSet = new IntSet(complement);
		return complementSet;
	}
	
	/**
	 * This function checks if passed set is subset of given set.
	 * @param s is passed set.
	 * @return yes if passed set is subset else false.
	 */
	boolean isSubSet(IntSet s) {
		if(s.size() > set.length) {
			return false;
		}
		
		boolean flag ;
		for(int i = 0; i < s.size(); i++) {
			flag = false;
			for(int j = 0; j < set.length; j++ ) {
				if(s.set[i] == set[j]) {
					flag = true;
				}
			}
			if(!flag) {
				return false;
			}			
		}
		return true;
	}
	
	/**
	 * This function find union of given sets.
	 * @param s1 is passed set 1.
	 * @param s2 is passed set 2.
	 * @return union of 2 sets.
	 */
	public static IntSet union(IntSet s1, IntSet s2) {
		int length = s1.size() + s2.size();
		int[] unionSet = new int[length];
		
		for(int i = 0; i < s1.size(); i++) {
			unionSet[i] = s1.getSet()[i];
		}
		
		for(int i = s1.size(), j = 0; i < length; i++, j++) {
			unionSet[i] = s2.getSet()[j];
		}
		
		return new IntSet(unionSet);
	}
	
	/**
	 * alternate union method using List.
	 */
	/*private void addNoDups(List<Integer> toAddTo,List<Integer> iterateOver) {
	    for(Integer num:iterateOver){
	        if(toAddTo.indexOf(num) == -1) {
	            toAddTo.add(num);
	        }
	    }
	    //System.out.println(Arrays.toString(toAddTo.toArray()));
	}
	
	
	public IntSet union(IntSet s1, IntSet s2) {
		
		List<Integer> s1List = new ArrayList<Integer>();
		List<Integer> s2List = new ArrayList<Integer>();
		
		for (int i : s1.getSet())
		{
			s1List.add(i);
		}
		
		for (int i : s2.getSet())
		{
			s2List.add(i);
		}
		
		addNoDups(s1List,s2List);
		
		int[] unionSet = new int[s1List.size()];
		
		for (int index = 0; index < s1List.size(); index++)
		{
			unionSet[index] = s1List.get(index);
		}		
		
		//for(int i = 0; i < unionSet.length; i++) {
		//	System.out.println(unionSet[i]);
		//}
	
		return new IntSet(unionSet);
	}*/
	
}
