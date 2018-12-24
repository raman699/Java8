package com.practice.generics.methods;

import java.util.ArrayList;

public class SyntaxCheck {

    public  static <T> void  check(){
	System.out.println("Just declared before return type and we have not used it the formal type parameter");

    }
    public static <T>void check(T t){
	System.out.println("This is the value of T,here we have used ht formal type declared also :"+t);

    }
    public <T,K> void check(T t,K k){
	System.out.println("Here we have used multiple formal type parameter,t :"+t+",k:"+k);
	System.out.println("Also this is an insatnce methid while above two were static ");
    }
    //following syntax is also valid
    public <t> Check<t>  check1(t t){
	return new Check<t>();

    }
    //    public <t> static Check1<t>  check1(t t){
    //	return new Check<t>();
    //
    //    } this does not work
    public static void main(String...s){
	SyntaxCheck.<String>check();
	SyntaxCheck.check("hh");
	check("hh");
	//<String> check(); This is not a valid syntax

	SyntaxCheck.<String>check("it is a String");
	SyntaxCheck syntaxCheck=new SyntaxCheck();
	//SyntaxCheck<String>.check("it is a String");
	//wrong syntax above one
	syntaxCheck.<String,Integer>check("this is called by an instance", 3);
	syntaxCheck.check("this is called by an instance", 3);
	//both the above syntax means the same
	syntaxCheck.<ArrayList>check1(new ArrayList());
    }
}
class Check<T> {

    T chck(T t ){
	return t;
    }

}