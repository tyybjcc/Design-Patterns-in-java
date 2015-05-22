package com.designpattern.behavioral.mediator;

public class Client {
	
	public static void main(String[]args) {
		Mediator med = new ConcreteMediator();
		Colleague c1 = new ConcreteColleague(med,"c1");
		Colleague c2 = new ConcreteColleague(med,"c2");
		Colleague c3 = new ConcreteColleague(med,"c3");
		Colleague c4 = new ConcreteColleague(med,"c4");
		
		//subscription: c1 to c2,c3
		c1.subscribe(c1);//subscribe itself
		c2.subscribe(c1);
		c3.subscribe(c1);
		c4.subscribe(c1);
		
		//subscription: c3 to c2
		c2.subscribe(c3);
		
		//work
		c1.publish("c1-msg");
		c2.publish("c2-msg");
		c3.publish("c3-msg");
		
		c1.publish("hello");
	}

}
