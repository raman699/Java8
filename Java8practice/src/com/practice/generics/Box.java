package com.practice.generics;

public class Box<T> {
    final T x;
    Box(T x) {
	this.x = x;
    }
}

class Loophole {
    public static void main(String[] args) {
	Box<String>[] bsa = new Box<String>[3];
	Object[] oa = bsa;
	oa[0] = new Box<Integer>(3); // error not caught by array store check
	String s = bsa[0].x; // BOOM!
    }
}
//So if that was allowed we would get a class cast exception