package GET2018.com.metacube.SCF.Assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class test search class.
 * @author Chirag Jain
 * 
 */
public class SearchTest {

	/**
	 * Function for linear search test.
	 */
	@Test
	public void linearTest() {
		Search searchObject = new Search();
		int actual = searchObject.linearSearch(new int[] { 1, 2, 3, 4 }, 0, 4);
		assertEquals(3, actual);

		

		actual = searchObject.linearSearch(new int[] { 4, 2, 3, 4 }, 0, 4);
		assertEquals(0, actual);
		
		actual = searchObject.linearSearch(new int[] { 1, 2, 3, 4 }, 0, 5);
		assertEquals(-1, actual);
	}
	
	//null linear
	@Test(expected = AssertionError.class)
	public void linearNullArrayTest() {
		Search searchObject = new Search();
		int actual = searchObject.linearSearch(null, 0, 4);
		assertEquals(3, actual);
	}
	
	//empty array
	@Test(expected = AssertionError.class)
	public void linearEmptyArrayTest() {
		Search searchObject = new Search();
		int actual = searchObject.linearSearch(new int[] {}, 0, 4);
		assertEquals(-1, actual);
	}
	
	//negative index
	@Test(expected = AssertionError.class)
	public void linearNegativeIndexTest() {
		Search searchObject = new Search();
		int actual = searchObject.linearSearch(new int[] { 4, 2, 3, 4 }, -1, 4);
		assertEquals(3, actual);
	}

	/**
	 * Function for binary search test.
	 */
	@Test
	public void binaryTest() {
		Search searchObject = new Search();
		int actual = searchObject.binarySearch(new int[] { 1, 2, 3, 4 }, 0, 3, 1);
		assertEquals(0, actual);

		actual = searchObject.binarySearch(new int[] { 1, 2, 3, 4 }, 0, 3, 4);
		assertEquals(3, actual);
		
		actual = searchObject.binarySearch(new int[] { 1, 2, 3, 4 }, 0, 3, 5);
		assertEquals(-1, actual);
	}
	
	//null binary
	@Test(expected = AssertionError.class)
	public void binaryNullArrayTest() {
		Search searchObject = new Search();
		int actual = searchObject.binarySearch(null, 0, 4, 1);
		assertEquals(0, actual);
	}
	//empty array
	@Test(expected = AssertionError.class)
	public void binaryEmptyArrayTest() {
		Search searchObject = new Search();
		int actual = searchObject.binarySearch(new int[] {  }, -2, 4, 1);
		assertEquals(0, actual);
	}
	//negative index
	@Test(expected = AssertionError.class)
	public void binaryNegativeIndexTest() {
		Search searchObject = new Search();
		int actual = searchObject.binarySearch(new int[] { 1, 2, 3, 4 }, -2, 4, 1);
		assertEquals(0, actual);
	}
	
}
