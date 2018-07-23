package GET2018.com.metacube.GETProgram;

/**
 * This class is created as implement products in shopping cart class
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 */
public class Product {
	int pId;
	String pName;
	int quantity;
	int price;

	Product(int pId,String pName,int quantity,int price)
	{
		this.pId = pId;
		this.pName  = pName;
		this.quantity = quantity;
		this.price = price;
	}
	
}