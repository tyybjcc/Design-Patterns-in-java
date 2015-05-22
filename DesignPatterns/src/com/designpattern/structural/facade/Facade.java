package com.designpattern.structural.facade;

public class Facade {
	SystemOne system1 = new SystemOne();
	SystemTwo system2 = new SystemTwo();
	SystemThree system3 = new SystemThree();
	SystemFour system4 = new SystemFour();
	
	public void facadeFunction1() {
		System.out.println("---- facade function 1");
		system1.methodOne();
		system3.methodThree();
		system4.methodFour();
		System.out.println("---- facade function 1 end");
	}
	
	public void facadeFunction2() {
		System.out.println("---- facade function 2");
		system2.methodTwo();
		system3.methodThree();
		System.out.println("---- facade function 2 end");
	}

}
