package GET2018.com.metacube.DSA.Assignment2.Part2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NestedListJSON implements INestedList
{

    private List<Object> nestedList = new ArrayList<Object>(); 
    
    public NestedListJSON(String nestedInput) throws FileNotFoundException, IOException, ParseException
    {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader(nestedInput));
        
        JSONObject jsonObject = (JSONObject) object;
        
        addToList(jsonObject);
        
        
    }
    
    private MultiLevelNestedList addToList(JSONObject jsonObject) {
        return null;
        
        /*for(Object key : jsonObject.keySet()) {
            //Object value = jsonObject.get(key);
            for(Object value  : jsonObject.get(key)) {
            if(jsonObject.get(key) instanceof List) {
                nestedList.add(jsonObject.get(key));
                System.out.println("list");
            } else if(jsonObject.get(key) instanceof Integer) {
                System.out.println("int");
                nestedList.add((Integer)jsonObject.get(key));
            } else {
                throw new AssertionError("not integer");
            }
        }
        }
        print();*/
        
        /*for(Object key : jsonObject.keySet()){

            if(jsonObject.get(key) instanceof String){
            nestedList.add(new Value(Integer.parseInt((String) jsonObject.get(key))));
            }
            else{
            nestedList.add(addToList((JSONObject) jsonObject.get(key)));
            }
            System.out.println(nestedList);
            }
            return nestedList;
    }
        
    
    private void print() {
        int count = 0;
        for(Object value : nestedList) {
            System.out.println(value + " count " + ++count);
        }*/
    }
    
    @Override
    public int listSum(List<Object> object)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int largestElement(List<Object> object)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean searchElement(List<Object> object, int elementToSearch)
    {
        // TODO Auto-generated method stub
        return false;
    }

}
