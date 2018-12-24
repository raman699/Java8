package com.practice.generics;

public class Limitations<T> {

    /*  T t =new T();
    1). This will not work as you should know that
     T is changed to Object at runtime so this declaration will
     always be Object t = new Object()
     */
    static int i[];
    //static T t[];
    public static T return1(T t ){
	return t;

    }
    /*2).This is also wrong
     * Please notice that the exact value of T will be coming at runtime or
     * you can say at the time of using them in your code
     * But it is worth mentioning that static things have to be present
     * at the compilation time beforehand
     * So
     */

}
