package com.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Iterable<T> generic type T mustn't be ignored
public class Circulation<T> implements Iterable<T>{
	private List<T> list = new ArrayList<T>();

	@Override
	public Iterator<T> iterator() {
		return new CirculationIterator();
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
	
	
	//iterator should be an inner class
	private class CirculationIterator implements Iterator<T>{
		private int pos;
		private int size;
		Set<Integer> deleted = new HashSet<Integer>();
		private boolean nextNotFoundTag = false;
		
		public CirculationIterator(){
			pos = 0;
			size = list.size();
		}

		@Override
		public boolean hasNext() {
			return (size!=0);
		}

		@Override
		public T next() {
			if(this.hasNext()) {
				T rtn = list.get(this.pos);
				findNext();
				return rtn;
			}else{
				return null;
			}
		}
		
		//fake remove: mark removed elements instead of real removing from Circulation
		@Override
		public void remove() {
			size--;
			deleted.add(new Integer(pos));
			this.findNext();
		}
		
		private void findNext() {
			for(int i=0; i<list.size(); i++) {
				pos = (++pos)%list.size();
				if(!deleted.contains(pos)){
					return;
				}
			}
			nextNotFoundTag = true;
		}

	}
	

}
