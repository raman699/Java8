//making a method which will work in every caes
package com.practice.enump;

public enum EnumMethodCheck {

    VAR1,VAR2,VAR3;
    public static void main(String[] args) {
	EnumMethodCheck e1=EnumMethodCheck.VAR1;
	e1.check();
	EnumMethodCheck e2=EnumMethodCheck.valueOf("VAR2");
	e2.check();
	for(EnumMethodCheck e:EnumMethodCheck.values()){
	    e.check();
	}
    }
    public void check(){
	System.out.println("this is from check");
    }
}
