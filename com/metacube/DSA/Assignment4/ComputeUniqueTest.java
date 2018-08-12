package GET2018.com.metacube.DSA.Assignment4;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * Test case for compute unique class.
 * @author Chirag Jain
 * 
 */
public class ComputeUniqueTest {

	private ComputeUnique uniques = new ComputeUnique();
	
	@Test
	public void allDifferentChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("chirag");
		
		assertEquals((Integer)6, uniqueResult);
	}

	@Test
	public void sameAndCapitalChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("chiragjAIn");
		
		assertEquals((Integer)8, uniqueResult);
	}
	
	@Test
	public void specialCharacterAndNumericChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("M0H!TSh4RM@");
		
		assertEquals((Integer)9, uniqueResult);
	}
	
	@Test
	public void withSpaceChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("chirag ja?n");
		
		assertEquals((Integer)10, uniqueResult);
	}
	
	@Test
	public void cachePresencetest() throws CustomException {
		uniques.computeUnique("chirag");

		assertTrue(uniques.getCacheMemory().isPresent("chirag".toUpperCase()));
		assertFalse(uniques.getCacheMemory().isPresent("rahul".toUpperCase()));
	}
	
	@Test
	public void allSpaceChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("    ".toUpperCase());
		
		assertEquals((Integer)1, uniqueResult);
	}
	
	@Test
	public void nullChartest() {
		try {
			@SuppressWarnings("unused")
			Integer uniqueResult = uniques.computeUnique(null);
		}
		catch(CustomException error) {
			assertEquals("String can't be null.", error.getMessage());
		}
	
	}
}
