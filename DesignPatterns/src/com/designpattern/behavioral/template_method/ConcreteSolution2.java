package com.designpattern.behavioral.template_method;

public class ConcreteSolution2 extends Solution{

	@Override
	protected void step1() {
		System.out.println("solution2 step1 running...");
	}

	@Override
	protected void step2() {
		System.out.println("solution2 step2 running...");
	}

	@Override
	protected void step3() {
		System.out.println("solution2 step3 running...");
	}

}
