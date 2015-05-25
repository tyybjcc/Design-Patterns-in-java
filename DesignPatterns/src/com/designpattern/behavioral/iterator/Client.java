package com.designpattern.behavioral.iterator;

import java.util.Iterator;

public class Client {
	
	public static void main(String[]args) {
		Circulation<Integer> cir = new Circulation<Integer>();
		for(int i=0; i<10; i++) {
			cir.add(i);
		}
		
		//use iterator
		Iterator<Integer> iterator = cir.iterator(); 
		int maxCount=1;
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			if(++maxCount>15) break;
		}
		
		//Iterable<T> interface implementation is a must, or "for:" cannot be used here.
		for(Integer i:cir) {
			
		}
		
		/*
		//fake remove
		System.out.println("\nremove:");
		maxCount=1;
		while(iterator.hasNext()) {
			System.out.println(maxCount++);
			iterator.remove();
		}
		*/
	}

}
