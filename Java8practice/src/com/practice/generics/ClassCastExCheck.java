package com.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExCheck {

    static void main(String...s){
	List Apples =new ArrayList();
	Apples.add(new Apple());
	Check(Apples);
    }
    static void Check(List<Mango> mangos){
	for(Mango m:mangos){
	    System.out.println(m);
	}

    }
}
class Apple{}
class Mango{}
