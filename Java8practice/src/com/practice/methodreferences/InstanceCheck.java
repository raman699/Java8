package com.practice.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InstanceCheck {

    public static void main(String...s){
	String str="sfdd";
	Predicate<String> mthdRef =str::startsWith;
	System.out.println(mthdRef.test("sf"));
	//Predicate<String> mthdRef =str::isEmpty;
	//Above is an error ,read the desc below
	List<String> ls1= new ArrayList<String>();
	ls1.add("sfdvddv");
	ls1.add("sfdd");
	ls1.removeIf(mthdRef);
	System.out.println(ls1);

    }
}
/* Method reference can only be used in following scenarios:
1). Both the methods have same number of calling parameters
2). There is just one single call to the second method
 **This describes that you have to call the method
 * startWith with str and the parameter to startsWith comes at the time
 * of calling of the test method
 */