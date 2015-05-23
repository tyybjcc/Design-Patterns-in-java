package com.designpattern.behavioral.null_object;

public class Client {
	
	public static void main(String[]args) {
		ObjectFactory objFac = ObjectFactory.getInstance();
		(objFac.getObject("one")).request();
		(objFac.getObject("two")).request();
		//null object request
		(objFac.getObject("null")).request();	//do nothing
	}

}
