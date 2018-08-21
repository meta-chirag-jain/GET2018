package GET2018.com.metacube.DBMS.Assignment5;

public class OrderLineItem 
{
    private int orderId;
    private int productId;
    private String orderDate;
    private float total;
        
    public OrderLineItem(int orderId, int productId, String orderDate, float total) {
        
        this.orderId = orderId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public int getProductId() {
        return productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public String getOrderDate() {
        return orderDate;
    }
    
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    
    public float getTotal() {
        return total;
    }
    
    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderLineItem [orderId=" + orderId + ", productId=" + productId
                + ", orderDate=" + orderDate + ", total=" + total + "]";
    }
        
}
