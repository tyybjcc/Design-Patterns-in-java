package com.designpattern.creational.builder;

import com.designpattern.creational.builder.Builder;

//many concrete builder could be built
public class ConcreteBuilder extends Builder {
	@Override
	public void buildPart1() {
		super.product.setPart1("mypart1");
	}
	@Override
	public void buildPart2() {
		super.product.setPart2("mypart2");
	}
}