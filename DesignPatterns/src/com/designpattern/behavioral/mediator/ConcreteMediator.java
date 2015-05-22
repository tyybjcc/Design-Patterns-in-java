package com.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
	private List<Colleague> colleagues;
	private List< List<Colleague> > subscription;
	
	public ConcreteMediator() {
		this.colleagues = new ArrayList<Colleague>();
		this.subscription = new ArrayList<List<Colleague>>();
	}
	
	//colleague registration
	public void addColleague(Colleague colleague) {
		this.colleagues.add(colleague);
		this.subscription.add( new ArrayList<Colleague>() );
	}
	public void removeColleague(Colleague colleague) {
		int index = this.colleagues.indexOf(colleague);
		this.colleagues.remove(index);
		this.subscription.remove(index);
	}

	
	
	@Override
	public int publish(Colleague colleague, String msg) throws Exception {
		int index = this.colleagues.indexOf(colleague);
		if(index == -1) {
			throw new Exception("colleague not found exception");
		} else {
			//publish
			List<Colleague> targets = this.subscription.get(index);
			for(Colleague c:targets) {
				c.dealWithMessage(msg);
			}
			return targets.size();
		}		
	}

	@Override
	public boolean subscribe(Colleague subscribe, Colleague subscribedTo) throws Exception {
		int subIndex = this.colleagues.indexOf(subscribe);
		int besubIndex = this.colleagues.indexOf(subscribedTo);
		if(subIndex==-1 || besubIndex==-1) {
			throw new Exception("colleague not found exception");
		}
		List<Colleague> subscribers = this.subscription.get(besubIndex);
		if(subscribers.contains(subscribe)) {
			return false;
		}else {
			subscribers.add(subscribe);
			return true;
		}
		
	}

	@Override
	public boolean unsubscribe(Colleague unsubscribe, Colleague unsubscribedTo) throws Exception{
		int subIndex = this.colleagues.indexOf(unsubscribe);
		int besubIndex = this.colleagues.indexOf(unsubscribedTo);
		if(subIndex==-1 || besubIndex==-1) {
			throw new Exception("colleague not found exception");
		}
		List<Colleague> subscribers = this.subscription.get(besubIndex);
		if(subscribers.contains(unsubscribe)) {
			subscribers.remove(unsubscribe);
			return true;
		}else {
			return false;
		}
	}
	
	
	

}
