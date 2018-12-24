package com.practice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCheck2 implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
	Comparator<Employee> c= Comparator.comparing(e-> e.name);
	c= c.thenComparingInt(e->e.empId);
	//Comparator<Employee> c= Comparator.comparing(e-> e.empID);
	//this did not work because it excepts a comparable object in the key (name is a string
	//as it internally calls compareTo method

	return c.compare(e1, e2);
    }
    public static void main(String...s){

	List<Employee> employees=new ArrayList<Employee>();
	for(int i=0;i<10;i++)
	{
	    int random = (int )(Math.random() * 50 + 1);
	    employees.add(new Employee("Emp"+i,random));
	    if(i==5 || i==7 || i==8){
		employees.get(i).setName("Emp"+(i-5));
	    }
	}
	System.out.println(employees);
	Collections.sort(employees,new ComparatorCheck2());
	System.out.println(employees);
	//Comparator<Employee> c = Comparator.reverseOrder();
	//this is giving error as Employee should implement Comparable as it internally calls compareTo method
    }

}
//this is the 2nd implementation if you want one condition to follow other
//if the first one fails