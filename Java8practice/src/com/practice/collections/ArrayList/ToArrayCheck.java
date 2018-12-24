package com.practice.collections.ArrayList;

import java.util.ArrayList;

public class ToArrayCheck {

    public static void main(String...s){
	ArrayList<Integer> al =new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	Object o []=al.toArray();
	//Integer i []=(Integer[])al.toArray();
	//this is giving a classcastexception
	for (Object i1:al){
	    System.out.println(i1);
	}
	Integer n[]=al.toArray(new Integer[3] );
	System.out.println(n.length);
    }
}
