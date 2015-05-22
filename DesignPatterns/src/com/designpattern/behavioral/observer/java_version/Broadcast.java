package com.designpattern.behavioral.observer.java_version;

import java.util.Observable;	//using jdk instead of mine

public class Broadcast extends Observable{
	public void broadcast(String info) {
		super.setChanged(); 	//setChanged() must be invoked, otherwise notifyObservers will take no effect 
		super.notifyObservers(info);
	}

}
