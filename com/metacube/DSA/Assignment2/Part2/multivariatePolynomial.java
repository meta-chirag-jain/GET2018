package GET2018.com.metacube.DSA.Assignment2.Part2;

import java.util.List;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is used to visualize a multivariate polynomial using nested linked list.
 * @author Chirag Jain
 * 
 */
public class MultivariatePolynomial {

	private List<Term> multivariate;
	
	public MultivariatePolynomial(List<Term> multivariate) {
		this.multivariate = multivariate;
	}
	
	/**
	 * Copyright (c) 2018 Metacube.com. All rights reserved.
	 * This class defines a term of a multivariate polynomial.
	 * @author Chirag Jain
	 * 
	 */
	public static class Term {
		public double coefficient;
		public List<VariableList> variableList;
		
		public Term(double coefficient, List<VariableList> variableList) {
			this.coefficient = coefficient;
			this.variableList = variableList;
		}
		
	}
	
	/**
     * Copyright (c) 2018 Metacube.com. All rights reserved.
     * This class defines all present variables in a term of multivariate polynomial.
     * @author Chirag Jain
     * 
     */
	public static class VariableList {
		private char variable;
		private int power;
		
		public VariableList(char variable, int power) {
			this.variable = variable;
			this.power = power;
		}
		
	}
	
	/*public void display() {
		for(Term term: multivariate) {
			System.out.print(term.coefficient);
			for(VariableList variables: term.variableList) {
				System.out.print(" * " + variables.variable + "^" + variables.power);
			}
			if(term != multivariate.get(multivariate.size() - 1)) {
				System.out.print(" + ");
			}
		}
	}*/
	
	/**
	 * 
	 * @return multivariate polynomial with all the terms in it.
	 */
	public String visualisedMultivariatePolynomial() {
		String polynomial = "";
		for(Term term: multivariate) {
			polynomial += term.coefficient;
			for(VariableList variables: term.variableList) {
				polynomial += " * " + variables.variable + "^" + variables.power;
			}
			if(term != multivariate.get(multivariate.size() - 1)) {
				polynomial += " + ";
			}
		}
		return polynomial;
	}
	
}