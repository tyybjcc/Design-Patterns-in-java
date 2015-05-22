package com.designpattern.behavioral.chain_of_responsibility;

public class Request {
	int code;
	String msg;
	public Request(int _code, String _msg) {
		this.code = _code;
		this.msg = _msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "Request:"+code+","+msg;
	}
	
}
