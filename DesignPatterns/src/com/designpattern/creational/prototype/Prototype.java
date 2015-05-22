package com.designpattern.creational.prototype;

//interface Cloneable has no method 
public class Prototype implements Cloneable{
	String field1;
	String field2;
	String field3;
	String field4;
	String field5;
	long time1;
	long time2;
	long time3;
	long time4;
	long time5;
	long time6;
	long time7;
	int fieldInt;
	
	//a complicated construction
	public Prototype() {
		this.field1 = "field1";
		this.field2 = "field2";
		this.field3 = "field3";
		this.field4 = "field4";
		this.field5 = "field5";
		this.time1 = System.currentTimeMillis();
		this.time2 = System.currentTimeMillis();
		this.time3 = System.currentTimeMillis();
		this.time4 = System.currentTimeMillis();
		this.time5 = System.currentTimeMillis();
		this.time6 = System.currentTimeMillis();
		this.time7 = System.currentTimeMillis();
	}
	
	//a simple construction
	public Prototype(int _fieldInt) {
		this.fieldInt = _fieldInt;
	}
	
	@Override
	public Prototype clone() {
		Prototype cloned;
		try {
			cloned = (Prototype)super.clone();
		} catch(Exception e) {
			e.printStackTrace();
			cloned = null;
		}
		return cloned;
	}
	
	//test the speed of clone object and construct new one
	public static void main(String[]args) {
		final int CREATE_SIZE = 10000000;
		long time1;
		long time2;
		
		//clone new object
		time1 = System.nanoTime();
		Prototype motherPrototype = new Prototype();
		for(int i=1; i<CREATE_SIZE; i++) {
			Prototype sunPrototype = motherPrototype.clone();
		}
		time2 = System.nanoTime();
		System.out.println("clone   new   object: "+ (time2-time1) );
		
		//construct new object using simple construction
		time1 = System.nanoTime();
		for(int i=0; i<CREATE_SIZE; i++) {
			Prototype myPrototype = new Prototype(1);
		}
		time2 = System.nanoTime();
		System.out.println("construct new object: "+ (time2-time1)+" (Simple)" );
		
		//construct new object uisng complicated construction
		time1 = System.nanoTime();
		for(int i=0; i<CREATE_SIZE; i++) {
			Prototype myPrototype = new Prototype();
		}
		time2 = System.nanoTime();
		System.out.println("construct new object: "+ (time2-time1)+" (complicated)" );
	}
	//test result: for simple Object and simple construction, create new one is much more faster than clone from a old one
	//when the construction is complicated, you should think about cloning instead of constructing. 
}
