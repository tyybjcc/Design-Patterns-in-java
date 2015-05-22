package com.designpattern.behavioral.strategy;

public class AlgorithmImpl1 implements Algorithm{
	

	@Override
	public Object solve(Object input) {
		return "AlgorithmImp1 solve problem: "+input;
	}

}
