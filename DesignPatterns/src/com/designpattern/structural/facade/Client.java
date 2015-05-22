package com.designpattern.structural.facade;

public class Client {
	public static void main(String[]args) {
		Facade facade = new Facade();
		facade.facadeFunction1();
		
		System.out.println();
		facade.facadeFunction2();
	}
}
