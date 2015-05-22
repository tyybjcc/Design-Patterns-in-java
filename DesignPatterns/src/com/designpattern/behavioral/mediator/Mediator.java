package com.designpattern.behavioral.mediator;

public interface Mediator {
	
	/**
	 * add colleague into control of this mediator
	 * @param colleague 
	 */
	public void addColleague(Colleague colleague);
	
	
	/**
	 * add colleague out of control of this mediator
	 * @param colleague
	 */
	public void removeColleague(Colleague colleague);
	
	/**
	 * 
	 * @param subscribe
	 * @param subscribedTo
	 * @return
	 * @throws Exception
	 */
	public boolean subscribe(Colleague subscribe, Colleague subscribedTo) throws Exception;
	
	/**
	 * 
	 * @param unsubscribe
	 * @param unsubscribedTo
	 * @return
	 * @throws Exception
	 */
	public boolean unsubscribe(Colleague unsubscribe, Colleague unsubscribedTo) throws Exception;

	/**
	 * publish message to all its subscribers. When this object doesn't exist, an exception throws out.
	 * @param colleague
	 * @param msg
	 * @return
	 * @throws Exception
	 */
	public int publish(Colleague colleague, String msg) throws Exception;
}
