package com.designpattern.behavioral.chain_of_responsibility;

public class ConcreteHandler2 extends Handler{
	@Override
	public int getProcessibleCode() {
		return 2;
	}
	
	@Override
	public Response deal(Request request) {
		System.out.println("ConcreteHandler2 deal with: " + request.toString() );
		return new Response(2,"deal with ConcreteHandler2");
	}

}
