/**
 * 
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 *
 */
package assignment17july;

public class HexaCalc {

	public static void main(String[] args) {

		int decVal = new HexToDec().convertHexToDec("121") ;
		System.out.println(decVal);
		 
		String hexVal = new DecToHex().convertDecToHex(289);
		System.out.println(hexVal);
		
		String add1 = new HexCompute("A", "5").add();
		System.out.println(add1);
		String sub1 = new HexCompute("A", "5").sub();
		System.out.println(sub1);
		String mul1 = new HexCompute("A", "5").mul();
		System.out.println(mul1);
		String div1 = new HexCompute("A", "5").div();
		System.out.println(div1);
		
		HexCompare compare = new HexCompare("55", "0055");
		System.out.println(compare.isSmaller());
		System.out.println(compare.isGreater());
		System.out.println(compare.isEqual());
	}

}
