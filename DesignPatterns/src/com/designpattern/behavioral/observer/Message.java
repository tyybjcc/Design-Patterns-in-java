package com.designpattern.behavioral.observer;

public class Message {
	private int code;
	private String msg;
	public Message(int _code, String _msg) {
		this.msg = _msg;
		this.code = _code;
	}
	
	@Override
	public String toString() {
		return "Message: "+code+", "+msg;
	}
}
