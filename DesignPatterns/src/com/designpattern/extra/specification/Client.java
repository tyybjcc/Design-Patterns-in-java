package com.designpattern.extra.specification;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		//generate objects to measure
		List<Object> objs = new ArrayList<Object>();
		for(int i=0; i<10; i++) {
			objs.add(new Object());
		}
		
		//create business specification
		ISpecification<Object> spec1 = new BizSpecification1<Object>();
		ISpecification<Object> spec2 = new BizSpecification2<Object>();
		
		//filter objects and print
		for(Object obj:objs) {
			if( spec1.add(spec2).isSatisfiedBy(obj) ) {
				System.out.println(obj);
			}
		}
		
		
	}

}
