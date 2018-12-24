package com.practice.enump;

public enum EnumMiscCheck2 {

    VAR1("low");

    public static void main(String...s){
	System.out.println(VAR1);//it will print VAR1
	System.out.println(VAR1.ordinal());//it will print 0
	//System.out.println(VAR1=="VAR1");
	//now how to print low
	/* actually you when u declare VAR1("low") u just passed a parameter in
	 * constructor but u did not catch it so how can u except it to retain the value
	 * so my dear friend first u need to decalre that instance variable and assign the value to it
	 *  see third example for it */

    }
    EnumMiscCheck2(String i){
	System.out.println("this is from construtor");
    }
}
//