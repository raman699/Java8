package com.practice.nestedclasses;

public class CheckAnonymousClass {
    public static void main(String...s){
	int i=19;
	new CheckAS(){

	    @Override
	    public void check() {
		System.out.println(h);
		System.out.println(i);

	    }

	};

    }

}
interface CheckAS{
    int h=9;
    void check();
}