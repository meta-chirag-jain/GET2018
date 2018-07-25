package GET2018.com.metacube.SCF.Assignment6;

/**
 * This class is designed to perform various polynomial functions.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public final class Poly {
	
	private int[][] polynomial;
		
	public Poly(int[][] givenPoly) {
		if(givenPoly == null) {
			throw new AssertionError("Set can't be null");
		}
		
		int[][] temp = removeUnwanted(givenPoly);
		int[][] polyEquation = removeZero(temp);
		
		if(polyEquation.length == 0) {
			throw new AssertionError("Set can't be null");
		}
		
		this.polynomial = polyEquation;
		
		/*for(int i = 0; i < polynomial.length; i++) {
			System.out.println(polynomial[i][0] + "  " + polynomial[i][1]);
		}*/
	}
	
	/**
	 * removes trailing zeros from polynomial array.
	 * @param givenArray is passed array
	 * @return array after removing trailing zeroes.
	 */
	private int[][] removeZero(int[][] givenArray) {
		int length = 0;
		
		for(int i =0; i < givenArray.length && givenArray[i][0] != 0; i++) {
			length++;
		}
		
		int[][] finalPoly = new int[length][2];
		
		for(int i =0; i < length; i++) {
			finalPoly[i][0] = givenArray[i][0];
			finalPoly[i][1] = givenArray[i][1];
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
			if(polynomial[i][1] == power) {
				return polynomial[i][0];
			}
		}
		return 0;
	}
	
	/**
	 * @return highest power of polynomial.
	 */
	int Degree() {
		int maxPower = 0;
		for(int i = 0; i < polynomial.length; i++) {
			if(polynomial[i][1] > maxPower) {
				maxPower = polynomial[i][1];
			}
		}
		return maxPower;
	}
	
	/**
	 * This function returns polynomial value with given variable.
	 * @param x is value of variable.
	 * @return evaluated value.
	 */
	double evaluate(float x) {
		double polyValue = 0.00;
		for(int i =0; i < polynomial.length; i++) {
			polyValue += polynomial[i][0] * (Math.pow(x, polynomial[i][1]));
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
	public static Poly addPoly(Poly p1, Poly p2) {									//NotWorking
		
		int[][] polySum = new int[p1.size() + p2.size()][2];
		int sumIndex = 0;
		
		for(int i = 0; i < p1.Degree(); i++) {
			if(p1.getCoefficient(i) != 0 || p2.getCoefficient(i) != 0) {
				polySum[sumIndex][0] = p1.getCoefficient(i) + p2.getCoefficient(i);	//coeff
				polySum[sumIndex][1] = i;											//power
				sumIndex++;															//index
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
		for(int i = 0; i < givenArray.length; i++) {
			if(givenArray[i][1] == power) {
				return i;
			}
		}
		return -1;
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
				coefficient = p1.getPoly()[i][0] * p2.getPoly()[j][0];
				
				index = returnIndex(mulPoly, power);
				
				if(index != -1) {
					mulPoly[index][0] += coefficient;
				} else {
					mulPoly[mulIndex][0] = coefficient;
					mulPoly[mulIndex][1] = power;
					mulIndex++;
				}
			}
		}
		
		return new Poly(mulPoly);
	}
	
	/**
	 * This function removes elements with same power by adding them and trailing zeros.
	 * @param givenArray is passed array
	 * @return array after removing elements with same power by adding them and trailing zeros.
	 */
	private int[][] removeUnwanted(int[][] givenArray)
	{
		int n = givenArray.length;

	    if (n==0 || n==1){
	    	return givenArray;
	    }

	    int index;
	    int[][] temp = new int[n][2];

	    int length = 0;
	    for (int i = 0; i < n; i++) {
			index = returnIndex(temp, givenArray[i][1]);
	    	if (index == -1 && givenArray[i][0] != 0) {
	        	temp[length][0] = givenArray[i][0];
				temp[length][1] = givenArray[i][1];
				length++;
	        } else if(index != -1 && givenArray[i][0] != 0){
				temp[index][0] += givenArray[i][0];
			}
	    }
	    return temp;
	}

}
