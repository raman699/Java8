package com.practice.nestedclasses;

import com.practice.nestedclasses.StaticCheckClasss.StaticClass;

public class StaticCheckClasss {

    int var1;
    public static void  staticMethod(){
	//System.out.println(insVar);
	//enclosing class can never use members of nested classes
	//But you can make a static reference to the nested static
	//class in a static context/method
	StaticClass staticClass=new StaticClass();
	//	static class check{
	//
	//	} local inner class cannot be static
    }
    public  static class StaticClass{
	public int insVar;
	public static int insVar1;
	public static void check(){

	    staticMethod();
	    //This is illegal, we cannot make a reference to an
	    //instance variable in a static class
	    // System.out.println(var1);
	}
    }
    public void checkStaticInInstance(){
	//Also you can make a static reference to the nested static
	//class in a instance context/method
	StaticClass staticClass=new StaticClass();
    }
}
class CheckStaticRef{
    public static void main(String...s){

	//1st way of making a reference of static classes
	StaticCheckClasss staticCheckClasss =new StaticCheckClasss();
	StaticCheckClasss.StaticClass staticClass =new StaticClass ();
	//2nd way
	StaticCheckClasss.StaticClass staticClass1 =new StaticCheckClasss.StaticClass();
	//3rd way
	StaticClass staticClass2 =new StaticClass();
	//Illegal way
	//StaticCheckClasss.StaticClass staticClass2 =staticCheckClasss.new StaticClass();
	//This is an error as we cannot make instance of static class with an instance of the enclosing class

    }
}
//see also this com.pratice.forInheritanceRelated.CheckForStatic for check