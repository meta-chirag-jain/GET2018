package GET2018.com.metacube.DSA.Assignment2.Part1;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class converts infix expression to postfix expression.
 * @author Chirag Jain
 *
 */
public class InfixToPostfix {

	public static String infixToPostfix(String infix) {
		
		if(infix == null) {
			throw new AssertionError("Null passed");
		}
		
		//remove extra spaces
		String infixTrimmed = infix.trim().replaceAll(" +", " ");
		if(infixTrimmed.length() == 0) {
			throw new AssertionError("Empty String passed");
		}
		String[] expressiontokens = infixTrimmed.split(" ");
		
		String postfixExpression = "";
		
		StackLinkList<String> operatorStack = new StackLinkList<String>();
		
		for(String token : expressiontokens) {
			
			if("(".equals(token)) {
				operatorStack.pushElement(token);
			}
            else if(")".equals(token))
            {
            	//while closed parenthesis is not found
                while(!("(".equals(operatorStack.topElement()))) {
                	postfixExpression += operatorStack.popElement();
                }                
                operatorStack.popElement();
            }
            else if(isOperator(token))
            {
                if(operatorStack.isEmpty() || "(".equals(operatorStack.topElement()) || getPrecedence(token) > getPrecedence(operatorStack.topElement())) {
                	operatorStack.pushElement(token);
                }
                else 
                {
                    while(!operatorStack.isEmpty() && !("(".equals(operatorStack.topElement())) && getPrecedence(token) <= getPrecedence(operatorStack.topElement())) {
                    	postfixExpression += operatorStack.popElement();
                    }
                    
                    operatorStack.pushElement(token);
                }
            }
            else {
            	postfixExpression += token;
            }
        }
        
        while(!operatorStack.isEmpty()) {
        	postfixExpression += operatorStack.popElement();
        }
       
        return postfixExpression;
		
	}
	
	/**
     * helper method to check if the given token is an operator or not
     * @param token
     * @return boolean value
     */
    private static boolean isOperator(String token)
    {
        boolean isOperator = false;
        
        switch(token)
        {
            case "+":
            case "-":
            case "*":
            case "/":
            case "==":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
            case "&&":
            case "||":
            case "!":   isOperator = true;
                        break;
            
            default : isOperator = false;
            
        }
        
        return isOperator;
    }
    
    /**
     * helper method used to get the precedence of the given operator
     * @param operator
     * @return precedence of the operator
     */
    private static int getPrecedence(String operator)
    {
        int precedence = 0;
        
        switch(operator)
        {
            case "+": precedence = 5;
                      break;
                      
            case "-": precedence = 5;
                      break;
                      
            case "*": precedence = 6;
                      break;
                      
            case "/": precedence = 6;
                      break;
                      
            case "==":precedence = 3;
                      break;
                      
            case "!=":precedence = 3;
                      break;
                      
            case "<": precedence = 4;
                      break;
                      
            case ">": precedence = 4;
                      break;
                      
            case "<=":precedence = 4;
                      break;
                      
            case ">=":precedence = 4;
                      break;
                      
            case "&&":precedence = 2;
                      break;
                      
            case "||":precedence = 1;
                      break;
                      
            case "!": precedence = 7;
                      break;            
        }
        
        return precedence;
    }
	
}
