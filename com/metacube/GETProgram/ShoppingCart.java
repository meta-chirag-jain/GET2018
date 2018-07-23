package GET2018.com.metacube.GETProgram;
import java.util.*;

/**
 * This class is designed to create various shopping cart functions.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 */
public class ShoppingCart {
	
	private List<Product> cart = new ArrayList<Product>();
	
	/**
	 * This function is used to add items to Cart
	 * @param pId is product ID.
	 * @param pName is product Name.
	 * @param quantity is product quantity.
	 * @param price is product price.
	 */
	void addItem(int pId,String pName,int quantity,int price) {
		cart.add(new Product(pId, pName, quantity, price));
		System.out.println("Item Added");
	}
	
	/**
	 * This function displays products in cart.
	 */
	void display() {
		for(Product p : cart) {
			System.out.println(p.pId + "\t" + p.pName + "\t" + p.quantity + "\t" + p.price );
		}
	}
	
	/**
	 * This function is used to calculate total bill.
	 * @return total amount to be paid for shopping.
	 */
	int bill() {
		int total = 0;
		for(Product p : cart) {
			total += p.quantity * p.price;
		}
		return total;
	}
	
	/**
	 * This function removes product from cart.
	 * @param prodId is product ID.
	 */
	void removeProduct(int prodId)
	{
		for(Product p : cart) {
			if(p.pId == prodId) {
				cart.remove(p);
				break;
			}
		}
	}
	
	/**
	 * This function adds already existing product's quantity.
	 * @param prodId is Product ID.
	 * @param quan is quantity to be added.
	 */
	void addQuantity(int prodId, int quan)
	{
		for(Product p : cart) {
			if(p.pId == prodId) {
				p.quantity += quan;
			}
		}
	}
	
	/**
	 * This function subtracts already existing product's quantity.
	 * @param prodId is Product ID.
	 * @param quan is quantity to be subtracted.
	 */
	void subtractQuantity(int prodId, int quan)
	{
		for(Product p : cart) {
			if(p.pId == prodId) {
				p.quantity -= quan;
			}
		}
	}
	
	public static void main(String[] args)
	{
		ShoppingCart sc = new ShoppingCart();
		sc.addItem(1, "cookie", 2, 10);
		sc.addItem(2, "hanky", 3, 15);
		sc.display();
		System.out.println("Total bill is " + sc.bill());
		
		sc.removeProduct(2);
		sc.display();
		
		sc.addQuantity(1, 5);
		sc.display();
		sc.subtractQuantity(1, 3);
		sc.display();
	}
}