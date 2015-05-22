package com.designpattern.structural.bridge;

public class Client {
	public static void main(String[]args) {
		//commonly, there could be many concrete Implementors and many refined Abstractions.
		//then, the advantage of bridge pattern appears abviously.
		Abstraction abstraction = new RefinedAbstraction( new ConcreteImplementor() );
		abstraction.abstraction();
	}

}
