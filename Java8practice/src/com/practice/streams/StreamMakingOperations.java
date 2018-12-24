package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMakingOperations {

    public static void main(String...s){
	/*
	 * Generating a finite Stream
	 */
	//1).Creates an empty Stream
	Stream s1=Stream.<Integer>empty();
	//See the syntax :) ,so you can apply generic as below like previous programs
	Stream<String> s2=Stream.<String>empty();
	//2).Using the of method
	Stream<String> s3= Stream.of("rmana","gagan");
	Stream<Integer> s4= Stream.of(2);
	List<String> l1= new ArrayList<String>();
	//3).Uing Stream method of list
	Stream<String> s5=l1.stream();
	//4).Uing parallelstream method of list
	Stream<String> s6=l1.parallelStream();
	/*
	 *Making an infinite Steam
	 */
	/*1). The generate method takes an Supplier method
	It creates an infinite,sequential,Unordered Stream
	 */
	Stream<Double> sd=Stream.generate(Math::random);
	//2).The iterate method makes a infinite,sequential and ordered stream with sam seed value
	// It takes a Unary Operator reference in its vlaue
	Stream<Integer> si=Stream.<Integer>iterate(1,n-> n+2);
	si.limit(5).forEach(System.out::println);
	System.out.println("output for a stream made from different data types");
	Stream sc=Stream.of(1,"raman");
	//ya its okay it it would be giving a stream of a class extending object
	sc.forEach(System.out::println);
    }

}
