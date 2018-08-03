package GET2018.com.metacube.SCF.Assignment6;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is designed to perform various polynomial functions.
 * @author Chirag Jain
 * 
 */
public final class Poly {
	
	private int[][] polynomial;
	private final static int POWER = 1;
	private final static int COEFFICIENT = 0;
		
	public Poly(int[][] givenPoly) {
		if(givenPoly == null) {
			throw new AssertionError("Set can't be null");
		}

		if(givenPoly.length == 0) {
			throw new AssertionError("Set can't be zero.");
		}
		
		int[][] temp = removeCopy(givenPoly);
		int[][] polyEquation = removeZero(temp);
		
		if(polyEquation.length == 0) {
			throw new AssertionError("Set can't be null");
		}
		
		this.polynomial = polyEquation;

	}
	
	/**
	 * removes trailing zeros from polynomial array.
	 * @param givenArray is passed array
	 * @return array after removing trailing zeroes.
	 */
	private int[][] removeZero(int[][] givenArray) {
		int length = 0;
		
		for(int i = 0; i < givenArray.length && givenArray[i][COEFFICIENT] != 0; i++) {
			length++;
		}
		
		int[][] finalPoly = new int[length][2];
		
		for(int i =0; i < length; i++) {
			finalPoly[i][COEFFICIENT] = givenArray[i][COEFFICIENT];
			finalPoly[i][POWER] = givenArray[i][POWER];
		}
		
		return finalPoly;		
	}
	
	/**
	 * @return polynomial array.
	 */
	public int[][] getPoly() {
		return polynomial;
	}
	
	/**
	 * @return number of elements with different powers.
	 */
	public int size() {
		return polynomial.length;
	}
	
	/**
	 * This function finds coefficient of given power if found else return 0.
	 * @param power is power of variable.
	 * @return coefficient of given power.
	 */
	private int getCoefficient(int power) {
		for(int i = 0; i < polynomial.length; i++) {
			if(polynomial[i][POWER] == power) {
				return polynomial[i][COEFFICIENT];
			}
		}
		return 0;
	}
	
	/**
	 * @return highest power of polynomial.
	 */
	public int Degree() {
		int maxPower = 0;
		for(int i = 0; i < polynomial.length; i++) {
			if(polynomial[i][POWER] > maxPower) {
				maxPower = polynomial[i][POWER];
			}
		}
		return maxPower;
	}
	
	/**
	 * This function returns polynomial value with given variable.
	 * @param x is value of variable.
	 * @return evaluated value.
	 */
	public double evaluate(float x) {
		double polyValue = 0.00;
		for(int i =0; i < polynomial.length; i++) {
			polyValue += polynomial[i][COEFFICIENT] * (Math.pow(x, polynomial[i][POWER]));
		}
		if(polyValue == Double.POSITIVE_INFINITY) {
			throw new AssertionError("Value too large");
		}
		return polyValue;
	}
	
	/**
	 * This function takes 2 polynomial and add them.
	 * @param p1 is polynomial 1.
	 * @param p2 is polynomial 2.
	 * @return new polynomial after adding them.
	 */
	public static Poly addPoly(Poly p1, Poly p2) {
		
		int[][] polySum = new int[p1.size() + p2.size()][2];
		int sumIndex = 0;
		
		int maxPower = Math.max(p1.Degree(), p2.Degree());
		
		for(int i = 0; i <= maxPower; i++) {
			if(p1.getCoefficient(i) != 0 || p2.getCoefficient(i) != 0) {
				polySum[sumIndex][COEFFICIENT] = p1.getCoefficient(i) + p2.getCoefficient(i);
				polySum[sumIndex][POWER] = i;
				sumIndex++;
			}
		}

		return new Poly(polySum);
		
	}
	
	/**
	 * Used to check if element with same power exists in array.
	 * @param givenArray is passed array
	 * @param power is power of variable
	 * @return index of row where power is found else -1.
	 */
	private static int returnIndex(int[][] givenArray, int power) {
		int index = -1;
		for(int i = 0; i < givenArray.length; i++) {
			if(givenArray[i][POWER] == power) {
				index = i;
			}
		}
		return index;
	}
	
	/**
	 * This function takes 2 polynomial and multiply them.
	 * @param p1 is polynomial 1.
	 * @param p2 is polynomial 2.
	 * @return new polynomial after multiplying them.
	 */
	public static Poly multiplyPoly(Poly p1, Poly p2) {
		int mulSize = p1.Degree() * p2.Degree();
		if(mulSize >= 50) {
			throw new AssertionError("Multiplication size too big");
		}
		
		int power, coefficient, index, mulIndex = 0;
		int[][] mulPoly = new int[mulSize][2];

		for(int i = 0; i < p1.size(); i++) {
			for(int j = 0; j < p2.size(); j++) {
				
				power = p1.getPoly()[i][1] + p2.getPoly()[j][1];
				coefficient = p1.getPoly()[i][COEFFICIENT] * p2.getPoly()[j][COEFFICIENT];
				
				index = returnIndex(mulPoly, power);
				
				if(index != -1) {
					mulPoly[index][COEFFICIENT] += coefficient;
				} else {
					mulPoly[mulIndex][COEFFICIENT] = coefficient;
					mulPoly[mulIndex][POWER] = power;
					mulIndex++;
				}
			}
		}
		
		return new Poly(mulPoly);
	}
	
	/**
	 * This function removes elements with same power by adding them and zero coefficient terms.
	 * @param givenArray is passed array
	 * @return array after removing elements with same power by adding them.
	 */
	private int[][] removeCopy(int[][] givenArray)
	{
		int n = givenArray.length;

	    if (n==0 || n==1){
	    	return givenArray;
	    }

	    int index;
	    int[][] temp = new int[n][2];

	    int length = 0;
	    for (int i = 0; i < n; i++) {
	    	//temp array initializes itself with all values as zero, returnIndex function will give wrong value with constants as their power is also zero.
	    	if(givenArray[i][POWER] == 0) {
	    		index = -1;
	    	} else {
	    		index = returnIndex(temp, givenArray[i][POWER]);
	    	}

	    	if (index == -1 && givenArray[i][COEFFICIENT] != 0) {
	        	temp[length][COEFFICIENT] = givenArray[i][COEFFICIENT];
				temp[length][POWER] = givenArray[i][POWER];
				length++;
	        }
	    	//if already present then add coefficients
	    	else if(index != -1 && givenArray[i][COEFFICIENT] != 0 ){
				temp[index][COEFFICIENT] += givenArray[i][COEFFICIENT];
			}
	    }
	    
	    return temp;
	}

}
