package GET2018.com.metacube.DSA.Assignment3;

import java.util.HashSet;
import java.util.Set;

public class ComputeUnique {

	private CacheMemory cacheMemory = new CacheMemory();
	
	public CacheMemory getCacheMemory() {
		return cacheMemory;
	}

	public Integer computeUnique(String inputString) throws CustomException {
		if(inputString == null) {
			throw new CustomException("String can't be null.");
		}
		
		int result;
		inputString = inputString.toUpperCase();
		
		if(cacheMemory.isPresent(inputString)) {
			result = cacheMemory.getResult(inputString);
		} else {
			result = compute(inputString);
			cacheMemory.saveResult(inputString, result);
		}
		return result;
	}
	
	private Integer compute(String inputString) {
		
		Set<Character> unique = new HashSet<Character>();
		
		for(char character : inputString.toCharArray()) {
			unique.add(character);
		}

		return unique.size();
	}
}
