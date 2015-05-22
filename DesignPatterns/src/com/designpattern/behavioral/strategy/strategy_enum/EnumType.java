package com.designpattern.behavioral.strategy.strategy_enum;

import java.util.Arrays;

public enum EnumType implements EnumTypeInterface{
	
	//public static final Object
	EnumValue1("constant1","sharable1") {
		@Override
		public void sayHello() {
			System.out.println("hello, I am EnumValue"+this.getConstantField());
		}
	},
	EnumValue2("constant2","sharable2") {
		@Override
		public void sayHello() {
			System.out.println("hello, I am EnumValue"+this.getConstantField());
		}
	},
	EnumValue3("constant3","sharable3") {
		@Override
		public void sayHello() {
			System.out.println("hello, I am EnumValue"+this.getConstantField());
		}
	};
	
	
	
	//sharable and constant field
	private final String constantField;
	private String sharableField;
	
	//private
	EnumType(String _constantField, String _sharableField) {
		this.constantField = _constantField;
		this.sharableField = _sharableField;
	}

	//getters and setters
	public String getConstantField() {
		return constantField;
	}
	public String getSharableField() {
		return sharableField;
	}
	public void setSharableField(String _sharableField) {
		this.sharableField = _sharableField;
	}
	
	
	@Override
	public void enumFunction() {
		System.out.println(this.toString() +" enum function");
	}
	
	/*
	@Override
	public String toString() {
		// default toString is to return Name from EnumType Object
		return super.toString();
	}
	*/
	
	//abstract method (for each EnumType Object to implement)
	public abstract void sayHello();
	
}
