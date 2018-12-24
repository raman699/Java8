package com.practice.lambda;

public class CheckSingleStatementLambdaExp {

    public static void main(String...s){

	Test t= a->  a;
    }
}
interface Test{
    int  check(int a);
}