package com.designpattern.behavioral.chain_of_responsibility;

public class Client {
	
	public static void main(String[] args) {
		Request request = new Request(2, "request with code2");
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		
		handler1.setNext(handler2).setNext(handler3);
		Response response = handler1.handleMessage(request);
		
		System.out.println("\nResults:");
		System.out.println(response);
	}

}
