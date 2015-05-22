package com.designpattern.structural.decorator;


public class Client {
	public static void main(String[]args){
		Component com = new ConcreteComponent();
		com.operation();
		
		Decorator dec = new ConcreteDecorator(com);
		dec.operation();
		
		System.out.println();
		Decorator decDouble = new ConcreteDecorator(dec);
		decDouble.operation();
		
	}

}
