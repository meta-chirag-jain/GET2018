package GET2018.com.metacube.SCF.Assignment1;

import java.util.Scanner;
/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created for testing various shopping cart function.
 * @author Chirag Jain
 */
public class ShoppingCartMain
{

    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        int choice;
        
        do
        {
            System.out.println("MENU");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Generate bill");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scan.nextInt();
            
            switch(choice)
            {
            case 1: System.out.println("Enter the product id, price, quantity of the item");
                    int id = scan.nextInt();
                    double price = scan.nextDouble();
                    int quantity = scan.nextInt();
                    cart.addItem(id, price, quantity);
                    break;
                    
            case 2: System.out.println("Enter the product id of the item to be removed:");
                    int id1 = scan.nextInt();
                    cart.removeItem(id1);
                    break;
                    
            case 3: System.out.println("Do you have a promo code?(y/n)");
                    char response = scan.next().charAt(0);
                    String promoCode = "";
                    if(response == 'y')
                    {
                        System.out.println("Enter the promo code");
                        promoCode = scan.next();
                    }
                    cart.generateBill(promoCode);
                    break;
                    
            case 4: break;
            
            default: System.out.println("Wrong input!! Try again!!");
            
            }
        }while(choice != 4);

        scan.close();

    }

}
