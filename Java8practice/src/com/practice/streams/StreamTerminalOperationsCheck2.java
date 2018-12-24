package com.practice.streams;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamTerminalOperationsCheck2 {

    public static void main(String...s){

	Stream<String> s1=Stream.of("raman","gagan");
	Optional<String> o1=s1.findAny();
	o1.ifPresent(System.out::println);
	Stream<Integer> i1=Stream.iterate(1, n->n+2);
	Optional<Integer> o2=i1.findFirst();
	o2.ifPresent(System.out::println);
	Stream<Integer> i2=Stream.iterate(1, n->n+2);
	Optional<Integer> o3=i2.findAny();
	o3.ifPresent(System.out::println);

	Stream<String> sForEach=Stream.of("raman","gagan","kamal");
	//The forEach method takes a consumer reference object
	sForEach.forEach(System.out::println);
	//the reduce method
	//1).
	Stream<Integer> si=Stream.of(1,2,3);
	BinaryOperator<Integer> biOperator=(a,b)->a*b;
	Integer ixx=si.reduce(1,biOperator);
	System.out.println(ixx);
	//2).
	Stream<Integer> si1=Stream.of(1,2,3);
	Optional<Integer> so2=si1.reduce(biOperator);
	so2.ifPresent(System.out::println);
	//3).
	Stream<Integer> si2=Stream.of(1,2,3);
	Integer ijjj=si2.reduce(1, biOperator, biOperator);
	System.out.println(ijjj);


    }
}
/*
 * If you apply terminal operations on a stream more than one in more than one statements
 * you will java.lang.IllegalStateException
 * Remember total there 7 methods categorization
 */
