package com.designpattern.behavioral.memento;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * backup to memento
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(this.state);
	}
	
	/**
	 * restore from an existing memento
	 * @param _memento
	 */
	public void restoreFromMemento(Memento _memento) {
		if(_memento==null) {
			System.out.println("memento not found, return null;");
		} else {
			this.setState(_memento.getState());
		}
	}
	

}
