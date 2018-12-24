package com.practice.collections.ArrayList;

import java.util.ArrayList;

public class CapacityTest {
    public static void main(String...s){
	ArrayList al=new ArrayList();
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	al.add(1);
	ArrayList al1=new ArrayList();
	al1.addAll(al);
	System.out.println(al.size());
	System.out.println(al1.size());
	ArrayList al2 =new ArrayList(al1);
	System.out.println(al2.size());
    }
}
