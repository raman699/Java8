package com.practice.misc;

import java.util.Optional;

public class TestPattern {
    public  Optional<Double> average(int... scores){

	if(scores.length == 0) {
	    return Optional.empty();
	}
	int sum =0;
	for(int score :scores){
	    sum=sum+=score;
	}
	//return Optional.of((double) sum/scores.length);
	return Optional.of(checkAverage(sum,scores.length));
	//both will work same
    }
    double checkAverage(int sum,int length){
	return sum/length;
    }
    public Optional<Boolean> isOdd(Optional<Double> ocd){
	Optional<Boolean> o= Optional.ofNullable(ocd.get()%2==0);
	return o;
    }
    public static void main(String...s){
	OptionalCheck oc= new OptionalCheck();
	System.out.println(oc.average(90,100));
	System.out.println(oc.average());
	//System.out.println("checking the nullable "+oc.isOdd(oc.average()));
	//the above one will give the NoSuchElementException
	Optional<Double> opt=oc.average(90,1000);
	if(opt.isPresent()){
	    System.out.println(opt.get());
	}
	Optional<Double> opt1=oc.average();
	System.out.println(opt.get());
	//bad, will give java.lang.NoSuchElementException
	String value="sfs";
	Optional<String> o= (value==null)? Optional.empty():Optional.of(value);
	Optional o1=Optional.ofNullable(value);
    }
}
