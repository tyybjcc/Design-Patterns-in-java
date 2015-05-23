package com.designpattern.behavioral.template_method;

public class Client {
	
	public static void main(String[]args) {
		Solution sln = new ConcreteSolution1();
		sln.solve();
		
		System.out.println();
		sln = new ConcreteSolution2();
		sln.solve();
		
	}
	
	

}
