package com.designpattern.behavioral.observer;

public class ConcreteObserver implements Observer{
	
	@Override
	public void deal(Message msg) {
		System.out.println("deal with message: " + msg);
	}

}
