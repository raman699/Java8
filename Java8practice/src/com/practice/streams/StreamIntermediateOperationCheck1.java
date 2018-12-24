package com.practice.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamIntermediateOperationCheck1 {

    public static void main(String[] args) {
	Stream<String> s1=Stream.of("raman","gagan","kamal","raman");
	Stream<String> s2=s1;
	/*1) filter method
	/*s1.filter(x->x.endsWith("an"));
	s1.forEach(System.out::println);
	The separate forEach method will not work because stream has already been started
	working
	so we would be using the below technique */
	s1.filter(x->x.endsWith("an")).forEach(System.out::println);
	/*2.distinct
	But the below will also not work because the reference s2 is referring the same stream s1 which have already been worked upon
	s2.distinct().forEach(System.out::println);
        so we will use a new Stream
	 */
	Stream<Integer> s3=Stream.of(1,2,3,4,1,2,3,4);
	s3.distinct().forEach(System.out::println);
	/*3 and 4
	 *limit and skip
	 *The two example shows how two different sequence of methods can give different results
	 */
	Stream<Integer> s4=Stream.iterate(1, n->n+5);
	s4.limit(5).skip(2).forEach(System.out::println);
	System.out.println();
	//Left by intention
	Stream<Integer> s5=Stream.iterate(1, n->n+5);
	s5.skip(5).limit(2).forEach(System.out::println);
	/*5 map method to make a new Stream base on a function passed in the map method
	 */
	System.out.println("output of map method");
	Stream<String> s6=Stream.of("raman","ram","gagan","ravi","aaaaaaa");
	Stream<Integer> s7=s6.map(String::length);
	s7.forEach(System.out::println);
	/*6 method flatMap
	 * */

	System.out.println("output of flatMap");
	String str[]={"raman","gagan","kamal"};
	String str1[]={"ss","dd","sss"};
	Stream<String[]> s8=Stream.of(str,str1);
	s8.flatMap(ar->Arrays.stream(ar)).forEach(System.out::println);
	//7) Method :sorted
	// 8 peek
    }


}
