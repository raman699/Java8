package com.practice.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerCheck {

    public static void main(String...s){
	Consumer<String> con= System.out::println;
	Consumer<String> cons1= s1->System.out.println(s1);
	con.accept("raman was here");
	cons1.accept(con.toString());

    }
}
