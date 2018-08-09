package GET2018.com.metacube.DSA.Assignment5;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.junit.Test;

public class DictionaryTest {
	
	Dictionary dictionaryTest = new Dictionary();

	@Test
	public void addToDictionaryTest() throws CustomException{
		
		assertTrue(dictionaryTest.addWord("Hello", "Greeting"));
		assertTrue(dictionaryTest.addWord("Namaste", "Greeting"));
		assertFalse(dictionaryTest.addWord(null, "Greeting"));
		assertFalse(dictionaryTest.addWord("Namaste", null));
	}
	
	@Test
	public void deleteFromDictionaryTest() throws CustomException{
		
		assertTrue(dictionaryTest.addWord("Hello", "Greeting"));
		assertTrue(dictionaryTest.addWord("Namaste", "Greeting"));
		
		assertTrue(dictionaryTest.deleteWord("Namaste"));
		assertFalse(dictionaryTest.deleteWord("Namaste"));

	}
	
	@Test
	public void dictionaryFromFileTest() throws CustomException, IOException, ParseException{

		Dictionary dictionaryFromFile = new Dictionary("inputDictionary.json");
		
		assertTrue(dictionaryFromFile.addWord("Hello", "Greeting"));
		assertTrue(dictionaryFromFile.deleteWord("Culture"));
		assertFalse(dictionaryFromFile.deleteWord("Culture"));
		
		/*Map<String, String> dict = dictionaryFromFile.getDictionary();
		
		for (String name: dict.keySet()) {

            String key = name.toString();
            String value = dict.get(name).toString();  
            System.out.println(key + " : " + value);
        }*/

	}
	
	@Test
	public void getMeaningTest() throws CustomException{
		
		assertTrue(dictionaryTest.addWord("Hello", "Greeting"));
		assertTrue(dictionaryTest.addWord("Namaste", "Indian Greeting"));
		
		assertEquals("greeting", dictionaryTest.getMeaning("Hello"));
	}
	
	@Test
	public void getMeaningNotInDictionaryTest() throws CustomException{
		
		assertTrue(dictionaryTest.addWord("Hello", "Greeting"));
		assertTrue(dictionaryTest.addWord("Namaste", "Indian Greeting"));
		
		try {
			assertEquals("greeting", dictionaryTest.getMeaning("Hi"));
		}
		catch (CustomException error) {
			assertEquals("Word not present in dictionary.", error.getMessage());
		}
	}
	
	@Test
	public void sortedDictioanryTest() throws CustomException{
		
		assertTrue(dictionaryTest.addWord("Hello", "Greeting"));
		assertTrue(dictionaryTest.addWord("Namaste", "Indian Greeting"));
		
		assertEquals("greeting", dictionaryTest.getMeaning("Hello"));
	}

}
