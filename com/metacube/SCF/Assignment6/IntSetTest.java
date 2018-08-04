package GET2018.com.metacube.SCF.Assignment6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This test file is created to test intset class.
 * @author Chirag Jain
 * 
 */
public class IntSetTest {

	/**
     * Test case for isMember(int x) when x is a member
     */
    @org.junit.Test
    public void isMemberTrueTest() {
        
        IntSet set = new IntSet(new ArrayList<Integer>(Arrays.asList(1, 2, 0, 2, 2000, 5)));
        
        boolean member = set.isMember(2);
        assertTrue(member);
        
    }
    
    /**
     * Test case for isMember(int x) when x is not a member
     */
    @org.junit.Test
    public void isMemberFalseTest() {
        
        IntSet set = new IntSet(new ArrayList<Integer>(Arrays.asList(1, 2, 0, 2, 2000, 5)));
    
        boolean member = set.isMember(100);
        assertFalse(member);
        
        member = set.isMember(2000);
        assertFalse(member);
        
    }
    
   
    /**
     * Test case for size() 
     */
    @org.junit.Test
    public void sizeTest() {
        
        IntSet set = new IntSet(new ArrayList<Integer>(Arrays.asList(4, 1, 9, 2000, 5)));
        int size = set.size();
        assertEquals(4, size);
    }
    
    
    /**
     * Test case for size() when input is null
     */
    @org.junit.Test(expected = AssertionError.class)
    public void sizeNullTest() {
        
        IntSet set = new IntSet(null);
        int size = set.size();
        assertEquals(4, size);
    }
    
    
    /**
     * Test case for size() when set is empty
     */
    @org.junit.Test
    public void sizeEmptyTest() {
        
        IntSet set = new IntSet(new ArrayList<Integer>());
        int size = set.size();
        assertEquals(0, size);
    }
    
    
    /**
     * Test case for isSubSet(IntSet s) when s is the subset of set
     */
    @org.junit.Test
    public void isSubSetTrueTest() {
        
        IntSet set1 = new IntSet(new ArrayList<Integer>(Arrays.asList(4, 1, 9, 2000, 5)));
        IntSet set2 = new IntSet(new ArrayList<Integer>(Arrays.asList(9, 1)));
        boolean isSubSet = set1.isSubSet(set2);
        assertTrue(isSubSet);
    }
    
    
    /**
     * Test case for isSubSet(IntSet s) when s is not the subset of set
     */
    @org.junit.Test
    public void isSubSetFalseTest() {
        
        IntSet set1 = new IntSet(new ArrayList<Integer>(Arrays.asList(4, 1, 9, 2000, 5)));
        IntSet set2 = new IntSet(new ArrayList<Integer>(Arrays.asList(9, 1, 7)));
        boolean isSubSet = set1.isSubSet(set2);
        assertFalse(isSubSet);
    }
    
    
    /**
     * Test case for isSubSet(IntSet s) when s is the empty set
     */
    @org.junit.Test
    public void isEmptySubSetTest() {
        
        IntSet set1 = new IntSet(new ArrayList<Integer>(Arrays.asList(4, 1, 9, 2000, 5)));
        IntSet set2 = new IntSet(new ArrayList<Integer>(Arrays.asList(4, 1, 9, 2000, 5)));
        boolean isSubSet = set1.isSubSet(set2);
        assertTrue(isSubSet);
    }    
    
    
    /**
     * Test case for getComplement()
     */
    @org.junit.Test
    public void getComplementTest() {
        
        IntSet set = new IntSet(new ArrayList<Integer>(Arrays.asList(4, 1, 9, 2000, 5)));
        IntSet complement = set.getComplement();
        assertEquals(996, complement.size());
    }
    
    
    /**
     * Test case for union
     */
    @org.junit.Test
    public void unionTest() {
        IntSet set1 = new IntSet(new ArrayList<Integer>(Arrays.asList(4, 1, 9, 2000, 5)));
        IntSet set2 = new IntSet(new ArrayList<Integer>(Arrays.asList(4, 1, 9, 31, 20, 5)));
        
        IntSet union = IntSet.union(set1, set2);
        List<Integer> actual = union.getSet();
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 9, 20, 31));
        assertEquals(expected, actual);
    }
}
