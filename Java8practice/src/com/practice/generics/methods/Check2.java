package com.practice.generics.methods;

public class Check2<T> {
    void check(T t){
	System.out.println("inside check method");
	System.out.println(t);
    }
    public static void main(String...s){
	Check2 check2=new Check2();
	check2.check("sdf");
	/* if you remember when we compile this formal type parameter is replace by Object class reference
	,so any type of parameter would work here if you have not stated the formal type parameter as
	Object is the parent of all classes ,so it will be able to store reference of any class
	 */
	Check2<String> check1=new Check2<>();
	Check2<Integer> check3=new Check2();
	//check3.check("ddf"); this would be also a compile time error
	//check1=check3;  this is an error
    }
}
/*The motive of this program is to check how is the calling of the formal type parameter method done
,what are different types of calling ways
 */