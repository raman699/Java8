package com.practice.generics;

public class ArrayCheckGeneric<T> {

    T t[];
    T t1;
    public static void main(String...s){
	int h[] =new int[9];
	String s1[]= new String[3];
	Object o[]=s1;
	o[1]=8;
	String hhhh="99";
	Object hh=h;
	hh=8;
	ArrayCheckGeneric<String> acg[] =new ArrayCheckGeneric<String>[3];

    }
}
//So we cannot create array of generic type