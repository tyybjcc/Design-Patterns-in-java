package com.designpattern.behavioral.chain_of_responsibility;

public class ConcreteHandler1 extends Handler{
	@Override
	public int getProcessibleCode() {
		return 1;
	}
	
	@Override
	public Response deal(Request request) {
		System.out.println("ConcreteHandler1 deal with: " + request.toString() );
		return new Response(1,"deal with ConcreteHandler1");
	}

}
