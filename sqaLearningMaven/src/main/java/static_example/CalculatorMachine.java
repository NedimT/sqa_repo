package static_example;

import org.apache.log4j.Logger;

import basiclearning.LogExample;

public class CalculatorMachine {
	private static final Logger log = Logger.getLogger(CalculatorMachine.class);
	public static void main(String args[]){
		int a = 10;
		int b = 2;
		log.warn(a+" + "+b+" = "+Calculator.add(a, b));
		log.warn(a+" - "+b+" = "+Calculator.substract(a, b));
		log.warn(a+" / "+b+" = "+Calculator.divide(a, b));
		log.warn(a+" * "+b+" = "+Calculator.multiply(a, b));
	}
}
