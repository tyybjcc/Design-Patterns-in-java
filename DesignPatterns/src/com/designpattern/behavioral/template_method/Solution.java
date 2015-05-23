package com.designpattern.behavioral.template_method;

public abstract class Solution {
	public void solve() {
		System.out.println("solve problem:");
		this.templateMethod();
	}
	
	private void templateMethod() {
		this.step1();
		this.step2();
		this.step3();
		this.stepEnd();
	}
	
	protected abstract void step1();
	protected abstract void step2();
	protected abstract void step3();
	
	private void stepEnd() {
		System.out.println("solve problem end.");
	}
	
}
