package com.designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * A caretaker class which could save at most {size} mementoes;
 * @author tyy
 *
 */
public class Caretaker {
	private List<Memento> mementoes;
	private List<String> saveTags;
	private int size = 1;
	private int pos = -1;
	
	public Caretaker() {
		this.mementoes = new ArrayList<Memento>();
		this.saveTags = new ArrayList<String>();
	}
	
	public Caretaker(int _size) {
		this();
		this.size = _size;
	}
	
	public void setMemento(String saveTag, Memento memento) {
		this.pos = (pos+1)%size;
		if(this.mementoes.size()<size ) {
			this.mementoes.add(memento);
			this.saveTags.add(saveTag);
		}else {
			this.mementoes.set(this.pos, memento);
			this.saveTags.set(pos, saveTag);
		}
	}
	
	/**
	 * if no appropriate memento exists, null returns;
	 * @return
	 */
	public Memento getLastMemento() {
		if(this.pos==-1) {
			return null;
		}
		return this.mementoes.get(this.pos);
	}
	
	/**
	 * if no appropriate memento exists, null returns;
	 * @param saveTag
	 * @return
	 */
	public Memento getMementoByTag(String saveTag) {
		int index = this.saveTags.indexOf(saveTag);
		if(index==-1) {
			return null;
		}else {
			return this.mementoes.get(index);
		}
	}

}
