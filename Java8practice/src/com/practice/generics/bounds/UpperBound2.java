package com.practice.generics.bounds;

import java.util.ArrayList;
import java.util.List;

public class UpperBound2 {
    public static void main(String...s){

	List<Eagle> eagles =new ArrayList<Eagle>();
	eagles.add(new Eagle());
	eagles.add(new Eagle());
	List<Bird> birds =new ArrayList<Bird>();
	birds.add(new Bird());
	birds.add(new Bird());
	List<Sparrow> sparrows =new ArrayList<Sparrow>();
	sparrows.add(new Sparrow());
	sparrows.add(new Sparrow());
	check(birds);
	check(eagles);
	check(sparrows);
    }

    public static void  check(List< ? extends Bird> birds){
	for(Bird b:birds){
	    System.out.println(b);
	}
    }
}
