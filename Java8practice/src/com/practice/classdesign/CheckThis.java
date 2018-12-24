package com.practice.classdesign;

public class CheckThis {
    int var;
    void check(){
	System.out.println(CheckThis.this.var);
	System.out.println(this.var);
    }
    public static void main(String...s){
	CheckThis checkThis=new CheckThis();
	checkThis.check();
    }
}
//this is also a syntax
//good one :CheckThis.this.var
