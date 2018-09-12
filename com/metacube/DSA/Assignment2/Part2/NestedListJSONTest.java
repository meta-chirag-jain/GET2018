package GET2018.com.metacube.DSA.Assignment2.Part2;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Test;

public class NestedListJSONTest
{

    @Test
    public void test() throws FileNotFoundException, IOException, ParseException
    {
        NestedListJSON nestedList = new NestedListJSON("C:\\Users\\HP\\eclipse-workspace\\DSA\\src\\GET2018\\com\\metacube\\DSA\\Assignment2\\Part2\\inputNested.json");
    }

}
