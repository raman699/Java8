package com.practice.streams;

import java.util.stream.Stream;

public class MatchMethodCheck {

    public static void main(String...s){

	Stream<String> stream =Stream.generate(()->"monkey");
	//boolean match=stream.allMatch(String::isEmpty);
	//boolean match=stream.anyMatch(s1->s1.isEmpty());
	//boolean match=stream.anyMatch(String::contains("monkey"));
	boolean match=stream.noneMatch(s1->s1.isEmpty());
	//boolean match=stream.noneMatch(String::isEmpty);
	System.out.println(match);
    }
}

/*functioning of allMatch
 * In case of infinite stream
 * 1). If it is finding all the elements matching
 *     then the code will hang
 * 2). Whenever, at any point of time ,it gets some element which does not
 * match the predicate logic it will stop checking and return false.
 *So we can only except false by allMatch function in an infinite stream else code hangs

 *functioning of anyMatch
 * In case of infinite stream
 * 1). It it is not finding any elements matching, then the code will hang
 * 2). Whenever, at any point of time, it gets some element which matches the Predicate logic,
 *  it will output true
 *  so we can either except true, code hang
 *
 * functioning of noneMatch
 * 1).If it is not finding any the elements matching
 *     then the code will hang
 * 2). If it finds any element match the logic then it will print true
 */

