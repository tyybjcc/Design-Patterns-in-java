package com.designpattern.extra.servant;

public class Servant {
	
	public void serve(AbstractServiced serviced) {
		serviced.serviced(this);
	}

}
