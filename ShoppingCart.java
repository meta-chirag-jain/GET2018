package assignment1;

import java.util.*;

class Product {
	int pId;
	String pName;
	int quantity;
	int price;

	public Product(int pId,String pName,int quantity,int price)
	{
		this.pId = pId;
		this.pName  = pName;
		this.quantity = quantity;
		this.price = price;
	}
	
	/*public void display()
	{
		System.out.println(this.pId + "\t" + this.pName + "\t" + this.quantity + "\t" + this.price );
	}*/
	
}


public class ShoppingCart {
	int total;
	
	List<Product> cart = new ArrayList<Product>();
	
	void addItem(int pId,String pName,int quantity,int price) {
		cart.add(new Product(pId, pName, quantity, price));
		System.out.println("Item Added");
	}
	
	void display() {
		for(Product p : cart) {
			System.out.println(p.pId + "\t" + p.pName + "\t" + p.quantity + "\t" + p.price );
		}
	}
	
	int bill() {
		int total = 0;
		for(Product p : cart) {
			total += p.quantity * p.price;
		}
		return total;
	}
	
	void rmv(int prodId)
	{
		for(Product p : cart) {
			if(p.pId == prodId) {
				cart.remove(p);
				break;
			}
		}
	}
	
	void add(int prodId, int quan)
	{
		for(Product p : cart) {
			if(p.pId == prodId) {
				p.quantity += quan;
			}
		}
	}
	
	void subtract(int prodId, int quan)
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
		
		sc.rmv(2);
		sc.display();
		
		sc.add(1,5);
		sc.display();
		sc.subtract(1,3);
		sc.display();
	}
}