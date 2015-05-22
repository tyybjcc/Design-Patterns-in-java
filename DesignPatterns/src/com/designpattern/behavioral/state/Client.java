package com.designpattern.behavioral.state;

public class Client {
	
	public static void main(String[]args) {
		Context ctx = new Context(StateA.getInstance());
		ctx.handle1();
		ctx.handle1();
	}

}
