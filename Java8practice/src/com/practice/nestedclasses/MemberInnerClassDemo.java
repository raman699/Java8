package com.practice.nestedclasses;

public class MemberInnerClassDemo {

    static int i=0;
    class MICStaticCheck{
	static final  int h=9;
	void checkStaticEC(){
	    System.out.println(i);
	}


    }
    public void check(){
	System.out.println(h);
    }
}

