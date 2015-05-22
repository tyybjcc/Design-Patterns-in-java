package com.designpattern.behavioral.strategy;

public class Client {

	public static void main(String[] args) {
		//client can switch algorithms flexibly
		Context ctx = new Context( new AlgorithmImpl1() );
		ctx.doSomething("myInput");
		
		ctx.setAlgorithm( new AlgorithmImpl2() );
		ctx.doSomething("myInput");
	}
}
