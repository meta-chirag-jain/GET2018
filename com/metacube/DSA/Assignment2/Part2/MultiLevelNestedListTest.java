package GET2018.com.metacube.DSA.Assignment2.Part2;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class define tests function of MultiLevelNestedList class.
 * @author Chirag Jain
 * 
 */
public class MultiLevelNestedListTest
{

    List<Object> inputList = asList(1, 2, 3, asList( 4, 5, asList(16, 17)), 11, 13, 12, asList(6, 7, 8, 9), 10, asList( 15, 14));
    
    List<Object> inputListWithCharacter = asList(1, 2, 3, asList( 4, 5, asList(16, 17, 'c')), 11, 13, 12, asList(6, 7, 8, 9), 10, asList( 15, 14));
    
    MultiLevelNestedList multiLevelNestedList = new MultiLevelNestedList(inputList);
    
    /**
     * checks sum of nested list
     */
    @Test
    public void sumTest()
    {
        int sumOfList = multiLevelNestedList.listSum(inputList);
        assertEquals(153, sumOfList);
    }
    
    /**
     * checks sum of nested list when list has input other than integer and list.
     */
    @Test(expected = AssertionError.class)
    public void sumTestWithError()
    {
        int sumOfList = multiLevelNestedList.listSum(inputListWithCharacter);
        assertEquals(153, sumOfList);
    }
    
    /**
     * checks largest element in list.
     */
    @Test
    public void largestElementTest()
    {
        int largestInList = multiLevelNestedList.largestElement(inputList);
        assertEquals(17, largestInList);
    }

    /**
     * checks largest element in list when list has input other than integer and list.
     */
    @Test(expected = AssertionError.class)
    public void largestElementWithErrorTest()
    {
        int largestInList = multiLevelNestedList.largestElement(inputListWithCharacter);
        assertEquals(17, largestInList);
    }
    
    /**
     * checks presence of element when element is present.
     */
    @Test
    public void searchElementTest()
    {
        boolean searchResult = multiLevelNestedList.searchElement(inputList, 13);
        assertTrue(searchResult);
    }
    /**
     * checks presence of element when element is absent.
     */
    @Test
    public void searchElementFalseTest()
    {
        boolean searchResult = multiLevelNestedList.searchElement(inputList, 45);
        assertFalse(searchResult);
    }
   
    /**
     * checks presence of element when element is present in nested list.
     */
    @Test
    public void searchElementInListTest()
    {
        boolean searchResult = multiLevelNestedList.searchElement(inputList, 17);
        assertTrue(searchResult);
    }
    
    /**
     * checks presence of element when list has input other than integer and list.
     */
    @Test(expected = AssertionError.class)
    public void searchElementWithErrorTest()
    {
        boolean searchResult = multiLevelNestedList.searchElement(inputListWithCharacter, 210);
        assertFalse(searchResult);
    }

}
