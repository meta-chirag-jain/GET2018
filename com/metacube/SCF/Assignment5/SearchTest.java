package GET2018.com.metacube.SCF.Assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class test search class.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
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

		actual = searchObject.linearSearch(new int[] {}, 0, 4);
		assertEquals(-1, actual);

		actual = searchObject.linearSearch(new int[] { 4, 2, 3, 4 }, 0, 4);
		assertEquals(0, actual);
		
		actual = searchObject.linearSearch(new int[] { 1, 2, 3, 4 }, 0, 5);
		assertEquals(-1, actual);
	}

	/**
	 * Function for binary search test.
	 */
	public void binaryTest() {
		Search searchObject = new Search();
		int actual = searchObject.binarySearch(new int[] { 1, 2, 3, 4 }, 0, 4, 1);
		assertEquals(0, actual);

		actual = searchObject.binarySearch(new int[] {}, 0, 0, 4);
		assertEquals(-1, actual);

		actual = searchObject.binarySearch(new int[] { 1, 2, 3, 4 }, 0, 4, 4);
		assertEquals(3, actual);
		
		actual = searchObject.binarySearch(new int[] { 1, 2, 3, 4 }, 0, 4, 5);
		assertEquals(-1, actual);
	}
}
