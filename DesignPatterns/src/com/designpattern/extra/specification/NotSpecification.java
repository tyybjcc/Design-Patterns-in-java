package com.designpattern.extra.specification;

public class NotSpecification<T> extends CompositeSpecification<T>{
	private ISpecification<T> spec;
	public NotSpecification(ISpecification<T> _spec) {
		this.spec = _spec;
	}
	
	@Override
	public boolean isSatisfiedBy(T candidate) {
		return ! this.spec.isSatisfiedBy(candidate);
	}

}
