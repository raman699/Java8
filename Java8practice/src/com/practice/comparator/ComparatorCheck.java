package com.practice.comparator;

import java.util.Comparator;

public class ComparatorCheck implements Comparator<Employee> {

    public static void main(String[] args) {


    }

    @Override
    public int compare(Employee e1, Employee e2) {
	int result = e1.name.compareTo(e2.name);
	if(result!=0) {
	    return result;
	}
	result=e1.empId-e2.empId;

	return result;
    }
}
class Employee{
    String name;
    int empId;
    Employee(){}
    Employee(String name,int empId){
	this.name=name;
	this.empId=empId;
    }
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public int getEmpId() {
	return empId;
    }
    public void setEmpId(int empId) {
	this.empId = empId;
    }
    @Override
    public String toString(){
	return name;
    }

}

// this is the normal implementation if you want one condition to follow other
// if the first one fails