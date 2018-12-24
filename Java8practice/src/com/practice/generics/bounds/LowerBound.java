package com.practice.generics.bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public static void main(String...s){
	List<? super IOException  > ex=new ArrayList<IOException>();
	ex.add(new IOException());
	ex.add(new Exception());
	ex.add(new FileNotFoundException());
	check(ex);
	List<Exception > ex1=new ArrayList<Exception>();
	check(ex1);
	List<? super IOException > ex2=new ArrayList<Exception>();
	check(ex1);



    }
    static void check(List<? super IOException> ls){}

}
