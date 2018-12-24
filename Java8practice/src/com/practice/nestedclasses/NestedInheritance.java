package com.practice.nestedclasses;

public class NestedInheritance {

    class NS1{}
    class NS2 extends NS1{}
    public void check(){
	boolean b=(null instanceof Object);
	String s="check";
	boolean b1=(s instanceof null);
    }
}
