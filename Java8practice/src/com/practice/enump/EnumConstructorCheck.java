//can enum have constructor other than private
package com.practice.enump;

public enum EnumConstructorCheck {


    EnumConstructorCheck( )    {

    };
    public static void main(String ...s){
	System.out.println("checking ");

    }
}
/*Dokha kha gye bachu
this is not a default constructor but certainly you
are declaring  an enum constant and then its block where you can define any methods
 */