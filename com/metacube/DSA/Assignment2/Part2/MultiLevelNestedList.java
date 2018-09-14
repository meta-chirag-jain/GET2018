package GET2018.com.metacube.DSA.Assignment2.Part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class define function for implementing multi level Nested List
 * @author Chirag Jain
 * 
 */
public class MultiLevelNestedList implements INestedList
{
    @SuppressWarnings("unused")
	private List<Object> nestedList = new ArrayList<Object>(); 

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public MultiLevelNestedList(Object object)
    {
    	nestedList = (List) object;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int listSum(List<Object> object)
    {
        int sum = 0;
        for(Object iterator : object) {
            if(iterator instanceof List) {
                sum += listSum((List<Object>) iterator);
            } else if(iterator instanceof Integer) {
                sum += (Integer)iterator;
            } else {
            	throw new AssertionError("not integer");
            }
        }        
        return sum;
    }

	@SuppressWarnings("unchecked")
	@Override
	public int largestElement(List<Object> object) {
		int max = -999;
		int maxInList;
        for(Object iterator : object) {
            if(iterator instanceof List) {
            	maxInList = largestElement((List<Object>) iterator);
                if(maxInList > max) {
                	max = maxInList;
                }
            } else if(iterator instanceof Integer) {
            	if((Integer)iterator > max) {
            		max = (Integer)iterator;            	
            	}                
            } else {
            	throw new AssertionError("not integer");
            }
        }        
        return max;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean searchElement(List<Object> object, int elementToSearch) {
		boolean flag = false;
        for(Object iterator : object) {
            if(iterator instanceof List) {
            	if(searchElement((List<Object>) iterator, elementToSearch)){
            		return true;
            	}
            } else if(iterator instanceof Integer) {
                if(elementToSearch == (Integer)iterator) {
                	flag = true;
                	return flag;
                }
            } else {
            	throw new AssertionError("not integer");
            }
        }        
        return flag;
	}
}
