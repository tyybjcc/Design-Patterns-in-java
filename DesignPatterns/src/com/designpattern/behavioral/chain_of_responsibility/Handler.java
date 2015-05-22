package com.designpattern.behavioral.chain_of_responsibility;

public abstract class Handler {
	//next handler
	private Handler nextHandler;
	
	//could invoke this function in a row, i.e: setNext(h1).setNext(h2).setNext(h3)...
	public Handler setNext(Handler _handler) {
		this.nextHandler = _handler;
		return this.nextHandler;
	}
	
	public final Response handleMessage(Request request) {
		//deal with the request by this handler
		if(request.getCode() == this.getProcessibleCode()) {
			return this.deal(request);
		}
		
		//deal by the latter handlers
		if(this.nextHandler!=null) {
			System.out.println(this+" throws the request to another handler");
			return this.nextHandler.handleMessage(request);
		}
		
		//no other handler, return null response
		return Response.NullResponse;
		
	}
	
	
	//
	protected abstract Response deal(Request request);
	
	protected abstract int getProcessibleCode();

}
