package com.designpattern.behavioral.command;

import java.lang.reflect.Method;

public class CommandReflect implements Command{
	private Object receiver;
	private Method method;
	private Object[] args;
	
	public CommandReflect(Object _receiver, String _methodName, Object[] _args) {
		this.receiver = _receiver;
		this.args = _args;
		//get method by reflection
			//get Object class and arguments' classes
		Class cls = receiver.getClass();
		Class[] argTypes = new Class[args.length];
		for(int i=0;i<argTypes.length;i++) {
			argTypes[i] = args[i].getClass();
		}
			//get method
		try {
			this.method = cls.getMethod(_methodName, argTypes);
		}catch(Exception e) {
			System.out.println("create command failed!");
			e.printStackTrace();
		}
	}
	
	public Object execute() {
		if(method == null ) {
			System.out.println("null method to execute!");
			return null;
		}else {
			try {
				return method.invoke(this.receiver, this.args);
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
	}

}
