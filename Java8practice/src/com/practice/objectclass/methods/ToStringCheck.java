package com.practice.objectclass.methods;

public class ToStringCheck {

    public static void main(String[] args) {
	ToStringCheck o1 = new ToStringCheck();
	System.out.println(o1);

    }

    //this implementation will give StackOverFlowError
    @Override
    public String toString(){

	return this+"";
    }
}
