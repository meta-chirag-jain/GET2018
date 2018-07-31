package GET2018.com.metacube.GETProgram;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created as implement products in shopping cart class
 * @author Chirag Jain
 */
public class Product {
	
	public int pId;
	public String pName;
	public int quantity;
	public int price;

	public Product(int pId,String pName,int quantity,int price)
	{
		this.pId = pId;
		this.pName  = pName;
		this.quantity = quantity;
		this.price = price;
	}
	
}