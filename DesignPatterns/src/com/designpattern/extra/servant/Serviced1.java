package com.designpattern.extra.servant;

public class Serviced1 extends AbstractServiced{
	public Serviced1() {
		super();
	}

	@Override
	public void serviced(Servant _servant) {
		System.out.println(_servant + " is serving by Serviced1.");
	}

}
