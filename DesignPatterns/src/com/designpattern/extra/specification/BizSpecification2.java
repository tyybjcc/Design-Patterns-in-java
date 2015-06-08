package com.designpattern.extra.specification;

public class BizSpecification2<T> extends CompositeSpecification<T>{

	@Override
	public boolean isSatisfiedBy(T candidate) {
		return false;
	}

}
