package com.practice.methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Supplier;

public class ConstructorCheck {

    public static void main(String...s){

	Supplier mthdRef= ArrayList::new;
	Supplier<ArrayList<String>> mthdRef1= String::new;
	Collections c;
	//Consumer<String> m= ArrayList:: new;
    }
}
