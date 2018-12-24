package com.practice.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminalOperationsCheck1 {

    public static void main(String...s)
    {
	Stream<String> animals= Stream.of("monkey","ape","human","lion","elephant");
	//System.out.println(animals.count());
	Optional<String> animalMinOpt=animals.min((s1,s2)-> s1.length()-s2.length());
	animalMinOpt.ifPresent(System.out::println);
	Optional<?> animalEmptyMin=Stream.empty().min((s1,s2)->0);
	System.out.println(animalEmptyMin.isPresent());
	animalEmptyMin.ifPresent(System.out::println);//it will not print anything
	//or we can say the min method has returned us an empty optional
    }
}
//When we run the two statements on stream then we got the below the exception:
///Exception in thread "main" java.lang.IllegalStateException:
//stream has already been operated upon or closed