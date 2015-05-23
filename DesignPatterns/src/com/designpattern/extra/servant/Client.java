package com.designpattern.extra.servant;

public class Client {
	
	public static void main(String[] args) {
		Servant servant= new Servant();
		servant.serve( new Serviced1() );
		servant.serve( new Serviced2()) ;
	}

}
