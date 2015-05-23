package com.designpattern.behavioral.interpreter;

public class TerminalExpression extends Expression{

	@Override
	public Object interpreter(Context ctx) {
		//one TerminalExpression in common. At most, it is used for data conversion
		return null;
	}
	

}
