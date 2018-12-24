package com.practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfCheck {

    public static void main(String...s){
	String str="A";
	List<String> ls1= new ArrayList<String>();
	ls1.add("Assd");
	ls1.add("sds");

	Predicate<String> mthdRef= str::startsWith;
	//ls1.removeIf(mthdRef);
	//	ls1.removeIf(str::startsWith);
	ls1.removeIf("A"::startsWith);
	System.out.println(ls1);
    }
}
