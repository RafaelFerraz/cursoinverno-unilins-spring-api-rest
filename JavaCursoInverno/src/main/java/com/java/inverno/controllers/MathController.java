package com.java.inverno.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.inverno.math.SimpleMath;

@RestController
@RequestMapping (path = "/math")

public class MathController {
	
	private SimpleMath simpleMath;
	
	public MathController() {
		simpleMath = new SimpleMath();
	}
	
	@GetMapping(path = "/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) {
		return simpleMath.sum(numberOne, numberTwo);
	}
	
	@GetMapping(path = "/sub/{numberOne}/{numberTwo}")
	public Double sub(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) {
		return simpleMath.sub(numberOne, numberTwo);
	}
	
	@GetMapping(path = "/mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) {
		return simpleMath.mult(numberOne, numberTwo);
	}
	
	@GetMapping(path = "/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) {
		return simpleMath.div(numberOne, numberTwo);
	}
	
	@GetMapping(path = "/med/{numberOne}/{numberTwo}")
	public Double med(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) {
		return simpleMath.med(numberOne, numberTwo);
	}
	
	@GetMapping(path = "/sqrt/{number}")
	public Double sqrt(@PathVariable(name = "number") String number) {
		return simpleMath.sqrt(number);
	}
}
