package com.practice.concurrentAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StateFulNessCheck {


    public static void main(String...s){

	List<Integer> data=Collections.synchronizedList(new ArrayList());
	Arrays.asList(1,2,3,4,5,6).parallelStream()
	.map(a->{data.add(a); return a;})
	.forEachOrdered(System.out::print);
	System.out.println();
	for(Integer i :data) {
	    System.out.println(i);
	}
	System.out.println(data);
    }



}
