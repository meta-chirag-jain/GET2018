package GET2018.com.metacube.DBMS.Assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * class to 
 * @author User5
 *
 */
public class DataAccessObject 
{
    private static Connection getConnection()
    {
        Connection con = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/store_front";
            con = DriverManager.getConnection(url, "root", "12345");
        }
        catch(ClassNotFoundException exception)
        {
            exception.printStackTrace();
            System.exit(1);
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            System.exit(2);
        }
        
        return con;
    }
    
    public static List<OrderLineItem> fetchOrderLineItems(int userId)
    {
        List<OrderLineItem> listOfOrderLineItems = new ArrayList<OrderLineItem>();
        String query = "SELECT oli.order_id, oli.product_id, o.placed_date, p.price * oli.quantity AS total FROM product p INNER JOIN order_line_item oli ON p.product_id = oli.product_id INNER JOIN orders o ON o.order_id = oli.order_id WHERE o.user_id = ? AND oli.status = 'shipped'";
        
        try
        (
            Connection con = getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(query);
        ){
            preparedStatement.setInt(1, userId);
            ResultSet result = preparedStatement.executeQuery();
            
            while(result.next())
            {
                int orderId = result.getInt("order_id");
                int productId = result.getInt("product_id");
                String orderDate = result.getString("placed_date");
                float total = result.getFloat("total");
                
                listOfOrderLineItems.add(new OrderLineItem(orderId, productId, orderDate, total));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return listOfOrderLineItems;
    }
    
    public static boolean insertImages(List<Image> images, int productId)
    {
        boolean inserted = false;
        String query = "INSERT INTO image(product_id, alternate_text, url) VALUES(?, ?, ?)";
        try
        (
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
        ){
            try 
            {
                con.setAutoCommit(false);
                
                for (int i = 0; i < images.size(); i++)
                {
                    stmt.setInt(1, productId);
                    stmt.setString(2, images.get(i).getAlternateText());
                    stmt.setString(3, images.get(i).getUrl());
                    stmt.addBatch();
                }

                int[] result = stmt.executeBatch();
                if(result.length > 0)
                    inserted = true;
                con.commit();

            }
            catch (SQLException ex)
            {
                ex.printStackTrace();
                con.rollback();
            }
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        return inserted;
    }
    
    public static int markInactive()
    {
        int noOfUpdates = 0;
        String query = "UPDATE product SET product_state = 'inactive' WHERE product_id NOT IN (SELECT DISTINCT product_id FROM order_line_item INNER JOIN orders WHERE placed_date > (DATE_SUB(CURDATE(), INTERVAL 1 YEAR)));";
        
        try
        (
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            
        ){
            try
            {
                noOfUpdates = stmt.executeUpdate();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        return noOfUpdates;
    }
    
    public static List<TopCategory> countChildren()
    {
        List<TopCategory> listOfTopCategories = new ArrayList<TopCategory>();
        String query1 = "CREATE FUNCTION count_children(parent_id INTEGER) RETURNS INTEGER NOT DETERMINISTIC BEGIN DECLARE count INTEGER; SELECT count(category_id) INTO count FROM (SELECT * FROM category ORDER BY parent_category_id, category_id) category_sorted, (SELECT @pv := parent_id) initialisation WHERE find_in_set(parent_category_id, @pv) AND length(@pv := concat(@pv, ',', category_id)); RETURN count; END";
        
        String query2 = "SELECT name, count_children(category_id) AS children_count "
                + "FROM category "
                + "WHERE parent_category_id IS NULL "
                + "ORDER BY name ";
        try
        (
            Connection con = getConnection();
           
            PreparedStatement stmt1 = con.prepareStatement(query1);
            PreparedStatement stmt2 = con.prepareStatement(query2);
        )
        {
            stmt1.execute();
            ResultSet result = stmt2.executeQuery();
            
            while(result.next())
            {
                String parentCategoryName = result.getString("name");
                int childCategories = result.getInt("children_count");
                
                listOfTopCategories.add(new TopCategory(parentCategoryName, childCategories));
            }
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        return listOfTopCategories;
    }
}