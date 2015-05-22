package com.designpattern.behavioral.strategy.strategy_enum;

import java.util.Arrays;

public class Client {
	
	public static void main(String[]args) {
		
		//Enum Object methods
		for(EnumType enumvalue : EnumType.values() ) {
			System.out.println(enumvalue.ordinal());
			System.out.println(enumvalue.getClass());
			System.out.println(enumvalue.getDeclaringClass());
			System.out.println(enumvalue.name());
			System.out.println(enumvalue.toString());
			System.out.println(enumvalue);
			System.out.println("---------");
		}
		
		//use enum to store info
		System.out.println("\nretrieve EnumType.EnumValue1 info:");
		System.out.println(EnumType.EnumValue1.getConstantField());
		System.out.println(EnumType.EnumValue1.getSharableField());
		
		//use Enum to share exchange state
		System.out.println("\nexchange info within EnumType.EnumValue1.sharableField:");
		System.out.println( EnumType.EnumValue1.getSharableField() );
		EnumType.EnumValue1.setSharableField("sharable2");
		System.out.println( EnumType.EnumValue1.getSharableField() );
	}

}
