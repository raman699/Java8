package com.practice.lambda;
/*
 * Check the syntax of implementation of generic interface
 */
public class Gorilla<T> implements Animals<T>{

    @Override
    public void movement(T t){
	System.out.println(t);
    }


}
interface Animals<T>{
    public void movement(T t);
}