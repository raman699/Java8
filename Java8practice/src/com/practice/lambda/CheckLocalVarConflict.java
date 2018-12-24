package com.practice.lambda;

public class CheckLocalVarConflict {
    // Test t = a->a;
    //you can define like this also in instance level
    public static void main(String...s){
	int a;
	Test t = a->a;
    }
}
//so you cannot declare another variable with same name as defined in local method