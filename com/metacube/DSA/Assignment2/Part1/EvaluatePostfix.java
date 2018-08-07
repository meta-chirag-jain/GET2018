package GET2018.com.metacube.DSA.Assignment2.Part1;

import java.text.DecimalFormat;
import java.util.NoSuchElementException;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class evaluates postfix expressions.
 * @author Chirag Jain
 *
 */
public class EvaluatePostfix {

	/**
	 * 
	 * @param postfix is postfix expression.
	 * @return final value after evaluation.
	 */
	public static double evaluate(String postfix) {
		
		DecimalFormat decimalFormat = new DecimalFormat(".##");
		
		if(postfix == null || postfix == ""){
			throw new AssertionError("Null Entry");
		}
		
		StackLinkList<Double> operandStack = new StackLinkList<Double>();
		
		String postfixTrimmed = postfix.trim().replaceAll(" +", " ");
		
		String[] tokens = postfixTrimmed.split(" ");
		
		double operand;
		
		for(int i = 0; i < tokens.length; i++) {
			
			try{
				operand = Double.parseDouble(tokens[i]);
				//stack is implemented using Linked List so it will never be full.
				operandStack.pushElement(operand);
			}
			catch(NumberFormatException numberFormatException) {
					try {
						double operand1 = operandStack.popElement();
						double operand2 = operandStack.popElement();
						
						double value = evaluate(tokens[i], operand1, operand2); 
						
						operandStack.pushElement(value);
						
						//System.out.println("op1 :" + operand1 + "  op2: " + operand2 + " result " + value);
					}
					catch(NoSuchElementException nsee) {
						throw new AssertionError("Number of operators is more");
					}							
			}
		}
		
		double result = operandStack.popElement();
	
		if(!operandStack.isEmpty()) {
			throw new AssertionError("Number of operands is more");
		}
		
		return Double.parseDouble(decimalFormat.format(result));
	}
	
	/**
	 * 
	 * @param operator
	 * @param operand1
	 * @param operand2
	 * @return value after evaluation
	 */
	private static double evaluate(String operator, double operand1, double operand2) {
		
		double result = 0;
		
		switch(operator)
        {
            case "+":
            	result = operand2 + operand1;
            	break;
             
            case "-":
            	result = operand2 - operand1;
            	break;
             
            case "/":
            	result = operand2 / operand1;
            	break;
             
            case "*":
            	result = operand2 * operand1;
            	break;
            	
            default:
            	throw new AssertionError("Wrong input");
        }
		
		return result;
		
	}
}
