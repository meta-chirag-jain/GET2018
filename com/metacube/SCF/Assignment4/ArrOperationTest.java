package GET2018.com.metacube.SCF.Assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class is created to test ArrOperation class.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public class ArrOperationTest {
	
	ArrOperation arrayOperation = new ArrOperation();

	/**
     * Test case for largestMirrorSection if array is empty
     */
	@Test(expected = AssertionError.class)
	public void findLargestMirrorEmptyArrayTest() {
		arrayOperation.findLargestMirror(new int[]{ });
	}
	
	/**
     * Test case for largestMirrorSection if array is not empty
     */
	@Test
	public void findLargestMirrorTest() {
		int mirrorLength = arrayOperation.findLargestMirror(new int[]{-4, 5, -4 });
		assertEquals("negative failure", 3, mirrorLength);
		
		mirrorLength = arrayOperation.findLargestMirror(new int[]{7, 1, 4, 9, 7, 4, 1});
		assertEquals("failure 3", 2, mirrorLength);
		
		mirrorLength = arrayOperation.findLargestMirror(new int[]{1, 4, 5, 3, 5, 4, 1});
		assertEquals("failure 1", 7, mirrorLength);
		
		mirrorLength = arrayOperation.findLargestMirror(new int[]{1, 4, 1, 2});
		assertEquals("failure 2", 3, mirrorLength);
	}
	
	/**
     * Test case for noOfClumps if array is not empty
     */
	@Test
    public void countClumpsTest() {    
        int noOfClumps = arrayOperation.countClumps(new int[]{1, 2, 2, 3, 4, 4});
        assertEquals(2, noOfClumps);
        
        noOfClumps = arrayOperation.countClumps(new int[]{1, 1, 2, 1, 1});
        assertEquals(2, noOfClumps);
        
        noOfClumps = arrayOperation.countClumps(new int[]{1, 1, 1, 1, 1});
        assertEquals(1, noOfClumps);
    }
    
	/**
     * Test case for noOfClumps if array is empty
     */
    @Test(expected = AssertionError.class)
    public void countClumpsEmptyArrayTest() {
        arrayOperation.countClumps(new int[]{});
    }
    
    

    /**
     * Test case for fixXY if array can be rearranged
     */
    @Test
    public void fixXYTest() {
        
        int[] fixXY = arrayOperation.fixXY(new int[]{5, 4, 9, 4, 9, 5}, 4, 5);
        assertArrayEquals(new int[]{9, 4, 5, 4, 5, 9}, fixXY);

        fixXY = arrayOperation.fixXY(new int[]{5, 4, 9, 8, 4, 9, 5}, 4, 5);
        assertArrayEquals(new int[]{9, 4, 5, 8, 4, 5, 9}, fixXY);

        fixXY = arrayOperation.fixXY(new int[]{1, 4, 1, 5}, 4, 5);
        assertArrayEquals(new int[]{1, 4, 5, 1}, fixXY);
        
        fixXY = arrayOperation.fixXY(new int[]{1, 4, 1, 5, 5, 4, 1}, 4, 5);
        assertArrayEquals(new int[]{1, 4, 5, 1, 1, 4, 5}, fixXY);
    }
    
    
    /**
     * Test case for fixXY if array is empty
     */
    @Test(expected = AssertionError.class)
    public void fixXYTest1() {
       
        int[] fixXY = arrayOperation.fixXY(new int[]{},4,5);
        assertEquals(1, fixXY);
    }
    
    
    /**
     * Test case for fixXY if array cannot be rearranged because of two adjacent X
     */
    @Test(expected = AssertionError.class)
    public void fixXYTest2() {
   
        int[] fixXY = arrayOperation.fixXY(new int[]{1, 4, 4, 5, 3, 5, 1}, 4, 5);
        assertEquals(1, fixXY);
    }
    
    
    /**
     * Test case for fixXY if array cannot be rearranged because X is at last position
     */
    @Test(expected = AssertionError.class)
    public void fixXYTest3() {
   
        int[] fixXY = arrayOperation.fixXY(new int[]{1, 5, 1, 4}, 4, 5);
        assertEquals(1, fixXY);
    }
    
    
    /**
     * Test case for fixXY if array cannot be rearranged because of unequal X & Y
     */
    @Test(expected = AssertionError.class)
    public void fixXYTest4() {
   
        int[] fixXY = arrayOperation.fixXY(new int[]{1, 4, 1, 5, 3, 4, 1}, 4, 5);
        assertEquals(1, fixXY);
    }
    
    /**
     * Test case for fixXY if array cannot be rearranged because of unequal X & Y
     */
    @Test(expected = AssertionError.class)
    public void fixXYTest5() {
   
        int[] fixXY = arrayOperation.fixXY(new int[]{1, 4, 1, 5, 3, 5, 4, 1, 5}, 4, 5);
        assertEquals(1, fixXY);
    }
    
    /**
	 * Test case for splitArray if array can be split
	 */
	@Test
	public void splitArrayTest1() {
		
		int splitIndex = arrayOperation.splitArray(new int[]{1, 1, 1, 2, 1});
		assertEquals(3, splitIndex);
		
		splitIndex = arrayOperation.splitArray(new int[]{10, 10});
        assertEquals(1, splitIndex);
	}
	
	/**
	 * Test case for splitArray if array cannot be split
	 */
	@Test
	public void splitArrayTest2() {
		
		int splitIndex = arrayOperation.splitArray(new int[]{2, 1, 1, 2, 1});
		assertEquals(-1, splitIndex);
	}
	
	/**
	 * Test case for splitArray if array is empty
	 */
	@Test(expected = AssertionError.class)
	public void splitArrayTest3() {
		
		int splitIndex = arrayOperation.splitArray(new int[]{});
		assertEquals(1, splitIndex);
	}
}
