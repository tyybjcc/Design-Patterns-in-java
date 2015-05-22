package com.designpattern.creational.builder;

public class Product {
	private String part1;
	private String part2;
	public String getPart1() {
		return part1;
	}
	public void setPart1(String part1) {
		this.part1 = part1;
	}
	public String getPart2() {
		return part2;
	}
	public void setPart2(String part2) {
		this.part2 = part2;
	}
	
	@Override
	public String toString() {
		StringBuilder strbld = new StringBuilder();
		strbld.append(super.toString());
		strbld.append(":\n\tpart1:");
		strbld.append(part1);
		strbld.append(":\n\tpart2:");
		strbld.append(part2);
		return strbld.toString();
	}
}
