package GET2018.com.metacube.SCF.Assignment1;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created for product properties.
 * @author Chirag Jain
 */
public class Product
{
    private int id;
    private double price;
    private int quantity;
    
    public Product(int id,double price, int quantity)
    {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double total()
    {
        return price*quantity;
    }
    
    public void showProducts()
    {
        System.out.println(id+"\t\t\t"+price+"\t\t"+quantity+"\t\t"+total());
    }
}
