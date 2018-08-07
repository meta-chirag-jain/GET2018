package GET2018.com.metacube.SCF.Assignment1;

import java.util.GregorianCalendar;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This enum is created for declaring fix promo codes and their functions.
 * @author Chirag Jain
 */
public enum PromotionEnum
{
    PROMO1("code1", new GregorianCalendar(2018, 6, 10), new GregorianCalendar(2018, 9, 20)),
    PROMO2("code2", new GregorianCalendar(2018, 7, 5), new GregorianCalendar(2018, 8, 23)),
    PROMO3("code3", new GregorianCalendar(2018, 4, 15), new GregorianCalendar(2018, 7, 18)),
    PROMO4("code4", new GregorianCalendar(2018, 5, 27), new GregorianCalendar(2018, 10, 20));
    
    private String code;
    private GregorianCalendar startDate, endDate;
    
    private PromotionEnum(String code, GregorianCalendar startDate, GregorianCalendar endDate)
    {
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }
}
