package GET2018.com.metacube.SCF.Assignment6;

import static org.junit.Assert.*;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This is imported to check polynomial class.
 * @author Chirag Jain
 * 
 */
	public class PolyTest {

	/**
     * Test case when input polynomial is null
     */
    @org.junit.Test(expected = AssertionError.class)
    public void polyNullTest() {
        new Poly(null);
    }
    
    
    /**
     * Test case when input polynomial is empty
     */
    @org.junit.Test(expected = AssertionError.class)
    public void polyEmptyArrayTest() {
        new Poly(new int[][]{});        
    }
    
    
    /**
     * Test case for evaluate(float x) when x is too large
     */
    @org.junit.Test(expected = AssertionError.class)
    public void largeValueTest() {
        Poly polynomial = new Poly(new int[][]{{2, 200}, {3, 1}, {2, 0}});
        polynomial.evaluate(200f);
    }
    
    
    /**
     * A positive Test case for evaluate(float x) 
     */
    @org.junit.Test
    public void floatValueTest() {
        Poly polynomial = new Poly(new int[][]{{2, 2}, {3, 1}, {2, 0}, {4, 1}});
        double result = polynomial.evaluate(2f);
        assertEquals(24, result, 0.001);
    }
   
    
    /**
     * Test case for degree()
     */
    @org.junit.Test
    public void degreeTest() {
        
        Poly polynomial = new Poly(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        int result = polynomial.Degree();
        assertEquals(2, result);
    }
    
    
    /**
     * Test case for addPoly(Poly p1, Poly p2)
     */
    @org.junit.Test
    public void addPolynomialTest() {
        
        Poly polynomial1 = new Poly(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        Poly polynomial2 = new Poly(new int[][]{{4, 3}, {3, 1}});
        
        Poly result = Poly.addPoly(polynomial1, polynomial2);
        assertArrayEquals(new int[][]{{2, 0}, {6, 1}, {2, 2}, {4, 3}}, result.getPoly());
        
        Poly polynomial3 = new Poly(new int[][]{{2, 2}});
        Poly polynomial4 = new Poly(new int[][]{{4, 3}, {3, 1}});
        
        result = Poly.addPoly(polynomial3, polynomial4);
        assertArrayEquals(new int[][]{{3, 1}, {2, 2}, {4, 3}}, result.getPoly());

    }
    
    
    /**
     * Test case for multiplyPoly(Poly p1, Poly p2)
     */
    @org.junit.Test
    public void multiplyPolynomialTest() {
        
        Poly polynomial1 = new Poly(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        Poly polynomial2 = new Poly(new int[][]{{4, 3}, {3, 1}});
        
        Poly result = Poly.multiplyPoly(polynomial1, polynomial2);
        assertArrayEquals(new int[][]{{8, 5}, {14, 3}, {12, 4}, {9, 2}, {6, 1}}, result.getPoly());
    }

}
