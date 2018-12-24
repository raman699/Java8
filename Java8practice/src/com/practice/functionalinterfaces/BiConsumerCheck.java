package com.practice.functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerCheck {
    public static void main(String...s){
	Map<String,Integer> map=new HashMap();
	BiConsumer<String,Integer> biCons=map::put;
	//calling by an instance method reference
	BiConsumer<String,Integer> biCons1=
		(k,v)->
	{
	    System.out.println(map.put(k, v));

	};
	//constructing an object using lambda expression
	biCons.accept("raman", 3);
	biCons1.accept("raman", 2);
	System.out.println(map);
	//hashMap overrides the previous value of the key
    }
}
