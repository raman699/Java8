package com.practice.forInheritanceRelated;
//and this too
import static com.practice.nestedclasses.StaticCheckClasss.StaticClass.check;
import static com.practice.nestedclasses.StaticCheckClasss.StaticClass.insVar;
//as this is an instance variable(insVar) you cannot statically import it
import static com.practice.nestedclasses.StaticCheckClasss.StaticClass.insVar1;

//this is legal
//import static com.practice.nestedclasses.StaticCheckClasss.StaticClass;
//this is also legal
import  com.practice.nestedclasses.StaticCheckClasss.StaticClass;
public class CheckForStatic {

    public static void main(String[] args) {
	check();
	StaticClass staticClass= new StaticClass();
	System.out.println(insVar1);
	System.out.println(insVar);
    }

}
