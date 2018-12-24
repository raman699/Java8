package com.practice.methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StaticMethod {
    public static void main(String...s){
	Consumer<List<String>> mthRef=Collections::sort;
	Consumer<List> mthRef1=Collections::sort;
	//Consumer mthRef2=Collections::sort;
	//upper one will not work as The generic parameter have not been
	//passed so the accept method will take Object and will pass it to
	// sort method but the sort method accepts List, so it will give error.
	List<String> ls= new ArrayList<>();
	mthRef.accept(ls);
	List<List> l= new ArrayList<>();
	Consumer<List<? extends String>> mthRef1=Collections::sort;
	//Consumer<List<? extends List>> mthRef1=Collections::sort;
	//the upper one will not work because as sort require a reference which has implemented Comparable
	List<? extends List<? extends List<? extends List>>> ls2 =new ArrayList<>();
    }

}
//old and long way of implementing the above logic
class ConsumerCheck<T extends List<String>> implements Consumer<T>
{

    @Override
    public void accept(T t) {
	Collections.sort(t);
    }

}