package com.java.inverno.math;

import com.java.inverno.converters.MathConverter;

public class SimpleMath {
	
	public Double sum(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);
		
		return numberOneConverted + numberTwoConverted;
	}
	
}
