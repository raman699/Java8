package com.practice.collections.ArrayList;

import java.util.Arrays;
import java.util.List;



public class AsListCheck {
    public static void main(String...s){
	Integer i[]=new Integer[5];
	for(int j=0;j<5;j++){
	    i[j]=j;
	}
	List <Integer> ial=Arrays.asList(i);
	//ial.add(9);
	//it will give java.lang.UnsupportedOperationException
	System.out.println(ial);
    }
}
