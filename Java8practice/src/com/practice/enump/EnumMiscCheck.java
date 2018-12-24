package com.practice.enump;

public enum EnumMiscCheck {

    VAR1;

    public static void main(String...s){

    }
    EnumMiscCheck(int i){
	System.out.println("this is from construtor");
    }
}
//so if we don;t give the right constructor we may get an error
//even the the right data type of constructor parameter is important
//like u define a constructor of int and pass the value string in enum constant