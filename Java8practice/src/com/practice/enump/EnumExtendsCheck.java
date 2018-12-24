//this is to check wether enum extebds object class or not
//we will override the equals methods in it and check it if we can
package com.practice.enump;

public enum EnumExtendsCheck {

    WINTER;
    @Override
    public boolean equals(Object o){
	return true;
    }
    @Override
    public String toString(){
	return "this is to string";
    }
}
//Actually  what happen is other than toString all other object class methods have been
//overridden as final in Enum class which every enum extends  so you can't redefine them