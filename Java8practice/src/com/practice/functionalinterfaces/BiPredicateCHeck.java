package com.practice.functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateCHeck {

    public static void main(String...s){
	BiPredicate<String,String> bip1=String::startsWith;
	BiPredicate<String,String> bip2=(str,prefix)->str.startsWith(prefix);
	System.out.println(bip1.test("chicken", "chick"));
	System.out.println(bip1.test("raman", "ram"));
    }
}
