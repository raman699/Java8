package com.practice.functionalinterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class CheckObject1 {

    public static void main(String...s){
	Supplier<LocalDate> s1=LocalDate::now;
	System.out.println(s1);
    }
}
