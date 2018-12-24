package com.practice.streams;

import java.util.stream.Stream;

public class FindAnyFirstCheck {

    public static void main(String...s)
    {
	Stream<String> s1=Stream.of("moddnkey","ape","human");
	Stream<String> s2=Stream.generate(()->"chimp");
	//of gives a  finite length stream
	//generate gives an infinite length stream
	//s1.findAny().ifPresent(System.out::println);
	//s2.findAny().ifPresent(s3-> System.out.println(s3));
	s1.findFirst().ifPresent(System.out::println);
	s2.findFirst().ifPresent(s3-> System.out.println(s3));
	//again when I ran two methods one after one , we got an exception
    }
}
