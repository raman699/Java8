package com.practice.concurrentAPI;

import java.util.Arrays;

public class CheckParallelStream {

    public static void main(String[] args) {
	System.out.println("Serial Stream");
	Arrays.asList(1,2,3,4,5,6).stream().forEach(System.out::print);

	System.out.println();
	System.out.println("Parallel Stream");
	Arrays.asList(1,2,3,4,5,6).parallelStream().forEach(System.out::print);

	System.out.println();
	System.out.println("Parallel Stream Ordered");
	Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(System.out::print);

    }

}
