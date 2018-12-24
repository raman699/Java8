package com.practice.collections.ArrayList;

import java.util.ArrayList;

public class ArrayListAddNegIndexCheck
{

    public static void main(String...s)
    {
	ArrayList al= new ArrayList();
	al.add("String");
	al.add("int");
	//al.add(-2, "ddf");
	//java.lang.IndexOutOfBoundsException
	///al.add(6,9);
	//java.lang.IndexOutOfBoundsException
	//al.remove(8);
	//java.lang.IndexOutOfBoundsException
	al.remove(-2);
	//java.lang.ArraysIndexOutOfBoundsException
	System.out.println(al);
    }
}
