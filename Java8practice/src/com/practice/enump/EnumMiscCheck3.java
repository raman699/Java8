package com.practice.enump;

public enum EnumMiscCheck3 {

    VAR1("low"),VAR2("HIGH");

    public static void main(String...s){

	System.out.println(VAR1.i);
    }
    String i;
    EnumMiscCheck3(String i){
	System.out.println("this is from construtor");
	this.i=i;
    }

}
//samjh ja ab apne app saare class constrcutor ke rile lgenege