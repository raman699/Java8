package com.practice.methodreferences;

import java.util.function.Predicate;

public class InstanceClassCheck {

    public static void main(String...s){

	Predicate<String> mthdRef =String::isEmpty;
	//mthdRef.test(5);
	/*the parameter should be String and would come at run time
	 *
	 */
    }
}

