package com.designpattern.creational.singleton;

public class Singleton {
	//1. private construction method
	private Singleton(){}
	//2. private and unique Singleton object holder
	private static final Singleton INSTANCE = new Singleton();
	
	public Singleton getInstance(){
		return this.INSTANCE;
	}
}
