package com.designpattern.behavioral.chain_of_responsibility;

public class ConcreteHandler3 extends Handler{
	@Override
	public int getProcessibleCode() {
		return 3;
	}
	
	@Override
	public Response deal(Request request) {
		System.out.println("ConcreteHandler3 deal with: " + request.toString() );
		return new Response(3,"deal with ConcreteHandler3");
	}

}
