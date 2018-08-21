package GET2018.com.metacube.DBMS.Assignment5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCTest {

    @Test
    public void test() {
        
        List<Image> images = new ArrayList<Image>();
        images.add(new Image("iPhone-8 image 1", "image.com/id201"));
        images.add(new Image("iPhone-8 image 2", "image.com/id202"));
        images.add(new Image("iPhone-8 image 3", "image.com/id203"));
        images.add(new Image("iPhone-8 image 4", "image.com/id204"));
        images.add(new Image("iPhone-8 image 5", "image.com/id205"));
        
        assertTrue(Dao.insertImages(images, 11));
    }
    
    @Test
    public void test1() {
        
        assertEquals(6, Dao.markInactive());
    }
    
    @Test
    public void test2()
    {
        List<OrderLineItem> result = Dao.fetchOrderLineItems(3);
        List<OrderLineItem> expected = new ArrayList<OrderLineItem>();
        expected.add(new OrderLineItem(2, 6, "2018-07-04", 1080.00f));
        
        assertEquals(expected.size(), result.size());
    }
    
    @Test
    public void test3()
    {
        List<TopCategory> result = DataAccessObject.countChildren();
        for(TopCategory t: result)
            System.out.println(t);
    }
}
