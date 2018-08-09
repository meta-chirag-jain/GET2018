package GET2018.com.metacube.DSA.Assignment5;

import java.util.Map;

public interface IDictionary {

	public boolean addWord(String word, String meaning);
	
	public boolean deleteWord(String word);
	
	public String getMeaning(String word) throws CustomException;
	
	public Map<String, String> sortedDictionary() throws CustomException;
	
	public Map<String, String> dictionaryBetween(String word1, String word2) throws CustomException;
	
}