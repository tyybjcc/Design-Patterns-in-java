package com.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Circulation<T extends Object> implements Iterable{
	private List<T> list = new ArrayList<T>();

	@Override
	public Iterator iterator() {
		return new CirculationIterator(this.list);
	}
	
	public T get(int index) {
		return list.get(index);
	}
	
	public void add(T e) {
		list.add(e);
	}
	
	public void remove(int index) {
		this.list.remove(index);
	}
	
	public void remove(T e) {
		this.list.remove(e);
	}
	
	public void set(int index, T e) {
		this.list.set(index, e);
	}

	

}
