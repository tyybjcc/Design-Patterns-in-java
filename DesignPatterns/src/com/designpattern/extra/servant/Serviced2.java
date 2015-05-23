package com.designpattern.extra.servant;

public class Serviced2 extends AbstractServiced{
	public Serviced2() {
		super();
	}

	@Override
	public void serviced(Servant _servant) {
		System.out.println(_servant + " is serving by Serviced2.");
	}

}
