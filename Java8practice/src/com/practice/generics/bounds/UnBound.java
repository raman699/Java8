package com.practice.generics.bounds;

import java.util.ArrayList;
import java.util.List;

public class UnBound {

    public static void main(String...s){
	List<?> ls  =new ArrayList<>();
	List<?> ls1  =new ArrayList<Integer>();
	List<?> ls2  =new ArrayList();
	List<?> ls3  =new ArrayList<?>();
    }
}
