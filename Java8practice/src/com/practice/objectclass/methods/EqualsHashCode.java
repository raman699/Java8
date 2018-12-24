package com.practice.objectclass.methods;

public class EqualsHashCode {
    String name ;
    int empId;
    int salary;
    EqualsHashCode(String name, int empId,int salary){
	this.name=name;
	this.empId=empId;
	this.salary=salary;
    }
    @Override
    public boolean equals(Object o){
	if(! (o instanceof EqualsHashCode)){
	    return false;
	}
	EqualsHashCode e= (EqualsHashCode)o;
	if(empId==e.empId){
	    return true;
	}
	return false;
    }
    @Override
    public int hashCode(){
	return empId+salary;
    }
    public static void main(String...s){
	EqualsHashCode e1=new EqualsHashCode("raman",1,2);
	EqualsHashCode e2=new EqualsHashCode("gagan",2,1);
	System.out.println(e1.equals(e2));
    }
}
