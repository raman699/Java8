package com.practice.collections.ArrayList;

import java.util.ArrayList;

public class ArrayListSet {

    public static void main(String...s){
	ArrayList al=new ArrayList();
	System.out.println(al.size());

	al.set(0, "String");
	System.out.println(al);
    }
}
//It will give java.lang.IndexOutOfBoundsException: