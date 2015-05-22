package com.designpattern.structural.proxy;

public class Proxy implements ISubject{
	ISubject subject;
	
	// this contruction or below
	public Proxy(ISubject _subject) {
		this.subject = _subject;
	}
	
	public Proxy() {
		this.subject = new Subject();
	}
	
	@Override
	public void request() {
		System.out.println("Proxy invoke:");
		System.out.print("\t");
		this.subject.request();
	}
	

}
