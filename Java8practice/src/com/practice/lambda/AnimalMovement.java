package com.practice.lambda;
/*
 * purpose to check the accessibility of variables in lambda expressions
 */
public class AnimalMovement {
    static String walk="walk";

    String run="run";
    public static void main(String...s){
	String jump="jump";

	//usage of static variables in lambda exp
	Animal a = ()-> System.out.println(walk);
	a.movement();
	//So you can access the static variables in lambda exp
	//Animal chteeah =()-> System.out.println(run);
	//The error coming int he above line is an expected error
	//the same line will in an instance method
	AnimalMovement am=new AnimalMovement();
	am.movement();
    }


    void movement(){
	//Instance variables
	run="running";
	Animal chteeah =()-> System.out.println(run);
	chteeah.movement();
	//So you can access the instance variables in lambda exp
	//no concept of final here

    }
    void play(boolean baby){
	//For Effectively Final method parameters
	// If I comment the statement baby = false, then the code will not give error.
	//Because then it will become effectively final
	//Animal chteeah =()-> System.out.println(baby);
	baby=false;
	//chteeah.movement();
    }
    void run(){
	//For Effectively Final method parameters
	// If I comment the statement baby = false, then the code will not give error.
	//Because then it will become effectively final
	String bhag="bhag";
	bhag="run";
	Animal chteeah =()-> System.out.println(bhag);

	chteeah.movement();
    }
}

interface Animal{
    void movement();
}
/*
 *Four Types of variables:
 * 1).Static variables
 * 2).Instance variables
 * 3).Effectively Final method parameters
 * 4).Effectively Final local variables
 */
