package GET2018.com.metacube.SCF.Assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created for declaring various shopping cart function.
 * @author Chirag Jain
 */
public class ShoppingCart {

	List<Product> products = new ArrayList<Product>();
    Promotion promotion;
        
    /**
     * this method adds an item to the cart. If an item already exists, its quantity is updated
     * @param id 
     * @param price
     * @param quantity
     */
    public void addItem(int id, double price, int quantity)
    {
        boolean update = false;
        for(Product item : products)
        {
            if(item.getId()==id)
            {
                update = true;
                int q = item.getQuantity();
                item.setQuantity(quantity + q);
                break;
            }
        }
        if(!update)
        {
        	Product item = new Product(id, price, quantity);
            products.add(item);
        }
    }
        
   /**
    * this method removes an item from the cart
    * @param id is the product id of the product to be removed
    */
    public void removeItem(int id)
    {
        for(Product item:products)
        {
            if(id==item.getId())
            {
                products.remove(item);
                break;
            }
        }
    }
      
    /**
     * this method generates the bill of the cart items and also applies the discount if applicable
     * @param promoCode is the promo code as provided by user
     */
    public void generateBill(String promoCode)
    {
        double sum=0;
        System.out.println("Product id\t\tprice\t\tquantity\ttotal");
        for(Product item:products)
        {
            item.showProducts();
            sum += item.total();
        }
            
       promotion = new FixedOrderPromotion();
       promotion.setMinimumPrice(200);
       promotion.setFixedDiscount(10);
       double discount = applyPromotion(promotion, promoCode, sum);
       System.out.println("\nTotal:" + sum);
       System.out.println("discount applied:"+discount+" %");
       sum = sum - ((discount/100)*sum);
       System.out.println("Grand Total:  " + sum);
    }
        
    /**
     * this method generates the discount based on the promotion applied 
     * @param promotion is an object of Promotion class
     * @param code is a string having the promo code
     * @param amount is the total amount of the items in the cart 
     * @return it returns the % discount that can be applied on the order
     */
    public double applyPromotion(Promotion promotion, String code, double amount)
    {
        double discount = 0;
        if(promotion.isPromotionApplicable(code) && amount >= promotion.getMinimumPrice())
        {
            discount = promotion.getFixedDiscount();
        }
        return discount;
    }
      
    public Promotion getPromotion() {
    	return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
        
}
