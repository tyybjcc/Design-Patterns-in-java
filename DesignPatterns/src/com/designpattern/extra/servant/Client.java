package com.designpattern.extra.servant;

public class Client {
	
	public static void main(String[] args) {
		Servant servant= new Servant();
		AbstractServiced serviced = new Serviced1();
		
		servant.serve( serviced );
	}

}
