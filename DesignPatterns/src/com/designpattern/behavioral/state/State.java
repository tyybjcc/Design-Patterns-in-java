package com.designpattern.behavioral.state;

public abstract class State {
	
	//not only handle requests, but also change context state
	public abstract void handle1(Context ctx);
	public abstract void handle2(Context ctx);

}
