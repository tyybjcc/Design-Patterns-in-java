package com.designpattern.behavioral.memento;

public class Client {
	
	public static void main(String[]args) {
		Originator origin = new Originator();
		origin.setState("state-one");
		
		//create a caretaker of size 4
		Caretaker caretaker = new Caretaker(3);
		
		//a series of backup and change state operations
		caretaker.setMemento("one", origin.createMemento());
		
		origin.setState("state-two");
		caretaker.setMemento("two", origin.createMemento());
		
		origin.setState("state-three");
		caretaker.setMemento("three", origin.createMemento());
		
		origin.setState("state-four");
		System.out.println(origin.getState());
		
		//restore the lastest memento
		origin.restoreFromMemento(caretaker.getLastMemento());
		System.out.println(origin.getState());
		
		//restore specified memento
		origin.restoreFromMemento(caretaker.getMementoByTag("one"));
		System.out.println(origin.getState());
		
		//the condition when mementoes is more than the size of caretaker
		origin.setState("four-state");
		caretaker.setMemento("four", origin.createMemento());
		origin.restoreFromMemento(caretaker.getMementoByTag("one"));	//state four will be covered
		System.out.println(origin.getState());
		
	}

}
