package com.designpattern.structural.composite;

public class Leaf extends Component{
	protected Leaf(String _name) {
		super(_name);
	}
	@Override
	public void doThis() {
		System.out.println("leaf: "+ super.name);
	}

}
