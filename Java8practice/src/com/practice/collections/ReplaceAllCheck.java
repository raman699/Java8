package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAllCheck {

    public static void main(String...s){

	List<String> ls= new ArrayList<String>();
	ls.add("1");
	ls.add("2");
	ls.add("3");
	ls.replaceAll(x-> "4");
	System.out.println(ls);
	//use unaryOperator when bth the parameter and the calling instance are of same data type

    }
}
