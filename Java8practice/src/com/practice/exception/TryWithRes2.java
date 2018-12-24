package com.practice.exception;

import java.util.Scanner;

public class TryWithRes2 {
    public static void main(String...s){
	try(Scanner s1 = new Scanner(System.in)){

	    s1.nextLine();
	}
	catch(Exception e){
	    s1.nextInt();
	}
	finally{
	    s1.nextInt();
	}
    }
}
//to show that the scope of resources ends at the end of try block
// and cannot get in explicit catch or finally block