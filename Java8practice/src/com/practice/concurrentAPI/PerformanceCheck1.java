package com.practice.concurrentAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PerformanceCheck1 {

    private int process(int input){
	try{
	    Thread.sleep(10);
	}catch(Exception e){

	}
	return input+1;
    }

    public void processAllDataSerially(List<Integer> data){
	Function<Integer,Integer> mapper=a -> process(a);
	data.stream().map(a->process(a)).count();
    }

    public void processAllDataParallely(List<Integer> data){
	Function<Integer,Integer> mapper=a -> process(a);
	data.parallelStream().map(a->process(a)).count();
    }
    public static void main(String...s){
	PerformanceCheck1 performanceCheck1= new PerformanceCheck1();
	List<Integer> data = new ArrayList<Integer>();
	for(int i=0;i<5;i++) {
	    data.add(i);
	}
	long start = System.currentTimeMillis();
	performanceCheck1.processAllDataSerially(data);
	double time=(System.currentTimeMillis()-start)/1000.0;
	System.out.println("time taken "+ time);

	start = System.currentTimeMillis();
	performanceCheck1.processAllDataParallely(data);
	time=(System.currentTimeMillis()-start)/1000.0;
	System.out.println("time taken "+ time);

    }
}