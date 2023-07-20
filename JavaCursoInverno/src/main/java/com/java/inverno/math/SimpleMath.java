package com.java.inverno.math;

import com.java.inverno.converters.MathConverter;

public class SimpleMath {
	
	public Double sum(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);
		
		return numberOneConverted + numberTwoConverted;
	}
	
	public Double sub(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);
		
		return numberOneConverted - numberTwoConverted;
	}
	
	public Double mult(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);
		
		return numberOneConverted * numberTwoConverted;
	}
	
	public Double div(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);
		
		return numberOneConverted / numberTwoConverted;
	}
	
	public Double med(String numberOne, String numberTwo) {
				
		return this.sum(numberOne, numberTwo) / 2;
	}
	
	public Double sqrt(String number) {
		var numberConverted = MathConverter.convert(number);
		
		return Math.sqrt(numberConverted);
	}
	
}
