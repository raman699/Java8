package com.practice.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

interface check23{
    public default ch(){}
}
class check1{
    int h;
}
class check2 extends check1 {
    @Override
    int h;
}
class check3<A>
{
    void setA(A a){

    }
    void setA(Object a){

    }
}
public class StringSearch {

    class check{}
    public enum Fruit{
	Apple;
    }
    public void check(){
	check n= new check();
    }
    private static void print(List<String> list)
    {
	for (Object object :list) {
	    System.out.println(object);
	}
    }
    public static void main(String...s){
	cg f= new cg();
	class cg{

	}
	for (int i=0;i<9;i++){
	    class inner{
		boolean ff(){}
	    }
	}
	new inner();
	final int [] i={0,8};
	i[0]=9;
	i[8]=9;
	int h =i.length;
	Thread.sleep(8);
	List list = new ArrayList();
	print(list);
	Fruit f= Fruit.Apple;
	List<String> list1 = new ArrayList();
	list.add("ab");
	list.add("ba");
	list.add("bd");
	list.add("aa");
	Comparator<String> comp=(a,b) -> b.compareToIgnoreCase(a);
	Collections.sort(list, comp);
	int index =Collections.binarySearch(list, "ab",comp);
	System.out.println(index);
	Stream<LocalDate> st = Stream.of(LocalDate.now());
	UnaryOperator<LocalDate> u =l->l;
	System.out.println(st.filter(l->l!=null).map(u));


    }
}
