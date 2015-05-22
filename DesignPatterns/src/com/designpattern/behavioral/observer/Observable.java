package com.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	private List<Observer> observers;
	public Observable() {
		this.observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObservers(Message msg) {
		for(Observer obs : this.observers) {
			obs.deal(msg);
		}
	}
}
