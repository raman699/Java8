package com.practice.concurrentAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Check2 {
    private int count=0;
    private void increment(){
	synchronized(this){
	    System.out.println(++count+" ");
	}
    }
    public static void main(String...s){
	ExecutorService service=null;
	try{
	    service=Executors.newFixedThreadPool(20);
	    Check2 check2=new Check2();
	    for(int i=0;i<10;i++){
		service.submit(()->check2.increment());
	    }
	}finally{
	    if(service!=null) {
		service.shutdown();
	    }
	}
    }
}
//Although all the threads are still created and executed at the same time,
//they each wait at the synchronized
//block for the worker to increment and report the result before entering
