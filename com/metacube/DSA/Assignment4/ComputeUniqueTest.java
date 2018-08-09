package GET2018.com.metacube.DSA.Assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputeUniqueTest {

	private ComputeUnique uniques = new ComputeUnique();
	
	@Test
	public void allDifferentChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("abcefg");
		
		assertEquals((Integer)6, uniqueResult);
	}

	@Test
	public void sameAndCapitalChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("abcAfc");
		
		assertEquals((Integer)4, uniqueResult);
	}
	
	@Test
	public void specialCharacterAndNumericChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("abc4dB#?");
		
		assertEquals((Integer)7, uniqueResult);
	}
	
	@Test
	public void withSpaceChartest() throws CustomException {
		Integer uniqueResult = uniques.computeUnique("abc dB ?");
		
		assertEquals((Integer)6, uniqueResult);
	}
	
	@Test
	public void cachePresencetest() throws CustomException {
		uniques.computeUnique("abcefg");

		assertTrue(uniques.getCacheMemory().isPresent("abcefg".toUpperCase()));
		assertFalse(uniques.getCacheMemory().isPresent("ab4g".toUpperCase()));
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
