package com.practice.enump;

public enum EnumDeafultASConstructorCheck {
    Winter;

    public static void main(String...s){
	EnumDeafultASConstructorCheck n=new EnumDeafultASConstructorCheck();
    }
    EnumDeafultASConstructorCheck(){
	System.out.println("cons calling");
    }
}
/*Default Access specifier is allowed on the constructor
but you cannot make an instance of any enum */