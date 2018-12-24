package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CheckUserDefinedObjectsAreUnique {

    public static void main(String...s){

	Set<Employee> col= new HashSet<Employee>();
	Set<Employee> col1= new TreeSet<Employee>();
	List<Employee> col2=new ArrayList<Employee>();
	Employee e1=new Employee("Raman",1);
	Employee e2=new Employee("Raman",1);
	System.out.println(col2.add(e1));
	System.out.println(col2.add(e2));
	System.out.println(col2.add(e1));
	Collections.sort(col2);
	//mast h ye to
	//iska matlab list ,sort method bhi internally Comparable ko use krta h to isne to pehle hi error de diya
    }
}
/*the implementation gives an exception with TreeSet as it calls compareTo method where it excepts
  a reference of Comparable
  But the same implemenation will work with HashSet as it internally uses hashCode to compare
 */
class Employee {

    String name;
    int empId;
    Employee(String name,int empId){
	this.name=name;
	this.empId=empId;
    }
    //    @Override
    //    public int compareTo(Object o) {
    //	// TODO Auto-generated method stub
    //	return 0;
    //    }
}