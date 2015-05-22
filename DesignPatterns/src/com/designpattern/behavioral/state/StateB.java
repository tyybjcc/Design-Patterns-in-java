package com.designpattern.behavioral.state;

public class StateB extends State{
	private StateB(){}
	private static StateB thisState = new StateB(); 
	
	//singleton
	public static State getInstance() {
		return StateB.thisState;
	}
	
	@Override
	public void handle1(Context ctx) {
		System.out.println("invoke StateB handl1;");
		ctx.setState(StateA.getInstance());
	}

	@Override
	public void handle2(Context ctx) {
		System.out.println("invoke StateB handl2;");
		ctx.setState(StateA.getInstance());
	}

}
