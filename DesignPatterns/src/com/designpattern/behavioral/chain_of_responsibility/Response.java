package com.designpattern.behavioral.chain_of_responsibility;

public class Response {
	int code;
	String msg;
	public final static Response NullResponse = new Response(0,"null"); 
	
	public Response(int code, String _msg) {
		this.code = code;
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
		return "Response:"+code+","+msg;
	}

}
