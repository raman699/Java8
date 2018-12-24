package com.practice.collections.ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class EnsureCapacity {


    public static void main(String...s){
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.ensureCapacity(200);
	for(int i=0;i<10;i++){
	    al.add(i);
	}
	System.out.println(al);
    }
}
class Main
{
    public static void main(String[] args) throws Exception
    {

	ArrayList<Integer> arr = new ArrayList<Integer>();
	System.out.println("initial size = " + arr.size()); // 0
	System.out.println("initial capacity = " + getCapacity(arr));

	for (int i = 0; i < 11; i++)
	{
	    arr.add(i);
	}

	System.out.println("size = " + arr.size()); // 11
	System.out.println("capacity = " + getCapacity(arr));
    }

    static int getCapacity(ArrayList<?> l) throws Exception
    {
	Field dataField = ArrayList.class.getDeclaredField("elementData");
	dataField.setAccessible(true);
	return ((Object[]) dataField.get(l)).length;
    }
}
