package com.designpattern.behavioral.mediator;

public class ConcreteColleague extends Colleague{
	//the identifier of this colleague
	

	public ConcreteColleague(Mediator _mediator, String _name) {
		super(_mediator,_name);
		super.mediator.addColleague(this);
	}
	
	@Override
	public boolean subscribe(Colleague target) {
		try {
			return this.mediator.subscribe(this, target);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean unsubscribe(Colleague target) {
		try {
			return this.mediator.unsubscribe(this, target);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public void publish(String msg) {
		try {
			this.mediator.publish(this,msg);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
