package com.designpattern.behavioral.observer;

public class Client {
	
	public static void main(String[]args) {
		Subject sub = new Subject();
		Observer obs1 = new ConcreteObserver();
		Observer obs2 = new ConcreteObserver();
		
		sub.addObserver(obs1);
		sub.addObserver(obs2);
		
		sub.setState("stateA");
		sub.setState("stateB");
	}

}
