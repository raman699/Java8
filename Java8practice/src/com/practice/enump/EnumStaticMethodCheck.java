package com.practice.enump;

public enum EnumStaticMethodCheck {
    VAR1,VAR2{
	public static void check1(){
	    System.out.println("this is a static metod ");
	}
    };
    public static void check(){
	System.out.println("this is a static metod ");
    }
    public static void main(String...s){
	VAR1.check();
	check();
    }

}
//static methods cannot be declared in variable scope