package com.designpattern.behavioral.strategy;

public class Context {
	Algorithm algorithm;
	
	// construction: client must specify an algorithm for the context
	public Context(Algorithm _algorithm) {
		this.algorithm = _algorithm;
	}
	
	//client can switch algorithms
	public void setAlgorithm(Algorithm _algorithm) {
		this.algorithm = _algorithm;
	}
	
	public Object doSomething(Object input) {
		Object rtn = algorithm.solve(input); 
		System.out.println(rtn);
		return rtn;
	}

}
