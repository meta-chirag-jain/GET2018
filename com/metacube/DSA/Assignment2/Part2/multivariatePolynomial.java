package GET2018.com.metacube.DSA.Assignment2.Part2;

import java.util.List;

public class MultivariatePolynomial {

	private List<Term> multivariate;
	
	public MultivariatePolynomial(List<Term> multivariate) {
		this.multivariate = multivariate;
	}
	
	public static class Term {
		public double coefficient;
		public List<VariableList> variableList;
		
		public Term(double coefficient, List<VariableList> variableList) {
			this.coefficient = coefficient;
			this.variableList = variableList;
		}
		
	}
	
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