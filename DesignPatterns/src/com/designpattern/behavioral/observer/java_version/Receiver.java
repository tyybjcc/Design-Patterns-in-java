package com.designpattern.behavioral.observer.java_version;

import java.util.Observable;
import java.util.Observer;	//using jdk instead of mine

public class Receiver implements Observer{
	private String name;
	public Receiver(String _name) {
		this.name = _name;
	}

	@Override
	public void update(Observable o, Object arg) {
		String info = (String)arg;
		System.out.println(this.name+" received info: " + info);
	}

}
