package com.practice.objectclass.methods;

public class HashCodeCheck {
    public static void main(String...s){
	System.out.println("Starting");
	Manager m1=new Manager(23,34);
	System.out.println(m1);
	Manager m2=new Manager(78,34);
	System.out.println(m1);
	System.out.println(m1.hashCode());
	Manager m3=new Manager(23,34);
	System.out.println(System.identityHashCode(m1));

	System.out.println(m1.equals(m2));
    }

}
class Manager{
    int age;
    int phnNo;
    Manager(int age,int phnNo){
	//System.out.println("Constructor");
	this.age=age;
	this.phnNo=phnNo;
    }
    @Override
    public boolean equals(Object obj){
	//return 7;
	Manager m=(Manager)obj;
	if(m.age==this.age){
	    return true;
	}
	else{
	    return false;
	}
    }
    @Override
    public int hashCode(){
	System.out.println("called");
	return this.age+this.phnNo;

    }
}
/*Hashcode gives a different value of every object in java
 * it is always called when we call sop as it further calls toString method which inturn calls hashCode() method
But the interesting point is if we implement toString() method and do not call hasCode() method then don't except the result of hashcode to be returned
It helps in the comparisons of different objects
it is extensively used in Hashtables
If not unique then it can make the numbers of java objects to be same but still you can keep
then in unique buckets also.
It should be consistent and should work in synchronization of equals method

 */