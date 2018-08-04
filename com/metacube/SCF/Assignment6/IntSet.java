package GET2018.com.metacube.SCF.Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This immutable class create Set using an array to represent a set of integers in the range 1-1000.
 * @author Chirag Jain
 * 
 */
public final class IntSet {

	private final List<Integer> set;

	public IntSet(List<Integer> inputList) {
		if(inputList == null) {
			throw new AssertionError("Set can't be null");
		}
		
		Collections.sort(inputList);
		
		this.set = removeNotInRange(inputList);
	}
	
	/**
	 * This function removes elements which are not in range 1-1000 and are repeated.
	 * @param givenArray is the array passed.
	 * @return array after removing elements not in range 1-1000 and are repeated.
	 */
	private List<Integer> removeNotInRange(List<Integer> inputList)
	{
	    for (int i = 0; i < inputList.size(); i++) {
	    	if(inputList.indexOf(inputList.get(i)) != -1 && (inputList.get(i) < 1 || inputList.get(i) > 1000)) {
	        	inputList.remove(i);
	        	i--;
	        }
	    }
	    return inputList;
	}
	

	/**
	 * @return length of set.
	 */
	public int size() {
		return set.size();
	}

	/**
	 * @return set array.
	 */
	public List<Integer> getSet() {
		return set;
	}
	
	/**
	 * This function checks if given variable is member of set.
	 * @param x is passed variable
	 * @return yes if x is member of set else false.
	 */
	public boolean isMember(int x) {
		if (set.indexOf(x) != -1) {
			//System.out.println(set.indexOf(x));
				return true;
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
		List<Integer> complementSet = new ArrayList<Integer>();
		for (int i = 1; i <= 1000; i++) {
			if(set.indexOf(i) == -1) {
				complementSet.add(i);
			}
		}		
		return new IntSet(complementSet);
	}
	
	/**
	 * This function checks if passed set is subset of given set.
	 * @param s is passed set.
	 * @return yes if passed set is subset else false.
	 */
	boolean isSubSet(IntSet subSet) {
		if(subSet.size() > set.size()) {
			return false;
		}
		
		for (int i = 0; i < subSet.size(); i++) {
			if(set.indexOf(subSet.getSet().get(i)) == -1) {
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
		
		List<Integer> unionSet = new ArrayList<Integer>();	
		
		for(int i = 0; i < s1.size(); i++) {
			unionSet.add(s1.getSet().get(i));
		}
		
		for(int i = 0; i < s2.size(); i++) {
			if(unionSet.indexOf(s2.getSet().get(i)) == -1) {
				unionSet.add(s2.getSet().get(i));
			}
		}		
		return new IntSet(unionSet);
	}

}
