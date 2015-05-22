package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	//children elements
	private List<Component> children = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}
	
	@Override
	public void doThis() {
		System.out.println("composite: " + super.name +"; have "+ this.children.size() + "children.");
	}
	
	//add child to composite
	public Component addChild(Component child) {
		this.children.add(child);
		return child;
	}
	
	//use Component return value to perform add operation in row
	public Composite addChild(Composite composite) {
		return (Composite)this.addChild((Component)composite);
	}
	
	public List<Component> getChildren() {
		return this.children;
	}

}
