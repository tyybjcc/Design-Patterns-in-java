package com.designpattern.behavioral.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CirculationIterator<T> implements Iterator<T>{
	private List<T> list;
	private int pos;
	private int size;
	Set<Integer> deleted = new HashSet<Integer>();
	private boolean nextNotFoundTag = false;
	
	public CirculationIterator(List<T> _list){
		this.list = _list;
		pos = 0;
		size = this.list.size();
	}

	@Override
	public boolean hasNext() {
		return (size!=0);
	}

	@Override
	public T next() {
		if(this.hasNext()) {
			T rtn = this.list.get(this.pos);
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
		for(int i=0; i<this.list.size(); i++) {
			pos = (++pos)%this.list.size();
			if(!deleted.contains(pos)){
				return;
			}
		}
		nextNotFoundTag = true;
	}

}
