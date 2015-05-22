package com.designpattern.behavioral.observer.java_version;

public class Client {
	public static void main(String[] args) {
		Broadcast broadcast = new Broadcast();
		Receiver receiver1 = new Receiver("receiver1");
		Receiver receiver2 = new Receiver("receiver2");
		
		//bind broadcasting relationship
		broadcast.addObserver(receiver1);
		broadcast.addObserver(receiver2);
		
		//broadcasting
		broadcast.broadcast("hello");
		broadcast.broadcast("java");
		
	}

}
