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
}
