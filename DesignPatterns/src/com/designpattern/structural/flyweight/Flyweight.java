package com.designpattern.structural.flyweight;

public class Flyweight {
	//shareable state -- the intrinsic part of flyweight
	private State state;
	
	//unshareable state -- the extrinsic part of flyweight
	private State self_state;
	
	//construction 
	public Flyweight(State _state, State _self_state) {
		this.state = _state;
		this.self_state = _self_state;
	}
	
	public void operation() {
		System.out.println("Flyweight:");
		System.out.println("intrinsic part: " + this.state.toString() );
		System.out.println("extrinsic part: " + this.self_state.toString() );
	}

}
