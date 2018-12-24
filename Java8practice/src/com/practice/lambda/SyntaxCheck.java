package com.practice.lambda;

import java.util.function.Predicate;

public class SyntaxCheck {

    public static void main(String[] args) {
	Runnable r=()-> System.out.println("run");
	Predicate<String> p1=(s)-> s.isEmpty();
	//Predicate<String> p2=(s)-> return s.isEmpty();
	//the above p2is wrong syntax when you specify return you need to have parenthesis
	Predicate<String> p3=(s)-> {return s.isEmpty();};
    }

}
