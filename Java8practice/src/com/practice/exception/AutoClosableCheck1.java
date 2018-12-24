package com.practice.exception;

public class AutoClosableCheck1 {

    public static void main(String...s){

	//this is allowed
	try(Manager e = new Manager()){}
	//but this is not
	try(Employee e = new Employee()){}
    }
}
class Employee{
    int empId;
    String name;
}
class Manager implements AutoCloseable {

    @Override
    public void close() throws Exception,RuntimeException {
	System.out.println("close method ");

    }

}
//it can additionally throw any subclass of the Exception class defined in the parent interface
//or any runtime exception but no other checked exception