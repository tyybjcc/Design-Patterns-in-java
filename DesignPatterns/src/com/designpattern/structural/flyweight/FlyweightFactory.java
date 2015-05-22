package com.designpattern.structural.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	//resuable flyweights storage
	private Hashtable<Integer,State> sharedStates = new Hashtable<Integer,State>();
	
	public FlyweightFactory() {
		sharedStates.put(new Integer(1), new State(1,"one"));
		sharedStates.put(new Integer(2), new State(2,"one"));
		sharedStates.put(new Integer(3), new State(3,"one"));
	}
	
	public Flyweight getInstance(int i) {
		i = Math.abs(i)%3+1;
		return new Flyweight( sharedStates.get(new Integer(i)), new State(i,i+"state") ); 
	}
	
}
