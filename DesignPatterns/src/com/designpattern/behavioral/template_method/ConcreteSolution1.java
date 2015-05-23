package com.designpattern.behavioral.template_method;

public class ConcreteSolution1 extends Solution{

	@Override
	protected void step1() {
		System.out.println("solution1 step1 running...");
	}

	@Override
	protected void step2() {
		System.out.println("solution1 step2 running...");
	}

	@Override
	protected void step3() {
		System.out.println("solution1 step3 running...");
	}

}
