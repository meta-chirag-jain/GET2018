package GET2018.com.metacube.DSA.Assignment3;

import java.util.HashMap;
import java.util.Map;

public class CacheMemory {

	private Map<String, Integer> cache = new HashMap<String, Integer>();
	
	public boolean isPresent(String inputString) {
		return cache.containsKey(inputString);
	}
	
	public Integer getResult(String inputString) {
		return cache.get(inputString);
	}
	
	public boolean saveResult(String inputString, Integer uniqueValues) {
		cache.put(inputString, uniqueValues);
		return true;
	}
}
