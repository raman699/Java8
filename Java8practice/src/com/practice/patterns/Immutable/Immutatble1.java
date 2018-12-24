package com.practice.patterns.Immutable;

import java.util.ArrayList;
import java.util.List;

public class Immutatble1 {

}
class MyString{
    private final String myString;
    private final int length;
    private final List<Character> list;
    public  MyString(String iniString,List check){
	this.myString=iniString;
	this.length=iniString.length();
	this.list=new ArrayList<Character>(check);
    }

}
//private data members and final dat members
//public constructor
//no setters
//as you can see we are creating new ArrayList and not just setting by this
//as when we do this we are using the same list object as it is mutable
//and if we change that it will alos be changed
// also see the extended classes do not change the value of the variables