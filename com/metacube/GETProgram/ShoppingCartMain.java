package GET2018.com.metacube.GETProgram;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is designed to implement various shopping cart functions.
 * @author Chirag Jain
 */
public class ShoppingCartMain {
	
	public static void main(String[] args)
	{
		ShoppingCart sc = new ShoppingCart();
		
		sc.addItem(1, "cookie", 2, 10);
		sc.addItem(2, "hanky", 3, 15);
		sc.display();
		System.out.println("Total bill is " + sc.bill());
		
		sc.addItem(1, "cookie", 5, 10);			//if already present add quantity
		sc.display();
		
		sc.removeProduct(2);
		sc.display();
		
		sc.addQuantity(1, 5);
		sc.display();
		
		sc.subtractQuantity(1, 3);
		sc.display();
		System.out.println("Total bill is " + sc.bill());
		
		sc.subtractQuantity(1, 5);				//trying to make quantity negative in cart
		sc.display();
	}
}
