package com.designpattern.structural.decorator;

public abstract class Decorator extends Component{
	private Component component;
	public Decorator(Component _component) {
		this.component = _component;
	}
	
	@Override
	public void operation() {
		System.out.println("/*");
		System.out.println("Decorator -> operation(): ");
		this.component.operation();
		this.enhancement();
		System.out.println("*/");
	}
	
	//visibility modifier at least be "protected"
	protected abstract void enhancement();

}
