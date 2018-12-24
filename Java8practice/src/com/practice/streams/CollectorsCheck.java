package com.practice.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsCheck {
    public static void mian(String...s){
	Stream<Integer> s1=Stream.of(1,2,3);
	String result=s1.collect(Collectors.joining(","));
    }
}
//joining works for only String Stream