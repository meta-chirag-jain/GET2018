package GET2018.com.metacube.GETProgram;
import java.util.*;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is designed to create various shopping cart functions.
 * @author Chirag Jain
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
	public void addItem(int pId,String pName,int quantity,int price) {
		boolean present = false;
		for(Product p : cart) {
			if(pId == p.pId) {
				p.quantity += quantity;
				present = true;
				System.out.println("Adding to already present quantity");
			}
		}
		if(!present) {
			cart.add(new Product(pId, pName, quantity, price));
		}		
		System.out.println("Item Added");
	}
	
	/**
	 * This function displays products in cart.
	 */
	public void display() {
		for(Product p : cart) {
			System.out.println(p.pId + "\t" + p.pName + "\t" + p.quantity + "\t" + p.price );
		}
	}
	
	/**
	 * This function is used to calculate total bill.
	 * @return total amount to be paid for shopping.
	 */
	public int bill() {
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
	public void removeProduct(int prodId)
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
	public void addQuantity(int prodId, int quan)
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
	public void subtractQuantity(int prodId, int quan)
	{
		for(Product p : cart) {
			if(p.pId == prodId && (p.quantity - quan) > 0) {
				p.quantity -= quan;
			} else {
				System.out.println("Enter quantity less than available in cart");
			}
		}
	}
	
}