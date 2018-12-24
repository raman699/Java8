package com.practice.generics.methods;

public class DifferentSyntax {
    <B extends A> B check(B b){
	System.out.println(b);
	//return new B();
	return b;
    }
    // in the next method B is used as the Classtype rather than parameter type
    <C extends A> C check1(B b){
	System.out.println(b);
	return   b;
    }
}
class A{}
class B extends A{}