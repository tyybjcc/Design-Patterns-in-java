package com.designpattern.behavioral.interpreter;

import java.util.Stack;

public class Client {
	
	public static void main(String[] args) {
		Context ctx = new Context();
		//used when generation expression invacation tree
		Stack<Expression> stack = null;
		//create expression invocation tree
		for(;;) {
			break;
		}
		//get the final Expression
		Expression exp = stack.pop();
		//interpret expressions recursively
		exp.interpreter(ctx);
	}

}
