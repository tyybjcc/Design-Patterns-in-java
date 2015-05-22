package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[]args) {
		Component tree = buildTree();
		printTree(tree,0);
	}
	
	private static Component buildTree() {
		
		return formatTree( buildTreeAndGetRoot() );
	}
	
	/**
	 * build tree step1
	 * @return
	 */
	private static Component buildTreeAndGetRoot(){
		Composite root = new Composite("root");
		root.addChild(new Composite("1-1")).addChild(new Composite("2-1")).addChild(new Composite("3-1"));
		
		Composite node1_2 = root.addChild(new Composite("1-2"));
		node1_2.addChild(new Composite("2-2"));
		node1_2.addChild(new Composite("2-3"));
		
		root.addChild(new Composite("1-3"));
		
		Composite node2_4 = root.addChild(new Composite("1-4")).addChild(new Composite("2-4"));
		node2_4.addChild(new Composite("3-2"));
		node2_4.addChild(new Composite("3-3"));
		
		return root;
	}
	
	/**
	 * buildtree -> step2
	 * @param node
	 * @return
	 */
	private static Component formatTree(Component node) {
		if( node instanceof Leaf) return node;
		
		List<Component> children =((Composite)node).getChildren();
		
		//if component has no child, convert it into Leaf
		if(children.size()==0) return new Leaf(node.getName());
		
		//format tree recursively and return the composite
		for(int i=0; i<children.size(); i++) {
			children.set(i, formatTree(children.get(i)));
		}
		return node;
	}
	
	/**
	 * print tree recursively
	 * @param node
	 * @param lvl
	 */
	private static void printTree(Component node, int lvl) {
		printLvl(lvl);
		node.doThis();
		if(node instanceof Composite) {
			List<Component> children = ((Composite)node).getChildren();
			for(int i=0; i<children.size(); i++) {
				printLvl(lvl+1);
				printTree(children.get(i),lvl+1);
			}
			
		}
	}
	
	private static void printLvl(int n) {
		for(int i=0; i<n; i++) {
			System.out.print("---- ");
		}
	}
	

}
