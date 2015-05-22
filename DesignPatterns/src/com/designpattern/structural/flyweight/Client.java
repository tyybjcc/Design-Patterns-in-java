package com.designpattern.structural.flyweight;

public class Client {
	
	public static void main(String[]args) {
		FlyweightFactory factory = new FlyweightFactory();
		java.util.Random random = new java.util.Random();
		for(int i=0; i<10; i++) {
			int code = random.nextInt(1000);
			Flyweight flyweight = factory.getInstance(code);
			flyweight.operation();
		}
	}

}
