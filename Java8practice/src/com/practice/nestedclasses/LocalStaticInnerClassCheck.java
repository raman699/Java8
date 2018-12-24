package com.practice.nestedclasses;

public class LocalStaticInnerClassCheck {


    static void LSICMethod(){
	int h=8;
	class LSIC{

	    static final int h=9;
	    //you cannot use them in enclosing class
	    //it overrides the the scope is a variable of same name has
	    //been declared in the enclosing class
	    //same scenario will appear for member classes

	    //  static final void check(){} not legal
	    void check(){
		h=9;
	    }
	}
	class NSC{
	    //	    static void check(){
	    //
	    //	    }
	    //static methods can be defined in static nested class or top level class
	}
    }


}
