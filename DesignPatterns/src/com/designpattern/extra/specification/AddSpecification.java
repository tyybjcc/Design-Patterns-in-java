package com.designpattern.extra.specification;

public class AddSpecification<T> extends CompositeSpecification<T>{
	private ISpecification<T> left;
	private ISpecification<T> right;
	public AddSpecification(ISpecification<T> _left, ISpecification<T> _right) {
		this.left = _left;
		this.right = _right;
	}
	
	@Override
	public boolean isSatisfiedBy(T candidate) {
		return this.left.isSatisfiedBy(candidate) && this.right.isSatisfiedBy(candidate);
	}

}
