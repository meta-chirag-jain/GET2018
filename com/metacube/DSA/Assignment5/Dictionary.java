package GET2018.com.metacube.DSA.Assignment5;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Dictionary implements IDictionary {
	
	private Map<String, String> dictionary = new TreeMap<String, String>();

	public Map<String, String> getDictionary() {
		return dictionary;
	}

	public Dictionary() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor to read input from json file
	 * @param inputDictionary is dictionary file in json
	 * @throws IOException
	 * @throws ParseException
	 * @throws CustomException
	 */
	public Dictionary(String inputDictionary) throws IOException, ParseException, CustomException {
		
		if(inputDictionary == null) {
			throw new CustomException("Null Path given.");
		}
		
		JSONParser parser = new JSONParser();
		try
        {
            Object object = parser.parse(new FileReader(inputDictionary));
            
            JSONObject jsonObject = (JSONObject)object;
			
			for(Object key: jsonObject.keySet()) {
				addWord(key.toString(), jsonObject.get(key).toString());
				
			}

        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
       
	}

	@Override
	public boolean addWord(String word, String meaning) {
		boolean flag = false;
		try {
			if(meaning == null || word == null) {
				throw new CustomException("Null input found.");
			}
			
			word = word.toLowerCase();
			meaning = meaning.toLowerCase();

			dictionary.put(word, meaning);
			
			if(dictionary.containsKey(word)) {
				flag = true;
			}
		}
		catch(CustomException error) {
			
		}
		
		return flag;
	}

	@Override
	public boolean deleteWord(String word) {
		boolean flag = false;
		try {
			if(word == null) {
				throw new CustomException("Null input found.");
			}
			
			word = word.toLowerCase();
			
			if(!dictionary.isEmpty() && dictionary.containsKey(word)) {
				dictionary.remove(word);
				flag = true;
			}			
			if(dictionary.containsKey(word)) {
				flag = false;
			}
		}
		catch(CustomException error) {
			System.out.println(error.getMessage());
		}
		
		return flag;
	}

	@Override
	public String getMeaning(String word) throws CustomException {
		word = word.toLowerCase();
		if(word == null) {
			throw new CustomException("Null input found.");
		}
		if(dictionary.isEmpty()) {
			throw new CustomException("Dictionary is empty");
		}
		if(!dictionary.containsKey(word)) {
			throw new CustomException("Word not present in dictionary.");
		}
		return dictionary.get(word);
	}

	@Override
	public Map<String, String> sortedDictionary() throws CustomException {
		if(dictionary.isEmpty()) {
			throw new CustomException("Dictionary is empty");
		}
		return dictionary;		
	}

	@SuppressWarnings("null")
	@Override
	public Map<String, String> dictionaryBetween(String word1, String word2) throws CustomException {
		if(dictionary.isEmpty()) {
			throw new CustomException("Dictionary is empty");
		}
		
		Map<String, String> dictionaryInBetween = null;
		
		for (String word: dictionary.keySet()) {
            String key = word.toString();
            if(key.compareToIgnoreCase(word1) > -1 && key.compareToIgnoreCase(word1) < 1) {
            	String value = dictionary.get(word).toString();
            	((Dictionary) dictionaryInBetween).addWord(key, value);
            }
            
        }
		
		return dictionaryInBetween;
	}

}
