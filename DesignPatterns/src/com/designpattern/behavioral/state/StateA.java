package com.designpattern.behavioral.state;

public class StateA extends State{
	private StateA(){}
	private static StateA thisState = new StateA(); 
	
	//singleton
	public static State getInstance() {
		return StateA.thisState;
	}
	
	@Override
	public void handle1(Context ctx) {
		System.out.println("invoke StateA handl1;");
		ctx.setState(StateB.getInstance());
	}

	@Override
	public void handle2(Context ctx) {
		System.out.println("invoke StateA handl2;");
		ctx.setState(StateB.getInstance());
	}

}
