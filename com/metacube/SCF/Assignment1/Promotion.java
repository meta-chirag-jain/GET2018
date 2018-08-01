package GET2018.com.metacube.SCF.Assignment1;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This interface is created for declaring various function for applying promotion.
 * @author Chirag Jain
 */
public interface Promotion
{
    
    public double getMinimumPrice();
    
    public void setMinimumPrice(double minimumPrice);
    
    public double getFixedDiscount();
    
    public void setFixedDiscount(double discount);
    
    public boolean isPromotionApplicable(String code);
    
}
