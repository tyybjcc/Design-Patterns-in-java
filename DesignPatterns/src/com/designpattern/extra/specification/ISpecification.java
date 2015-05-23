package com.designpattern.extra.specification;

public interface ISpecification<T> {
	public boolean isSatisfiedBy(T candidate);
	
	public ISpecification<T> add(ISpecification<T> spec);
	public ISpecification<T> or(ISpecification<T> spec);
	public ISpecification<T> not();

}
