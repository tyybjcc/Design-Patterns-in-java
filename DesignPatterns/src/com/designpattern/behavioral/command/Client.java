package com.designpattern.behavioral.command;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Client {
	
	public static void main(String[]args) {
		Receiver r1 = new Receiver();
		//Object[] should be: ew Object[] {obj1,...}
		Command cmdAdd1 = new CommandReflect(r1,"add1", new Object[]{1} );
		Command cmdAdd2 = new CommandReflect(r1,"add2", new Object[]{1,3} );
		
		r1.printState();
		cmdAdd1.execute();
		r1.printState();
		cmdAdd2.execute();
		r1.printState();
		
	}

}
