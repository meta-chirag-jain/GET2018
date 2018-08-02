package GET2018.com.metacube.SCF.Assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class tests NQueenProblem Class
 * @author Chirag Jain
 * 
 */
public class NQueenProblemTest {

	NQueenProblem solve = new NQueenProblem();
	
	/**
	 * checks when board is greater than zero size.
	 */
	@Test
	public void nQueenTest1() {
		boolean actual = solve.solveNQ(4);
		assertEquals(true, actual);
		
		actual = solve.solveNQ(3);
		assertEquals(false, actual);
		
		actual = solve.solveNQ(8);
		assertEquals(true, actual);
		
		actual = solve.solveNQ(1);
		assertEquals(true, actual);
	}
	
	/**
	 * checks when board is zero size.
	 */
	@Test(expected = AssertionError.class)
	public void nQueentest2() {
		boolean actual = solve.solveNQ(0);
		assertEquals(true, actual);

	}

}