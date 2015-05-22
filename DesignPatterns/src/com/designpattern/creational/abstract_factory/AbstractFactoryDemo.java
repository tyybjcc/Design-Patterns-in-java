package com.designpattern.creational.abstract_factory;

public class AbstractFactoryDemo {
	//define a specified creator from two dimension: 1. what(China|USA) factory; 2. get what brand(BMW|Benz) car
	static abstract class AbstractCarFactory {
		public abstract AbstractBMWCar getBMW();
		public abstract AbstractBenzCar getBenz();
	}
	
	static class ChinaCarFactory extends AbstractCarFactory {
		@Override
		public AbstractBMWCar getBMW() {
			return new ChinaBMWCar();
		}
		@Override
		public AbstractBenzCar getBenz() {
			return new ChinaBenzCar();
		}
	}
	
	static class USACarFactory extends AbstractCarFactory {
		@Override
		public AbstractBMWCar getBMW() {
			return new USABMWCar();
		}
		@Override
		public AbstractBenzCar getBenz() {
			return new USABenzCar();
		}
	}
	
	static abstract class BaseAbstractCar {
		
	}
	
	static abstract class AbstractBMWCar extends BaseAbstractCar {
		
	}
	
	static abstract class AbstractBenzCar extends BaseAbstractCar {
		
	}
	//concrete BMW car
	static class ChinaBMWCar extends AbstractBMWCar {
		
	}
	
	static class USABMWCar extends AbstractBMWCar {
		
	}
	//concrete Benz car 
	static class ChinaBenzCar extends AbstractBenzCar {
		
	}
	
	static class USABenzCar extends AbstractBenzCar {
		
	}

}
