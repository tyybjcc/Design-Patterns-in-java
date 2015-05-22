package com.designpattern.structural.bridge;

public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor _implementor) {
		super(_implementor);
	}
	
	@Override
	public void abstraction() {
		System.out.print("RefinedAbstration -> abstraction(): ");
		super.abstraction();
	}
}
