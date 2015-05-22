package com.designpattern.creational.singleton.v2;

public class Singleton {
	//1. private construction method
	private Singleton(){}
	
	//2. holder the unique Singleton object by class
	/**
	 * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
	 * or the first access to SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		//note: private means INSTANCE could be accessed by this .java file, and thus outer class have access to it
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
