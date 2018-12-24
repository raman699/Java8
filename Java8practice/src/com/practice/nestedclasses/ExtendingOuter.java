package com.practice.nestedclasses;

import com.practice.nestedclasses.ExtendingOuter.InnerClass1.InnerL2;

public class ExtendingOuter {
    String message="hi";
    static class InnerClass extends ExtendingOuter {
	String message ="hello";
	private class InnerL2
	{
	    String message="satshriakal";
	}

    }
    public   class InnerClass1 extends ExtendingOuter {
	String message ="hello";
	public class InnerL2{//if i would have declared it and its enclosing class private
	    //it would have given an error
	    String message="satshriakal";
	}
    }
    public static void main(String...s){
	ExtendingOuter outer1 =new ExtendingOuter();
	ExtendingOuter outer =new InnerClass();
	ExtendingOuter.InnerClass in1=new InnerClass();
	InnerClass inner=new InnerClass();
	System.out.println(outer.message);
	System.out.println(inner.message);
	System.out.println(in1.message);
	InnerClass1 innerclass1=outer.new InnerClass1();
	InnerL2 inl2=innerclass1.new InnerL2();
	System.out.println(inl2.message);
    }

}
//static class are always referred by themselves

