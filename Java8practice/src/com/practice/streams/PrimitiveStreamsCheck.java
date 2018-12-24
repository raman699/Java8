package com.practice.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;


//for primitive there are specific DoubleSupplier ot IntConsumer which are replaced in place of org
public class PrimitiveStreamsCheck {

    public static void main(String...s){
	System.out.println("checking iterate method");
	IntStream s1=IntStream.iterate(1,n->n+1);
	s1.limit(5).forEach(System.out::println);
	System.out.println("checking range method");
	IntStream s2=IntStream.range(1, 5);
	s2.forEach(System.out::println);
	System.out.println("checking rangeClosed method");
	IntStream s3=IntStream.rangeClosed(1, 5);
	s3.forEach(System.out::println);
	System.out.println("checking rangeClosed method for Double Stream");
	LongStream s4=LongStream.rangeClosed(1, 5);
	s4.forEach(System.out::println);
    }
}
